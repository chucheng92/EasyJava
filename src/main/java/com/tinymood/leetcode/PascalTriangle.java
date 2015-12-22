package com.tinymood.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		List<List<Integer>> res = new ArrayList<>();
		res=new PascalTriangle().generate(3);
		for (List<Integer> list:res)
			System.out.println(list);
	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
		if (numRows<=0) return res;
		for (int i=0; i<numRows; i++) {
			List<Integer> rows = new ArrayList<>();
			for (int j=0; j<i+1; j++) {
				if (j==0||j==i)
					rows.add(1);
				else
					rows.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
			}
			res.add(rows);
		}
		
		return res;
	}
}
