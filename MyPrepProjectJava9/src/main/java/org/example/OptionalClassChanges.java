package org.example;

import java.util.Optional;

public class OptionalClassChanges {

    public static void main(String[] args){

        String str = null;
        String str1 = "Java";

        System.out.println(Optional.ofNullable(str).isEmpty());
        System.out.println(Optional.ofNullable(str1).isEmpty());
        System.out.println(Optional.ofNullable(str).isPresent());
        System.out.println(Optional.ofNullable(str1).isPresent());

    }
}
