package com.rannn.jvm;

/**
 * 测试引用计数法
 *
 * @author 哓哓
 */
public class ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC o1 = new ReferenceCountingGC();
        ReferenceCountingGC o2 = new ReferenceCountingGC();
        o1.instance = o2;
        o2.instance = o1;

        o1 = null;
        o2 = null;

        System.gc();
    }
}
