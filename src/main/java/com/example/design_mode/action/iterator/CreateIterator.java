package com.example.design_mode.action.iterator;

import java.util.List;

public class CreateIterator {

    public static <T> Iterator createIterator(List<T> list) {
        return new DataIterator<T>(list);
    }
}
