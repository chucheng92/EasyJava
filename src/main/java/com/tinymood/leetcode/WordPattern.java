package com.tinymood.leetcode;

import java.util.HashMap;

// 单词匹配
public class WordPattern {

	public static void main(String[] args) {
		System.out.println(new WordPattern().wordPattern("abba", "dog cat cat dog"));
	}

	public boolean wordPattern(String pattern, String str) {
		if (pattern == null || pattern == "")
			return true;
		String[] strArr = str.split(" ");
		if (strArr.length != pattern.length())
			return false;
		HashMap<Character, String> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			if (!map.containsKey(pattern.charAt(i))) {
				if (map.containsValue(strArr[i]))
					return false;
				else
					map.put(pattern.charAt(i), strArr[i]);
			} else {
				if (!map.get(pattern.charAt(i)).equals(strArr[i]))
					return false;
			}
		}
		return true;
	}
}
