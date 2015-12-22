package com.tinymood.leetcode;

public class MyAtoI {
	public static void main(String[] args) {
		String str = "     010";
		int res = myAtoi(str);
		System.out.println(res);
	}
	
	public static int myAtoi(String str) {
		int index=0, sign=1, total=0;

		//step1. Empty String
		if (str.length() == 0)
			return 0;

		//step2. Remove Spaces and previous zero
		while (str.charAt(index)==' ' && index<str.length()) {
			index++;
		}

		//step3. Handle signs
		if (str.charAt(index)=='+' || str.charAt(index)=='-') {
			sign = str.charAt(index)=='+'?1:-1;
			index++;
		}

		//Convert string and avoid overflow
		while (index<str.length()) {
			int digit=str.charAt(index)-'0';
			if (digit<0 || digit>9)
				break;

			if (Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE%10 < digit) {
				return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
			}
			total = total*10+digit;
			index++;
		}

		return sign*total;
	}
}
