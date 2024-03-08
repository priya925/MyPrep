package org.example;

public class MethodReferenceDemo {

    MethodReferenceDemo(){
        System.out.println("This is method reference demo constructor");
    }

    public static void main(String[] args){
        MethodReferenceInterface mi = MethodReferenceDemo::methodReferenceDemo;
        mi.methodReferenceInterfaceFunction();
        MethodReferenceInterface mi1 = new MethodReferenceDemo()::methodReferenceDemoForNonStatic;
        mi1.methodReferenceInterfaceFunction();
        MethodReferenceInterface mi2 = MethodReferenceDemo::new;
        mi2.methodReferenceInterfaceFunction();
    }


    public static void methodReferenceDemo(){
        System.out.println("This is method reference demo static method");
    }

    public void methodReferenceDemoForNonStatic(){
        System.out.println("This is method reference demo non static method");
    }
}
