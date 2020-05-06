package com.example.design_mode.create.constructorbuilder;

/**
 * 建造者
 */
public interface Builder {
    /**
     * 建筑地基
     */
    void buildA();

    /**
     * 建筑主体
     */
    void buildB();

    /**
     * 装修房子
     */
    void buildC();

    Product getProduct();

}
