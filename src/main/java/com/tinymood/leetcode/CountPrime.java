package com.tinymood.leetcode;

public class CountPrime {
	public static void main(String[] args) {
		System.out.println(new CountPrime().countPrimes(10));
	}

	private boolean isPrime(int n) {
		if (n == 1)
			return false;
		int k = (int) Math.sqrt(n * 1.0);
		for (int i = 3; i <= k; i+=2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public int countPrimes(int n) {
		if (n<=2) return 0;
		int count = 0;
		n=n-1;
		while (n > 1) {
			if (n==2)
				count++;
			if (n%2 != 0 && isPrime(n) == true) {
				count++;
			}
			n--;
		}
		return count;
	}
	
}
