package com.rannn.math;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("50");

        System.out.println(bi1.add(bi2));
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(bi2));

        BigInteger[] biArray = bi1.divideAndRemainder(bi2);
        System.out.println("商:" + biArray[0]);
        System.out.println("余数:" + biArray[1]);
    }
}
