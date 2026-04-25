package org.example.basicmaths;

public class ReverseANumber {

    public static void main(String[] args){
        System.out.println(reverseDigits(34521));
    }

    public static int reverseDigits(int n) {
        int reverseNumber = 0;
        while (n!=0){
            int lastDigit = n%10;
            reverseNumber = reverseNumber*10 + lastDigit;
            n = n/10;
        }
        return reverseNumber;
    }
}
