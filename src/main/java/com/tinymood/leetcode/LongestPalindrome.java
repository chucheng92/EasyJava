package com.tinymood.leetcode;

// Longest Palindromic Substring
public class LongestPalindrome {
	public static void main(String[] args) {
		String s = "aaa2434aaaaaa32423dsdfadf45454545454adsadadfsdfsaaaaaaaaa3424aaaaaaaaaa";
		System.out.println(new LongestPalindrome().longestPalindrome(s));
	}
	
	public String longestPalindrome(String s) {
		String res = "";
		int currLen = 0;
		for (int i=0; i<s.length(); i++) {
			if (isPalindrome(s, i-currLen, i)) {
				res = s.substring(i-currLen, i+1);
				currLen = currLen+1;
			}
			else if (isPalindrome(s, i-currLen-1, i)) {
				res = s.substring(i-currLen-1, i+1);
				currLen = currLen +2;
			}
		}
		return res;
	}
	
	private boolean isPalindrome(String s,int begin, int end) {
		if (begin<0) return false;
		while (begin<end) {
			if (s.charAt(begin++)!=s.charAt(end--))
				return false;
		}
		
		return true;
	}
}
