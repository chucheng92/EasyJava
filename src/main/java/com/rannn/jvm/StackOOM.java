package com.rannn.jvm;

/**
 * 栈溢出
 *
 * @author 哓哓
 * -Xss128k
 */
public class StackOOM {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        StackOOM oom = new StackOOM();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
