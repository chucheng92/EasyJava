package com.rannn.thread;

public class SellTicket implements Runnable {
    private int ticket = 100;

    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
                }
            }
        }
    }
}
