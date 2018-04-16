package com.rannn.string;

import java.util.Scanner;

/*
 *	模拟用户登录 + 玩游戏
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";

        for (int i = 0; i < 3; ++i) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please input username:");
            String name = sc.nextLine();
            System.out.println("please input password:");
            String pswd = sc.nextLine();

            if (name.equalsIgnoreCase(username) && pswd.equals(password)) {
                System.out.println("Login success, u can play game now!");
                GuessNumberGame.start();
                break;
            } else {
                if (2 - i == 0) {
                    System.out
                            .println("Account is locked, pls contact with admin.");
                } else {
                    System.out.println((2 - i) + " times remaining.");
                }
            }
        }
    }
}
