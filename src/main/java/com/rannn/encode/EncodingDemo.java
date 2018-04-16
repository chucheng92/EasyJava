package com.rannn.encode;

import java.io.UnsupportedEncodingException;

public class EncodingDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "ABC";
        byte[] bytes = s.getBytes("utf-8");
        for (byte b : bytes) {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
        System.out.println();
        System.out.println(bytesToHexString(bytes));
        System.out.println(Integer.toHexString(-1 & 0xFF));
    }

    private static String bytesToHexString(byte[] bytes) {
        String hex = "";
        for (int i = 0; i < bytes.length; i++) {
            hex += byteToHexString(bytes[i]);
        }

        return hex;
    }

    private static String byteToHexString(byte b) {
        char[] digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                'B', 'C', 'D', 'E', 'F'};
        char[] tempArr = new char[2];
        tempArr[0] = digit[(b >>> 4) & 0x0F];
        tempArr[1] = digit[b & 0x0F];

        String res = new String(tempArr);

        return res;
    }
}
