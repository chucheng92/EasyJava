package com.rannn.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DayInThisWorld2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("please input your birthday:");
        String line = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(line);

        long myTime = d.getTime();
        Calendar rightNow = Calendar.getInstance();
        long nowTime = rightNow.getTimeInMillis();

        long time = nowTime - myTime;
        long day = time / 1000 / 60 / 60 / 24;

        System.out.println("你来到这个世界一共" + day + "天了。");
        System.out.println(DayInThisWorld2.class);
        System.out.println(DayInThisWorld2.class.getName());
    }
}
