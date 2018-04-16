package com.rannn.string;

/**
 * StringBuffer的Demo
 *
 * @author 哓哓
 */
public class StringBufferDemo1 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        System.out.println(s1.capacity()); //默认16
        StringBuffer s2 = new StringBuffer(50);
        System.out.println(s2.capacity()); //50
        StringBuffer s3 = new StringBuffer("hello");
        System.out.println(s3.capacity()); //21
    }
}
