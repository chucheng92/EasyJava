package com.rannn.scanner;

//ScannerTest

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.nextLine();

        System.out.println("a:" + a + ",b:" + b);
    }
}
