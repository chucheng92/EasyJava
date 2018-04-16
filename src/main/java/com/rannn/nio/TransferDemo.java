package com.rannn.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class TransferDemo {
    public static void main(String[] args) throws IOException {

        // TransferFrom
        RandomAccessFile fromFile = new RandomAccessFile("src/main/resources/fromFile.txt", "rw");
        FileChannel fromChannel = fromFile.getChannel();

        RandomAccessFile toFile = new RandomAccessFile("src/main/resources/toFile.txt", "rw");
        FileChannel toChannel = toFile.getChannel();

        long position = 0;
        long count = fromChannel.size();

        toChannel.transferFrom(fromChannel, position, count);

        fromFile.close();
        toFile.close();

        // TransferTo
//		RandomAccessFile fromFile = new RandomAccessFile("src/main/resources/fromFile.txt", "rw");
//		FileChannel fromChannel = fromFile.getChannel();
//		
//		RandomAccessFile toFile = new RandomAccessFile("src/main/resources/toFile.txt", "rw");
//		FileChannel  toChannel = toFile.getChannel();
//		
//		long position = 0;
//		long count = fromChannel.size();
//		
//		fromChannel.transferTo(position, count, toChannel);
//		
//		fromFile.close();
//		toFile.close();
    }
}
