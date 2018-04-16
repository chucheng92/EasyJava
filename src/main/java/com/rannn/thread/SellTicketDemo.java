package com.rannn.thread;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        new Thread(st, "窗口1").start();
        new Thread(st, "窗口2").start();
        new Thread(st, "窗口3").start();
    }
}
