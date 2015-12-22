package com.tinymood.leetcode;

//Reverse Integer
public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(new ReverseInteger().reverse(1230001234));
	}
	
	public int reverse(int x) {
		int res = 0;
		int tail = 0;
		int newRes = 0;
		while (x!=0){
			tail = x%10;
			newRes = res*10+tail;
			if ((newRes-tail)/10!=res) return 0;
			res = newRes;
			x = x/10;
		}
		
		return res;
	}
}
