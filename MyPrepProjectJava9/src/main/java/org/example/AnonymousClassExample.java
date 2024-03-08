package org.example;

public class AnonymousClassExample {
    public static void main(String[] args){
        AnonymousParentClass ap = new AnonymousParentClass() {
            @Override
            void writeAMessage() {
                System.out.println("Abstract class message");
            }
        };
        ap.writeAMessage();
    }
}

abstract class AnonymousParentClass{
    abstract void writeAMessage();
}