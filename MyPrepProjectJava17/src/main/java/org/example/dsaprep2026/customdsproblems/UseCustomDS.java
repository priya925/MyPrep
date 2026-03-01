package org.example.dsaprep2026.customdsproblems;

import java.util.*;

class CustomDSWithComplexity1 {
    List<Object> list;
    Map<Object, Integer> map;
    Random random;
    CustomDSWithComplexity1(){
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
        this.random = new Random();
    }
    boolean add(Object obj){
        if(map.containsKey(obj))
            return false;
        list.add(obj);
        map.put(obj, list.size()-1);
        return true;
    }

    Object getRandomValue(){
        int index = random.nextInt(list.size()-1);
        return list.get(index);
    }

    boolean update(Object oldObj, Object newObj){
        if(!map.containsKey(oldObj))
            return false;
        int index = map.get(oldObj);
        list.set(index, newObj);
        map.remove(oldObj);
        map.put(newObj,index);
        return true;
    }
    boolean delete(Object obj){
        if(!map.containsKey(obj))
            return false;
        int index = map.get(obj);
        Object lastElement = list.get(list.size()-1);
        list.set(index,lastElement);
        list.remove(list.size()-1);
        map.remove(obj);
        map.put(lastElement,index);
        return true;
    }

    Integer size(){
        return list.size();
    }
}


public class UseCustomDS{
    public static void main(String[] args){
        CustomDSWithComplexity1 abc = new CustomDSWithComplexity1();
        abc.add("Priya");
        abc.add("Vimal");
        abc.add("Shruti");
        System.out.println("Printing post add");
        int i = 0;
        while(i <abc.size()){
            System.out.println(abc.getRandomValue());
            i++;
        }

        abc.update("Priya", "Priya Vimal Shah");
        System.out.println("Printing post update");
        i=0;
        while(i <abc.size()){
            System.out.println(abc.getRandomValue());
            i++;
        }

        abc.delete("Shruti");
        System.out.println("Printing post delete");
        i=0;
        while(i <abc.size()){
            System.out.println(abc.getRandomValue());
            i++;
        }


    }
}

