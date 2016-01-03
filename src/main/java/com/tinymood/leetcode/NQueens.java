package com.tinymood.leetcode;
import java.util.ArrayList;
import java.util.List;

public class NQueens {
	public static void main(String[] args) {
		System.out.println("***迭代回溯法***");
		List<List<String>> res = new ArrayList<>();
		res = new NQueens().iterativeBacktrackNqueens(4);
		for (List<String> a: res)
			System.out.println(a);
		System.out.println("***递归回溯法***");
		List<List<String>> res2 = new ArrayList<>();
		res2 = new NQueens().solveNqueens(4);
		for (List<String> a: res2)
			System.out.println(a);
		
	}
	
	//处理
	private List<String> process(int n, int[] col) {
		List<String> list = new ArrayList<>();
		char[][] board = new char[n+1][n+1];
		for (int i=1; i<=n; i++)
			for (int j=1; j<=n; j++)
				board[i][j]='.';
		for (int i=1; i<=n; i++)
			board[i][col[i]] = 'Q';
		StringBuilder[] sb = new StringBuilder[n+1];
		for (int i=1; i<sb.length; i++)
			sb[i] = new StringBuilder("");
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n; j++) 
				sb[i].append(board[i][j]);
			list.add(sb[i].toString());
		}	
		return list;
	}
	
	//放置是否合法
	private boolean place(int k, int[] col) {
		for (int j=1; j<k; j++) {
			if (col[k]==col[j] || Math.abs(col[k]-col[j])==Math.abs(k-j))
				return false;
		}
		return true;
	}
	
	//迭代回溯  leetcode AC 11ms
	public List<List<String>> iterativeBacktrackNqueens(int n) {
		int col[] = new int[n+1];
		List<List<String>> res = new ArrayList<>();
		int k=1;
		while (k>0) {
			while (col[k]<n) {
				col[k]+=1;
				if (place(k, col)) {
					if (k==n)
						res.add(process(n, col));
					else {
						k++;
						col[k]=0;
					}
				}
			}
			--k;
		}
		return res;
	}
	
	//递归回溯法 leetcode AC 8ms
	private void recursiveBacktrackNqueens(int k, List<List<String>> res,int n,int[] col) {
		if (k>n) {
				res.add(process(n, col));
		} else {
			for (int i=1; i<=n; i++) {
				col[k]=i;
				if (place(k, col))
					recursiveBacktrackNqueens(k+1,res,n,col);
			}
		}
	}
	
	//N皇后
	public List<List<String>> solveNqueens(int n) {
		List<List<String>> res = new ArrayList<>();
		int[] col = new int[n+1];
		recursiveBacktrackNqueens(1,res,n,col);
		return res;
	}
}
