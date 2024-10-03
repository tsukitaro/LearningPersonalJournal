package org.masumera.generics;

public class GenericsDemo {
    public < E > void printArray( E[] inputArray) {
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}

