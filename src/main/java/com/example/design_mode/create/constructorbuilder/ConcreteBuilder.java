package com.example.design_mode.create.constructorbuilder;

/**
 * 具体建造者实现类
 */
public class ConcreteBuilder implements Builder {
    Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildA() {
        product.setBuildA("建造地基");
    }

    @Override
    public void buildB() {
        product.setBuildB("建造房屋主体");

    }

    @Override
    public void buildC() {
        product.setBuildC("装修房子");

    }

    @Override
    public Product getProduct() {
        return product;
    }
}
