package com.example.design_mode.construction.proxy.a;

public class StudentsProxy implements ClassFee {

    private ClassFee classFee;

    public StudentsProxy(ClassFee classFee) {
        this.classFee = classFee;
    }

    @Override
    public void giveMoney() {
        System.out.println("班长代收班费!");
        classFee.giveMoney();
    }
}
