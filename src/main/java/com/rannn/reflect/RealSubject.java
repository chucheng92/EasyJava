package com.rannn.reflect;

/**
 * Created by taoxiaoran on 16/4/6.
 */
public class RealSubject implements Subject {

    @Override
    public String say(String name, int age) {
        return name + " " + age;
    }
}
