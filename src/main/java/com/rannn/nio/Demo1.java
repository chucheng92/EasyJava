package com.rannn.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 测试 position limit capacity
 *
 * @author hztaoran
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile aFile = new RandomAccessFile("src/main/resources/nio-data.txt", "rw");
        FileChannel inChannel = aFile.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(48);

        System.out.println("position-limit-capacity-1:" + buf.position() + " " + buf.limit() + " " + buf.capacity());

        int bytesRead = inChannel.read(buf);

        System.out.println("position-limt-capacity-2:" + buf.position() + " " + buf.limit() + " " + buf.capacity());

        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);

            buf.flip();

            System.out.println("position-limit-capacity-3:" + buf.position() + " " + buf.limit() + " " + buf.capacity());

            while (buf.hasRemaining()) {
                System.out.print((char) buf.get());
            }

            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}
