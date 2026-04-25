package org.example.basicmaths;

public class CountAllDigitsOfANumber {

    public static void main(String[] args){
        int number = 456789;
        System.out.println(countDigits(number));
    }

    public static int countDigits(int n) {
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
}
