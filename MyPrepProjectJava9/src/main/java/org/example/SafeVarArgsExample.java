package org.example;

import java.util.List;
import java.util.Set;

public class SafeVarArgsExample {

    @SafeVarargs
    SafeVarArgsExample(String... li){
        for(String i:li){
            System.out.println("private message "+ i);
        }
    }

    public static void main(String[] args){
        SafeVarArgsExample se = new SafeVarArgsExample("abc","bcd","def");
        SafeVarArgsExample.displayMessage(1,2,3,4,5);
        se.displayNumbers(1,3,5,7);
        se.writeMessage("Forget","it");
    }

    @SafeVarargs
    private void writeMessage(String... li){
        for(String i:li){
            System.out.println("private message "+ i);
        }

    }

    @SafeVarargs
     public final void displayNumbers(int... arr){
        for(int i: arr){
            System.out.println("private message "+ i);
        }
    }

    @SafeVarargs
    public static void displayMessage(int... arr){
        for(int i: arr){
            System.out.println("private message "+ i);
        }
    }
}
