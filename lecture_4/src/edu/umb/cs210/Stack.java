package edu.umb.cs210;

import java.util.Iterator;

public class Stack <Type> implements Iterator <Type> {

    private Type[] holder;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Type next() {
        return null;
    }
}
