package com.rannn.regex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class RegexDemo5 {

    public static String format(String str) {
        String regex = "[\\s\"]+";
        String res = str.replaceAll(regex, "");

        return res;
    }

    public static String core() {
        String fileId = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:/New/aa.csv"), "GBK"));
            br.readLine();
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] res = line.split(",");
                String title = res[1];
                fileId = res[0];
                System.out.println(fileId);
                System.out.println(title);
                String myTitle = "01.01_计算机基础(计算机概述)";
                System.out.println(myTitle);
                System.out.println("判断成功");
                System.out.println(fileId);
                break;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileId;
    }

    public static void main(String[] args) {
        String fileId = format("	146519\"78969256225453");
        System.out.println(fileId.trim());
    }

}
