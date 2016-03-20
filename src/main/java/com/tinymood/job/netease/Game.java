package com.tinymood.job.netease;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
         	int monsterNum = sc.nextInt();
        	int skillValue = sc.nextInt();
        	int[] monsters = new int[monsterNum];
        	for (int i = 0; i < monsters.length; i++) {
				monsters[i] = sc.nextInt();
                if (skillValue >= monsters[i]) {
                    skillValue += monsters[i];
                } else {
                    skillValue += gcd(skillValue, monsters[i]);
                }
        	}
            System.out.println(skillValue);
        }
        sc.close();
	}
    
    private static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (0 == b) {
			return a;
        }
        return gcd(b, a%b);
        
    }
    
}
