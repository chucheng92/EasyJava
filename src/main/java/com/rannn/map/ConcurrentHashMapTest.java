package com.rannn.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

    private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        new Thread("Thread1") {
            @Override
            public void run() {
                map.put(3, 33);
            }
        }.start();

        new Thread("Thread2") {
            @Override
            public void run() {
                map.put(4, 44);
            }
        }.start();

        new Thread("Thread3") {
            @Override
            public void run() {
                map.put(7, 77);
            }
        }.start();

        System.out.println(map);
    }
}
