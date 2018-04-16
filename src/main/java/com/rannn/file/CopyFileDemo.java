package com.rannn.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;


public class CopyFileDemo {

    public static void main(String[] args) throws IOException {
        //1.D:\New1 -> E:\New2
        File srcFolder = new File("D:\\New1");
        File desFolder = new File("C:\\New2");

        if (!desFolder.exists()) {
            desFolder.mkdir();
        }

        File[] fileArray = srcFolder.listFiles(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".jpg");
            }
        });

        for (File file : fileArray) {
            String name = file.getName();
            File newFile = new File(desFolder, name);
            CopyFile(file, newFile);
        }

        File[] desFileArray = desFolder.listFiles();
        for (File desfile : desFileArray) {
            String newName = desfile.getName().replace(".jpeg", ".jpg");
            File newFile = new File(desFolder, newName);
            desfile.renameTo(newFile);
        }
        System.out.println("=====================拷贝文件成功======================");
    }

    private static void CopyFile(File file, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
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
