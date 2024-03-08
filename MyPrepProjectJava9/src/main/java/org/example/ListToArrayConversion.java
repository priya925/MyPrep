package org.example;

import java.util.Arrays;
import java.util.List;

public class ListToArrayConversion {

    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        Integer[] arrBack = list.toArray(new Integer[list.size()]);
        Arrays.stream(arrBack).forEach(x-> System.out.println(x));
        arrBack = list.toArray(Integer[]::new);
        Arrays.stream(arrBack).forEach(x-> System.out.println(x));

    }
}
