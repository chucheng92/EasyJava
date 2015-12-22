package com.tinymood.lucene;

import java.io.File;
import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.TextField;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.wltea.analyzer.lucene.IKAnalyzer;

public class LuceneTest {
	// 创建索引位置
	private String indexDir = "D:/indexDir";
	// Field名称
	private String fieldName = "content";

	/**
	 * 创建索引
	 * 
	 * @param analyzer分词器
	 * @throws IOException
	 * 
	 */
	public void createIndex(Analyzer analyzer) throws IOException {
		//待索引的文本数据
		String[] contentArr = { "考进清华北大是许多人的梦想", "清华是中国著名高等学府",
				"清华大学是世界上最美丽的大学之一" };
		//创建或打开索引目录
		Directory directory = FSDirectory.open(new File(indexDir));
		//创建IndexWriter
		IndexWriterConfig conf = new IndexWriterConfig(Version.LUCENE_43, analyzer);
		IndexWriter indexWriter = new IndexWriter(directory,conf);
		
		//遍历数组创建索引
		for (String text:contentArr) {
			//创建document并添加field
			Document document = new Document();
			document.add(new TextField(fieldName, text, Field.Store.YES));
			//将document加入索引中
			indexWriter.addDocument(document);
		}
		indexWriter.commit();
		indexWriter.close();
		directory.close();
	}
	
	/**
	 * 从索引中检索
	 * @param sentence 检索语句
	 * @param analyzer 分词器
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public void searchIndex(String sentence,Analyzer analyzer) throws IOException, ParseException {
		//创建或打开索引目录
		Directory directory = FSDirectory.open(new File(indexDir));
		IndexReader reader = IndexReader.open(directory);
		IndexSearcher searcher = new IndexSearcher(reader);
		//使用查询解析器创建query
		QueryParser parser = new QueryParser(Version.LUCENE_43, fieldName, analyzer);
		Query query = parser.parse(sentence);
		//输出解析后的查询语句
		System.out.println("查询语句："+query.toString());
		//从索引中搜索得分前十的文档
		TopDocs topDocs = searcher.search(query, 10);
		ScoreDoc[] scoreDoc = topDocs.scoreDocs;
		System.out.println("共检索到"+topDocs.totalHits+"条匹配结果");
		for (ScoreDoc sd: scoreDoc) {
			//根据id获取document
			Document d = searcher.doc(sd.doc);
			System.out.println(d.get(fieldName)+"score:"+sd.score);
			//查看文档得分解析
			System.out.println(searcher.explain(query, sd.doc));
		}
		reader.close();
		directory.close();
	}
	
	public static void main(String[] args) throws IOException, ParseException {
		//创建分词器
		Analyzer analyzer = new IKAnalyzer(true);
		
		LuceneTest luceneTest = new LuceneTest();
		//创建索引
		luceneTest.createIndex(analyzer);
		//搜索
		luceneTest.searchIndex("梦想上清华", analyzer);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
