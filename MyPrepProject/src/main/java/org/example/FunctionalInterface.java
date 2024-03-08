package org.example;

public interface FunctionalInterface {
    int add(int x, int y);
    default int add(int x, int y, int z){
        return x+y+z;
    }

}
