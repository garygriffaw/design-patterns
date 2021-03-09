package com.garygriffaw.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
