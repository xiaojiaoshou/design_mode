package com.example.design_mode.construction.proxy.b;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {

        ClassFee classFee = new Student();
        DynamicProxy proxy = new DynamicProxy(classFee);
        ClassFee fee = (ClassFee) Proxy.newProxyInstance(
                ClassFee.class.getClassLoader(),
                classFee.getClass().getInterfaces(),
                proxy);
        fee.giveMoney();
    }

}
