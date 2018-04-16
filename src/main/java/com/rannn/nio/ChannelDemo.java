package com.rannn.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelDemo {
    public static void main(String[] args) throws IOException {
//		testByteRead();
        newIOCopy();
    }

    // 单个字节读取
    private static void testByteRead() throws IOException {
        RandomAccessFile file = new RandomAccessFile("src/main/resources/b.txt", "rw");
        FileChannel channel = file.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(4);
        int bytesRead = channel.read(buf);
        System.out.println(bytesRead);

        while (bytesRead != -1) {
            buf.flip();
            while (buf.hasRemaining()) {
                System.out.println((char) buf.get());
            }
            buf.clear();
            bytesRead = channel.read(buf);
            System.out.println(bytesRead);
        }
        file.close();
    }

    private static void newIOCopy() throws IOException {
        try {
            FileChannel inc = new FileInputStream("src/main/resources/b2.txt").getChannel();
            FileChannel outc = new FileOutputStream("src/main/resources/b3.txt").getChannel();

            ByteBuffer buf = ByteBuffer.allocate(1024);
            while (inc.read(buf) != -1) {
                buf.flip();
                outc.write(buf);
                buf.clear();
            }

            inc.close();
            outc.close();
        } catch (Exception e) {
            System.out.println("error.");
        }

    }
}
