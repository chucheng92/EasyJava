package com.tinymood.leetcode;

import java.util.HashMap;

public class IsomorphicStrings {
	public static void main(String[] args) {
		System.out.println(new IsomorphicStrings().isIsomorphic2("paper", "title"));
		System.out.println(new IsomorphicStrings().isIsomorphic2("aa", "bb"));
	}
	
	//ascii法
	public boolean isIsomorphic(String s, String t) {
		if (s==null || t==null) return false;
		if (s.length()==1 || t.length()==1) return true;
		int[] m = new int[512];
        for (int i = 0; i < s.length(); i++) {
            if (m[s.charAt(i)] != m[t.charAt(i)+256]) return false;
            m[s.charAt(i)] = m[t.charAt(i)+256] = i+1;
        }
        return true;
	}
	
	//hashmap法
	public boolean isIsomorphic2(String s, String t) {
		if (s==null || t==null) return false;
		if (s.length()==1 || t.length()==1) return true;
		HashMap<Character, Character> map = new HashMap<Character,Character>();
		for (int i=0; i<s.length(); i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			if (map.containsKey(a)) {
				if (map.get(a).equals(b))
					continue;
				else
					return false;
			} else {
				if (!map.containsValue(b))
					map.put(a, b);
				else
					return false;
			}
		}
		return true;
	}
	
}
