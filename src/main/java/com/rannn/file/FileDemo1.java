package com.rannn.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo1 {
//	public static void main(String[] args) {
//		File file1 = new File("D:\\New\\big.jpg");
//		File file2 = new File("D:\\opt\\a.jpg");
//		System.out.println(file1.renameTo(file2));
//	}

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/resource/a.txt");
        int by = 0;
        by = fis.read();
        System.out.print(by);
        fis.close();
    }
}
