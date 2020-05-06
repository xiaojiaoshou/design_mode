package com.example.design_mode.action.iterator;

import java.util.List;

public class DataIterator<T> implements Iterator {
    private List<T> list;

    private int index;

    public DataIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public T next() {
        return list.get(index++);
    }


}
