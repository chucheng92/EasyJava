package com.tinymood.job.netease;

import java.util.*;

public class Mushroom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int[] x = new int[k+1];
			int[] y = new int[k+1];
			for (int i = 1; i <= k; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			
			int[] count = new int[n*m];
			int pos = 1;
			for (int i = 1; i <= n-2; i+=3) {
				for (int j = 1; j <= m-2; j+=3) {
					pos++;
					for (int t = 1; t <= k; t++) {
						if (x[t] >= i && x[t] <= i+2 && y[t] >= j && y[t] <= j+2) {
							count[pos]++;
						} 
					}
				}
			}
			
			Arrays.sort(count);
			
			for (int i = 0; i < count.length; i++)
				System.out.println(count[i] + " ");
			
		}
	}
}
