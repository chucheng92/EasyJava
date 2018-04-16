package com.rannn.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties类加载配置文件
 *
 * @author 哓哓
 */
public class LoadDemo {
    public static void main(String[] args) {
        loadProperties();
        System.out.println("==============");
        loadXML();
    }

    public static void loadProperties() {
        Properties properties = new Properties();

        if (null != properties)
            System.out.println(properties);

        try {
            properties.load(new FileInputStream(new File("src/main/resources/test.properties")));

            System.out.println(properties);

            // 将属性列表输出到指定的输出流
            properties.list(System.out);
            System.out.println(properties.getProperty("home"));
            System.out.println(properties.getProperty("dbPort"));
            System.out.println(properties.getProperty("database"));
            System.out.println(properties.getProperty("dbName"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadXML() {
        Properties properties = new Properties();

        try {
            properties.loadFromXML(new FileInputStream(new File("src/main/resources/books.xml")));
            // 将属性列表输出到指定的输出流
            properties.list(System.out);
//			System.out.println(properties.getProperty("home"));
//			System.out.println(properties.getProperty("dbPort"));
//			System.out.println(properties.getProperty("database"));
//			System.out.println(properties.getProperty("dbName"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
