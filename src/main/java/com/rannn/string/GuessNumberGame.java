package com.rannn.string;

import java.util.Scanner;

//小游戏
public class GuessNumberGame {
    private GuessNumberGame() {
    }

    public static void start() {
        int number = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("input a number range from 1-100:");
            int guessNumber = sc.nextInt();

            if (guessNumber > number) {
                System.out.println("your number is too big.");
            } else if (guessNumber < number) {
                System.out.println("your number is too small.");
            } else {
                System.out.println("Congratulations! you got it.");
                break;
            }
        }

    }
}
