package com.tinymood.leetcode;

public class LengthofLastWord {
	public static void main(String[] args) {
		String s = " abdcdcb";
		System.out.println(new LengthofLastWord().lengthOfLastWord(s));
	}
	
	public int lengthOfLastWord(String s) {
		if (s==null || s.length()==0) return 0;
		if (s.replaceAll(" ", "").length()==0) return 0;
		String[] strArr = s.split(" ");
		return strArr[strArr.length-1].length();
	}
}
