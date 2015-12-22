package com.tinymood.leetcode;

public class ZigZag {
	public static void main(String[] args) {
		String s = "";
		String ends = new ZigZag().convert(s, 2);
		
		System.out.println(ends);

	}

	public String convert(String s, int rows) {
		if (s == null || s=="" || s.length()==1)
			return s;
		if (rows==1) return s;
		StringBuilder[] res = new StringBuilder[rows];
		for (int i = 0; i < res.length; i++)
			res[i] = new StringBuilder("");
		for (int i = 0; i <= rows - 1; i++) {
			if (i == 0 || i == rows - 1) {
				for (int j = i; j < s.length(); j += 2 * rows - 2) {
					res[i].append(s.charAt(j));
				}
			} else {
				int count = 0;
				for (int j = i; j < s.length();) {
					if (count == 0) {
						res[i].append(s.charAt(j));
						j += 2 * rows - 2 - 2 * i;
						count=1;
					} else {
						res[i].append(s.charAt(j));
						j += 2 * i;
						count=0;
					}
				}
			}
		}
		StringBuilder endres = new StringBuilder("");
		for (int i=0; i<res.length; i++)
			 endres.append(res[i].toString());
		
		return endres.toString();
	}
}
