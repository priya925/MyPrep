package org.example.basicmaths;

public class CheckIfNumberIsPrime {

    public static void main(String[] args){
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
    }

    static boolean isPrime(int n) {
        // code here
        for(int i= 2; i<=n/2; i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
