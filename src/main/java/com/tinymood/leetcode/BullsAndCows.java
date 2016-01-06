package com.tinymood.leetcode;

public class BullsAndCows {
	public static void main(String[] args) {
		System.out.println(new BullsAndCows().getHint("1123", "0111"));
		System.out.println(new BullsAndCows().getHint("1807", "7810"));
		System.out.println(new BullsAndCows().getHint("0", "1"));
		System.out.println(new BullsAndCows().getHint("1122", "2211"));
	}

	public String getHint(String secret, String guess) {
		int[] count = new int[10];
		int bulls = 0;
		int cows = 0;
	
		for (int i=0; i<guess.length(); i++) {
			if (secret.charAt(i)==guess.charAt(i)) {
				bulls++;
			} else {
				if (count[secret.charAt(i)-'0']-- > 0) cows++;
				if (count[guess.charAt(i)-'0']++ < 0) cows++;
			}
		}
		return bulls + "A" + cows + "B";
	}
}
