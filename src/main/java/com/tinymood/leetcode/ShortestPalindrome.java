package com.tinymood.leetcode;

public class ShortestPalindrome {
	public static void main(String[] args) {
		String s = "abcd";

		System.out.println(new ShortestPalindrome().shortestPalindrome2(s));
	}
	
	// TLE法
	public String shortestPalindrome(String s) {
		if (isPalindrome(s, 0, s.length()-1))
			return s;
		
		for (int i=s.length()-1,count=0; i>0; i--) {
			int j = i+count;
			s = s.charAt(j)+s;
			count++;
			if (count>=2) {
				StringBuffer sb = new StringBuffer(s.substring(0, count));
				s = s.substring(count, s.length());
				s = sb.reverse().toString()+s;
			}
			if (isPalindrome(s, 0, s.length()-1))
				return s;
			else {
				StringBuffer sb = new StringBuffer(s.substring(0, count));
				s = s.substring(count, s.length());
				s = sb.reverse().toString()+s;
			}
		}
		return s;
	}
	
	private boolean isPalindrome(String s, int begin, int end) {
		if (begin<0) return false;
		while (begin < end) {
			if (s.charAt(begin++)!=s.charAt(end--))
				return false;
		}
		
		return true;
	}
	
	public String shortestPalindrome2(String s) {
		int j = 0;
		for (int i=s.length()-1; i>=0; i--) {
			if (s.charAt(i)==s.charAt(j)) j+=1;
		}
		if (j==s.length()) return s;
		String suffix = s.substring(j);
		return new StringBuffer(suffix).reverse().toString()+shortestPalindrome2(s.substring(0, j))+suffix;
	}
}
