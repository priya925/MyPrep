package org.example;

public interface PrivateMethodInterface {

    default void callPrivateMethod(){
        interfacePrivateMethod();
    }

    default void callPrivateStaticMethod(){
        interfacePrivateStaticMethod();
    }

    private void interfacePrivateMethod(){
        System.out.println("I am interface private method.");
    }
    private static void interfacePrivateStaticMethod(){
        System.out.println("I am interface private static method.");
    }
}
