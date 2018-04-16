package com.rannn.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

//获取功能
public class RegexDemo4 {
    public static void main(String[] args) {
        String s = "da jia ting wo shuo,jin tian yao xia yu";
        String regex = "\\b\\w{3}\\b";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        //先find再group
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
