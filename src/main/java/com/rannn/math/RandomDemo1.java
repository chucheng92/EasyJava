package com.rannn.math;

import java.util.Random;

//默认种子
public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; ++i) {
            int num = r.nextInt(10) + 1;
            System.out.println(num);
        }
    }
}
