package org.example;

public class FunctionalInterfaceExampleDemo implements FunctionalInterFaceExample{

    public static void main(String[] args){
        FunctionalInterfaceExampleDemo fied = new FunctionalInterfaceExampleDemo();
        fied.functionalInterfaceExampleMetohd();
        fied.functionalInterfaceDefaultMethod();
        FunctionalInterFaceExample.staticMethod();
    }
    public void functionalInterfaceExampleMetohd(){
        System.out.println("Implementing functionalInterfaceExampleMethod in class");
    }
}
