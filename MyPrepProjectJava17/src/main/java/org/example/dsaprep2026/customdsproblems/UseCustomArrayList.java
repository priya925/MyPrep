package org.example.dsaprep2026.customdsproblems;

import java.util.Arrays;

public class UseCustomArrayList {
    public static void main(String[] args){
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        customArrayList.add(4);
        for(int i=0; i<customArrayList.size(); i++){
            System.out.println(customArrayList.get(i));
        }
        System.out.println(customArrayList.get(3));

        customArrayList.update(2, 8);
        for(int i=0; i<customArrayList.size(); i++){
            System.out.println(customArrayList.get(i));
        }
        customArrayList.delete(2);
        for(int i=0; i<customArrayList.size(); i++){
            System.out.println(customArrayList.get(i));
        }
    }
}


class CustomArrayList<T>{
    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 3;

    CustomArrayList(){
        data= new Object[DEFAULT_CAPACITY];
        size =0;
    }
    void add(Object obj){
        ensureCapacity();
        data[size++] = obj;
    }

    Object get(int index){
        checkIndex(index);
        return data[index];
    }

    void update(int index, Object obj){
        checkIndex(index);
        data[index] = obj;
    }

    void delete(int index){
        checkIndex(index);
        for(int i=index; i<size; i++){
            data[i] = data[i+1];
        }
        data[size-1] = null;
        size--;
    }

    boolean checkIndex(int index) {
        if(index < 0 || index > data.length-1){
            throw new ArrayIndexOutOfBoundsException();
        }
        return true;
    }

    void ensureCapacity(){
        if(data.length == size){
            int newCapacity = size*2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    int size(){
        return size;
    }

}