package org.example.dsaprep2026.streamproblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNotRepetitiveCharacterFromString {

    public static void main(String [] args){
         String s = "Java is Java.";
         Character c = s.chars()
                 .mapToObj(ch -> (char) ch)
                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                 .entrySet()
                 .stream()
                 .filter(x -> x.getValue() ==1 )
                 .map(Map.Entry::getKey)
                 .findFirst()
                 .get();
         System.out.println(c);
    }

}
