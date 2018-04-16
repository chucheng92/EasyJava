package com.rannn.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by taoxiaoran on 16/4/6.
 */

public  class MyInvocationHandler implements InvocationHandler {
    private Object object = null;

    public Object bind(Object object) {
        this.object = object;

        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res = method.invoke(this.object, args);

        return  res;
    }
}
