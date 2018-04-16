package com.rannn.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(12345);

        byte[] bys = new byte[1024 * 20];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        int c = bys.length;
        ds.receive(dp);

        String ip = dp.getAddress().getHostAddress();
        String res = new String(dp.getData(), 0, dp.getLength());
        System.out.println(ip + " " + res + " " + c);

        ds.close();
    }
}
