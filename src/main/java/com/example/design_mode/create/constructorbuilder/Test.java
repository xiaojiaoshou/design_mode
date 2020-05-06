package com.example.design_mode.create.constructorbuilder;

public class Test {
    public static void main(String[] args) {

        Director director=new Director();
        Product product = director.create(new ConcreteBuilder());
        System.out.println(product);
    }
}
