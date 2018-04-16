package com.rannn.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算两个日期的差距
 *
 * @author 哓哓
 */
public class TwoDateGap {
    public static void main(String[] args) {
        String date1 = "1989-01-01";
        String date2 = "1990-01-01";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d1 = sdf.parse(date1);
            Date d2 = sdf.parse(date2);
            Long gap = d2.getTime() - d1.getTime();
            System.out.println(gap);
            System.out.println(gap / (1000 * 3600 * 24));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
