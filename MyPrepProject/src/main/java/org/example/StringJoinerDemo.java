package org.example;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args){
        StringJoiner sj = new StringJoiner(",","{","}");
        sj.add("Priya");
        sj.add("Shruti");
        sj.add("Divya");
        StringJoiner sj2 = new StringJoiner("|","[","]");
        sj2.add("Priya");
        sj2.add("Shruti");
        sj2.add("Divya");
        System.out.println(sj.merge(sj2));
    }
}
