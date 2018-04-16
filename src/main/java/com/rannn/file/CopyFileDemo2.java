package com.rannn.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:\\New1");
        File desFile = new File("D:\\New2");

        if (!desFile.exists()) {
            desFile.mkdir();
        }
        copyFolder(srcFile, desFile);
    }

    private static void copyFolder(File srcFile, File desFile) throws IOException {
        if (srcFile.isDirectory()) {
            // 文件夾
            File newFolder = new File(desFile, srcFile.getName());
            newFolder.mkdir();

            File[] fileArray = srcFile.listFiles();
            for (File file : fileArray) {
                copyFolder(file, newFolder);
            }
        } else {
            File newFile = new File(desFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    private static void copyFile(File srcFile, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }
}