package org.example.basicmaths;

public class CheckIfNumberIsArmStrong {

    public static void main(String[] args){
        System.out.println(isArmstrongNumber(123));
        System.out.println(isArmstrongNumber(9474));
        System.out.println(isArmstrongNumber(153));


    }

    static boolean isArmstrongNumber(int n) {
        // code here
        int number = n;
        int numberOfDigits = (int)Math.log10(n)+1;
        int result = 0;
        while(number > 0){
            int digit = number%10;
            result = result + (int)Math.pow(digit, numberOfDigits);
            number = number/10;
        }
        return result == n;
    }
}
