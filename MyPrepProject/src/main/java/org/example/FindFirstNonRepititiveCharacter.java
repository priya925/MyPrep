package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindFirstNonRepititiveCharacter {
    public static void main(String[] args){

       System.out.println(findFirstNonRepeatitiveChar("Shruti Saxena"));
    }

    static char findFirstNonRepeatitiveChar(String s){
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x-> x.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

    }

}
