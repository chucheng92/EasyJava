package com.rannn.math;

import java.util.Scanner;

//任意范围的随机数
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input start number:");
        int startNum = sc.nextInt();
        System.out.println("input end number:");
        int endNum = sc.nextInt();

        for (int i = 0; i < 100; ++i) {
            int num = getRandom(startNum, endNum);
            System.out.println(num);
        }
    }

    public static int getRandom(int start, int end) {

        int randNum = (int) (Math.random() * (end - start + 1) + start);

        return randNum;
    }
}
