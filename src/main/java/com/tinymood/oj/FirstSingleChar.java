package com.tinymood.oj;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstSingleChar {
	public static void main(String[] args) {
		String a = "";
		System.out.println(findFirstSingleChar2(a));
	}
	
	public static Character findFirstSingleChar1(String s) {
		if (null == s)
			return null;
		if (s.length() < 2)
			return s.charAt(0);
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), 1);
			else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		
		Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Character, Integer> entry = iterator.next();
			Character key = entry.getKey();
			Integer value = entry.getValue();
			if (value == 1)
				return key;
		}
		
		return null;
	}
	
	public static Character findFirstSingleChar2(String s) {
		if (null == s || s == "")
			return null;
		if (s.length() < 2)
			return s.charAt(0);
		int[] num = new int[26];
		int[] index = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			num[s.charAt(i)-'a']++;
			if (index[s.charAt(i)-'a'] == 0) {
				index[s.charAt(i)-'a'] = i;
			}
		}
		
		int min = 100;
		for (int i = 0; i < 26; i++) {
			if (1 == num[i]) {
				min = (index[i] < min ? index[i] : min);
			}
		}
		if (min != 100)
			return s.charAt(min);
		return null;
	}
}
