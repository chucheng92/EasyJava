package com.tinymood.leetcode;

public class MultiplyStrings {
	public static void main(String[] args) {
		String num1="2323231231231231323",num2="0";
		System.out.println(new MultiplyStrings().multiply(num1, num2));
	}
	public String multiply(String num1, String num2) {
		if (num1.length()==0 || num2.length()==0) return "0";
		if (num1.length()==1 && num1.charAt(0)=='0') return "0";
		if (num2.length()==1 && num2.charAt(0)=='0') return "0";
		int n1=num1.length(),n2=num2.length();
		int[] end = new int[n1+n2];
		for (int i=n1-1; i>=0; i--) {
			for (int j=n2-1; j>=0; j--) {
				end[i+j+1]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
			}
		}
		int carry=0;
		StringBuilder sb = new StringBuilder();
		for (int i=n1+n2-1; i>=0; i--) {
			int tail = (end[i]+carry)%10;
			carry = (end[i]+carry)/10;
			sb.append(tail);
		}
		sb.reverse();
		if (sb.charAt(0)=='0') sb.deleteCharAt(0);
		return sb.toString();
	}
}
