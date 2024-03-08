package org.example;

public class PrivateMethodInterfaceDemo implements PrivateMethodInterface{

    public static void main(String[] args){
        PrivateMethodInterface pmi = new PrivateMethodInterfaceDemo();
        pmi.callPrivateMethod();
        pmi.callPrivateStaticMethod();
    }
}
