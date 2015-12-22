package com.tinymood.leetcode;

public class StrStr {
	public static void main(String[] args) {
		String haystack = "";
		String needle = "";
		System.out.println(new StrStr().strStr(haystack, needle));
	}
	
	public int strStr(String haystack, String needle) {
		// indexOf·½·¨
//		if (haystack.length()==0 && needle.length()==0) return 0;
//		return haystack.indexOf(needle);
		
		// substring·¨
		int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1-l2;
        for (int i=0; i<=threshold; i++) {
        	if (haystack.substring(i,i+l2).equals(needle))
        		return i;
        }
        return -1;
	}
}
