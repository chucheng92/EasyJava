package com.rannn.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress add = InetAddress.getByName("home-pc");
        String name = add.getHostName();
        String ip = add.getHostAddress();

        System.out.println(name + " " + ip);
    }
}
