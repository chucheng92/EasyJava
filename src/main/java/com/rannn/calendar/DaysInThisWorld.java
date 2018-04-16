package com.rannn.calendar;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DaysInThisWorld {
	public static void main(String[] args) throws ParseException {
		//1.出生天数
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("input your birthday:");
//		String line = sc.nextLine();
//		
//		//字符串转换为一个日期
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date d = sdf.parse(line);
//		
//		//日期得到毫秒值
//		long myTime = d.getTime();
//		
//		long nowTime = System.currentTimeMillis();
//		
//		long time = nowTime-myTime;
//		
//		long day = time/1000/60/60/24;
//		
//		System.out.println("你来到这个世界一共"+day+"天了。");
		
		//2.日期转字符串
		Date d = new Date();
		
		//默认模式+给定模式
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String s1 = sdf1.format(d);
		String s2 = sdf2.format(d);
		
		System.out.println(d);
		System.out.println(s1);
		System.out.println(s2);
	}	
}
