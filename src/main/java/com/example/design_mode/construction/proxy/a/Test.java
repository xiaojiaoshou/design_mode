package com.example.design_mode.construction.proxy.a;

public class Test {
    public static void main(String[] args) {
        StudentsProxy  proxy=new StudentsProxy(new Student());
        proxy.giveMoney();
    }

}
