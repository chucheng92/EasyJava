package com.rannn.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] bys = "Hello,UDP!".getBytes();
        DatagramPacket dp = new DatagramPacket(bys, bys.length,
                InetAddress.getByName("tao"), 12345);

        ds.send(dp);

        ds.close();
    }
}
