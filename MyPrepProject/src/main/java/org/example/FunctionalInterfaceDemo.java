package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterfaceDemo {

    public static void main(String[] args){
        FunctionalInterface fi = new FunctionalInterfaceDemo()::add;
        System.out.println("default method result = "+fi.add(1,2,5));
        System.out.println("abstract method result = "+ fi.add(3,4));
        FunctionalInterfaceDemo fd = new FunctionalInterfaceDemo();
        fd.printFirstNonRepeatedCharacter("Java is my jawful.");
    }

    public int add(int x, int y){
        return x+y;
    }

    public void printFirstNonRepeatedCharacter(String str){
        Character ch = str.chars().mapToObj(i-> (char)i)
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                                .entrySet()
                                        .stream()
                                                .filter(i -> i.getValue()==1)
                                                        .map(Map.Entry::getKey)
                                                                .collect(Collectors.toList())
                                                                        .get(0);
        System.out.println(ch);

    }

}
