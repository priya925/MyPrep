package org.example.dsaprep2026.streamproblems;

import java.util.Comparator;
import java.util.List;

public class Get2ndHighestNumberFromIntegerList {
    public static void main(String [] args){
        List<Integer> intList = List.of(4,5,6,7,3,2,1);
        int n = 3;
        System.out.println(intList.stream().sorted(Comparator.reverseOrder())
                .skip(n-1)
                .findFirst()
                .orElse(-1));
    }
}
