package com.tinymood.leetcode;

import java.util.Arrays;

/*
 * Problem 242 Anagram
 */
public class Anagram {
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		System.out.println(new Anagram().isAnagram(s, t));
	}
	
	// Solution1 sort
	public boolean isAnagram(String s, String t) {
		if (s.length()!=t.length())
			return false;
		int[] a = new int[s.length()];
		int[] b = new int[t.length()];
		
		for (int i=0; i<s.length(); i++) {
			a[i] = s.charAt(i);
			b[i] = t.charAt(i);
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for (int i=0; i<a.length; i++) {
			if (a[i]!=b[i])
				return false;
		}
		
		return true;
	}
	
	// Solution2
	public boolean isAnagram2 (String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) 
        	if (i != 0) return false;
        return true;
    }

}
