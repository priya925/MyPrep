package org.example;

import java.util.Optional;

public class OptionalClassDemo {

    public static void main(String[] args){
        String[] str = new String[6];
        str[2] = "2nd element";
        Optional<String> strElement = Optional.ofNullable(str[2]);
        if(strElement.isPresent()){
            System.out.println("element present");
        } else {
            System.out.println("element not present");
        }
    }
}
