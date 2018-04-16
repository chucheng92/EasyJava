package com.rannn.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* 将对象写入文件，序列化 */
public class TestWriteObject {
    public static void main(String[] args) {
        String filePath = "D:/New/a.txt";
        ObjectOutputStream objOutput = null;
        Course c1 = new Course("C++", 3);
        Course c2 = new Course("Java", 4);

        Student s1 = new Student("king", 25);
        s1.setCourse(c1);
        Student s2 = new Student("jason", 23);
        s2.setCourse(c2);

        try {
            objOutput = new ObjectOutputStream(new FileOutputStream(filePath));
            objOutput.writeObject(s1);
            objOutput.writeObject(s2);
            objOutput.writeInt(123);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Info:对象被写入: " + filePath);
    }
}
