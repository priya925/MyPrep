package org.example;
import java.lang.FunctionalInterface;

@FunctionalInterface
public interface FunctionalInterFaceExample {

    void functionalInterfaceExampleMetohd();
    default void functionalInterfaceDefaultMethod(){
        System.out.println("I am in default method");
    }
    static void staticMethod(){
        System.out.println("This is interface static method");
    }
}
