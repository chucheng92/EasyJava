package com.rannn.jvm;

import java.util.ArrayList;
import java.util.List;

// 堆溢出
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
