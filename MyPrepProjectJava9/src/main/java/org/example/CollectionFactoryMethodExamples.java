package org.example;

import java.util.List;
import java.util.Map;

public class CollectionFactoryMethodExamples {

    public static void main(String... args){
        List<String> li = List.of("Priya","Saxena","You","Are","Love");
        Map<Integer, String> map = Map.of(1,"Priya",2,"Saxena");
        for(String i:li){
           System.out.println(i);
        }
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey() + " "+ m.getValue());
        }
    }
}
