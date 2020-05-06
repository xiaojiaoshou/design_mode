package com.example.design_mode.create.constructorbuilder;


/**
 * 调度者
 */
public class Director {


    public Product create(Builder builder) {
        // 建造地基
        builder.buildA();
        // 建造房子主体
        builder.buildB();
        // 装修房子
        builder.buildC();

        return builder.getProduct();
    }
}
