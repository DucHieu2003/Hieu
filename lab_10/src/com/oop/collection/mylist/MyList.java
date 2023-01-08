package com.oop.collection.mylist;

public interface MyList {
    void add(Object o);

    void add(Object o, int index);

    void remove(int index);

    Object get(int index);

    int size();
}
