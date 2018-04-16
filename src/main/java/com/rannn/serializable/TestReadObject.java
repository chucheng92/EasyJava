package com.rannn.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestReadObject {
    public static void main(String[] args) {
        String filePath = "D:/New/a.txt";
        ObjectInputStream objInput = null;
        Student s1 = null, s2 = null;
        int intVal = 0;

        try {
            objInput = new ObjectInputStream(new FileInputStream(filePath));
            s1 = (Student) objInput.readObject();
            s2 = (Student) objInput.readObject();
            intVal = objInput.readInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Info:文件" + filePath + "读取对象");
        System.out.println(s1);
        System.out.println(s1.getCourse());
        System.out.println(s2);
        System.out.println(s2.getCourse());
        System.out.println(intVal);
    }
}
