package com.rannn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{3}");
        String charSequence = "123-234345-234-00";
        Matcher matcher = pattern.matcher(charSequence);

        // 虽然匹配失败，但由于charSequence里面的"123"和pattern是匹配的,所以下次的匹配从位置4开始
        print(matcher.matches());

        // 测试匹配位置
        matcher.find();
        print(matcher.start());
        print(matcher.end());

        // 使用reset方法重置匹配位置
        matcher.reset();
        // 第一次find匹配以及匹配的目标和匹配的起始位置
        print(matcher.find());
        print(matcher.group() + " - " + matcher.start());

        // 第二次find匹配以及匹配的目标和匹配的起始位置
        print(matcher.find());
        print(matcher.group() + " - " + matcher.start());

        // 第一次lookingAt匹配以及匹配的目标和匹配的起始位置
        print(matcher.lookingAt());
        print(matcher.group() + " - " + matcher.start());

        // 第二次lookingAt匹配以及匹配的目标和匹配的起始位置
        print(matcher.lookingAt());
        print(matcher.group() + " - " + matcher.start());
    }

    public static void print(Object o) {
        System.out.println(o);
    }

}
