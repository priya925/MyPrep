package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Integer[] arr = {1,2,3,4,5};
//        Stream<Integer> stream = Arrays.stream(arr, 0, arr.length);
//        Integer result = stream.mapToInt(i -> i*2).findFirst().getAsInt();
//        System.out.println(result);
//        String str = "find first non repeated character in string.";
//        List<Character> ch = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                        .entrySet().stream()
//                        .filter(i-> i.getValue()==1)
//                                .map(Map.Entry::getKey)
//                                        .collect(Collectors.toList());
//        Iterator it = ch.iterator();
//        while(it.hasNext()){
//            it.next();
//        }
//
//        System.out.println(ch);
        List<Integer> primeNumber = Arrays.asList(2,5,7);
        List<Integer> evenNumber = Arrays.asList(2,4,6);
        List<Integer> oddNumber = Arrays.asList(3,5,7);
        List<List<Integer>> listOfInts = Arrays.asList(primeNumber, evenNumber, oddNumber);
        System.out.println(listOfInts);
        List<Integer> result = listOfInts.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(result);
    }
}