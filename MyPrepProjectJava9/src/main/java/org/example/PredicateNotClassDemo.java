package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotClassDemo {

    public static void main(String[] args){
        List<String> list = Arrays.asList("I","Am","","Good","Girl","");
        List<String> list2 = list.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());
        list2.stream().forEach(i-> System.out.println(i));
    }

}
