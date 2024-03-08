package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VarInLambdaExample {

    public static void main(String[] args){
        List<String> list = Arrays.asList("Java","World");
        List<String> list1 = list.stream().map((var x) -> x+1)
                .collect(Collectors.toList());
        list1.stream().forEach(i -> System.out.println(i));
    }
}
