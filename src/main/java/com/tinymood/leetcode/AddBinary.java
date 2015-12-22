package com.tinymood.leetcode;

public class AddBinary {
	public static void main(String[] args) {
		System.out.println(new AddBinary().addBinary("1", "111"));
	}
	
	public String addBinary(String a, String b) {
		if (a==null || a.isEmpty()) return b;
		if (b==null || b.isEmpty()) return a;
		
		StringBuilder sb = new StringBuilder();
		int i = a.length()-1, j=b.length()-1;
		int carry = 0;
		
		while (i>=0 || j>=0 || carry==1) {
			int aBit = (i>=0)?a.charAt(i--)-'0':0;
			int bBit = (j>=0)?b.charAt(j--)-'0':0;
			int result = aBit^bBit^carry;
			carry = (aBit+bBit+carry>=2)?1:0;
			sb.append(result);
		}
		return sb.reverse().toString();
	}
}
