package com.rannn.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket dsReceive = new DatagramSocket(10001);

        byte[] bysReceive = new byte[1024 * 20];
        int lenReceive = bysReceive.length;
        DatagramPacket dpReceive = new DatagramPacket(bysReceive, lenReceive);

        dsReceive.receive(dpReceive);

        InetAddress address = dpReceive.getAddress();
        String ip = address.getHostAddress();
        String host = address.getHostName();

        byte[] bysBuffer = dpReceive.getData();
        int lenBuffer = dpReceive.getLength();

        String s = new String(bysBuffer, 0, lenBuffer);

        System.out.println(ip + " " + host + " " + s);

        dsReceive.close();
    }
}
