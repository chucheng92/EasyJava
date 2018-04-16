package com.rannn.reflect;

/**
 * Created by taoxiaoran on 16/4/6.
 */
public class Hello {
    public static void main(String[] args) {
        MyInvocationHandler demo  = new MyInvocationHandler();
        Subject sub = (Subject)demo.bind(new RealSubject());
        System.out.println(sub.say("lily", 20));
    }
}
