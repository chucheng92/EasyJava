package com.rannn.calendar;

import java.util.Calendar;
import java.util.Scanner;

//获取一年的二月多少天
public class DaysOfFeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input year:");
        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        c.add(Calendar.DATE, -1);

        System.out.println(c.get(Calendar.DATE));
    }
}
