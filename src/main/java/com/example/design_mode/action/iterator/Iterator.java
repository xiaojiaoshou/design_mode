package com.example.design_mode.action.iterator;

/**
 * 迭代器接口
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
