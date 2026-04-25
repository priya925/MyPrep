package org.example.basicmaths;

public class CheckIfANumberIsPalindrome {

    public static void main(String[] args){
        System.out.println(isPalindrome(555));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindromeByReversingHalfNumber(1221));
        System.out.println(isPalindromeByReversingHalfNumber(12321));
    }

    public static boolean isPalindrome(int n) {

        if(n == reverseNumber(n))
            return true;
        return false;
    }

    public static int reverseNumber(int n){
        int reversedNumber = 0;
        while(n!=0){
            int lastDigit = n%10;
            reversedNumber = reversedNumber*10+lastDigit;
            n = n/10;
        }

        return reversedNumber;
    }

    public static boolean isPalindromeByReversingHalfNumber(int n){
        int reversedHalfNumber = 0;
        while (n> reversedHalfNumber){
            int lastDigit = n%10;
            reversedHalfNumber = reversedHalfNumber*10 + lastDigit;
            n = n/10;
        }

        return n == reversedHalfNumber || n == reversedHalfNumber/10;
    }
}
