package com.rannn.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
 * 处理CSV文件读取
 */
public class CSVUtil {

    public static void main(String[] args) {
        File file = new File("src/main/resources/文件地址列表-2016-01-14.csv");
        String fileId = format(core(file, "01.01_计算机基础(计算机概述)"));
        System.out.println(fileId);
    }

    public static String format(String str) {
        String regex = "[\\s\"]+";
        String res = str.replaceAll(regex, "");

        return res;
    }

    public static String core(File file, String srcTitle) {
        String fileId = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "GB18030"));
//            br.readLine();
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] res = line.split(",");
                String targetTitle = res[1];
                fileId = res[0];
                if (targetTitle.equals(srcTitle)) {
                    break;
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileId;
    }
}

