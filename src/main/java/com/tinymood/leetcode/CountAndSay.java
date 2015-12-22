package com.tinymood.leetcode;

public class CountAndSay {
	public static void main(String[] args) {
		System.out.println(new CountAndSay().countAndSay(1));
		System.out.println(new CountAndSay().countAndSay(2));
		System.out.println(new CountAndSay().countAndSay(3));
		System.out.println(new CountAndSay().countAndSay(4));
		System.out.println(new CountAndSay().countAndSay(5));
	}
	
	public String countAndSay(int n) {
		StringBuilder curr = new StringBuilder("1");
		StringBuilder prev;
		int count;
		char say;
		for (int i=1; i<n; i++) {
			prev=curr;
			curr = new StringBuilder();
			count=1;
			say=prev.charAt(0);
			for (int j=1; j<prev.length(); j++) {
				if (prev.charAt(j)!=say) {
					curr.append(count).append(say);
					count=1;
					say=prev.charAt(j);
				} else {
					count++;
				}
			}
			curr.append(count).append(say);
		}
		
		return curr.toString();
	}
}
