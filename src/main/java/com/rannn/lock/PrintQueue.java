package com.rannn.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintQueue {

    private final Lock queueLock = new ReentrantLock();

    public void printJob(Object document) {
        queueLock.lock();
        long duration = (long) (Math.random() * 10000);

        System.out.println(Thread.currentThread().getName() + ":PrintQueue: Printing a job "
                + (duration / 1000) + " seconds");

        try {
            Thread.sleep(duration);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            queueLock.unlock();
        }
    }

    public static void main(String[] args) {
        PrintQueue pq = new PrintQueue();
        Thread[] thread = new Thread[10];

        for (int i = 0; i < 10; i++) {
            thread[i] = new Thread(new Job(pq), "Thread " + i);
        }

        for (int i = 0; i < 10; i++) {
            thread[i].start();
        }
    }
}
