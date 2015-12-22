package com.tinymood.leetcode;

public class ValidPalindrome {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(new ValidPalindrome().isPalindrome(s));
	}
	
	public boolean isPalindrome(String s) {
		if (s==null) return false;
		String regex = "[^a-zA-Z0-9]+";
		String tmps = s.replaceAll(regex, "").toLowerCase();
		int begin = 0, end = tmps.length()-1;
		while (begin<end) {
			if (tmps.charAt(begin++)!=tmps.charAt(end--))
				return false;
		}
		return true;
	}
}
