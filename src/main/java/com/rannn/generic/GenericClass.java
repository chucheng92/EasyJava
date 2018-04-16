package com.rannn.generic;

// 泛型类
public class GenericClass {
    public static void main(String[] args) {
        Box<String> box = new Box<String>("box");
        Box<Integer> box2 = new Box<Integer>(100);
        // 测试泛型类
        System.out.println("box:" + box.getData());
        // 测试类型擦除
        System.out.println("box:" + box.getClass());      // com.ryan.javase.generic.Box
        System.out.println("box2:" + box2.getClass());        // com.ryan.javase.generic.Box
        System.out.println(box.getClass() == box2.getClass());    // true
    }
}

class Box<T> {
    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
