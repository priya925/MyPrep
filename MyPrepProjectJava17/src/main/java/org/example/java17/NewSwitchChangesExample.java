package org.example.java17;

public class NewSwitchChangesExample {

    public static void main(String[] args){
        int number = 5;
        System.out.println(NewSwitchChangesExample.getResult(number));
    }

    public static int getResult(int number){
        return switch(number){
            case 1,2,3,4,6,7:
                System.out.println("Yes");
                yield  number+1;
            case 5:
                System.out.println("No");
                yield number+1;
            default:
                System.out.println("default case");
                yield 0;
        };
    }
}
