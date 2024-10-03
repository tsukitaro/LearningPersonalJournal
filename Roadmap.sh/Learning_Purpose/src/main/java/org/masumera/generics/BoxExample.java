package org.masumera.generics;

public class  BoxExample<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
}
