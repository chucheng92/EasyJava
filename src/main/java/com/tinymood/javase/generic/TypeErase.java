package com.tinymood.javase.generic;

import java.util.HashMap;
import java.util.Map;


public class TypeErase {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("hello", "你好");
		map.put("world", "世界");
		
		System.out.println(map.get("hello"));
		System.out.println(map.get("world"));
	}
}

// ===========================
// 反编译后的结果

//package com.tinymood.javase.generic;
//
//import java.io.PrintStream;
//import java.util.HashMap;
//import java.util.Map;
//
//public class TypeErase
//{
//
//	public TypeErase()
//	{
//	}
//
//	public static void main(String args[])
//	{
//		Map map = new HashMap();
//		map.put("hello", "你好");
//		map.put("world", "世界");
//		System.out.println((String)map.get("hello"));
//		System.out.println((String)map.get("world"));
//	}
//}