package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ImmutableClass {

    public static void main(String args[]){
        ImmutableClassObject im = new ImmutableClassObject(12, 5);

        System.out.println(im.getAge()+ " "+ im.getHeight());
        String str = "find first non repeated character in string.";
        Character ch = str.chars().mapToObj(i-> (char)i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i-> i.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).get(0);
        System.out.println(ch);
    }
}
