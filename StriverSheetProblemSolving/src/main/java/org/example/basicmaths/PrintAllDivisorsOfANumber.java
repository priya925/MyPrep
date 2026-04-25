package org.example.basicmaths;

public class PrintAllDivisorsOfANumber {

    public static void main(String[] args){
        print_divisors(20);
    }

    public static void print_divisors(int n) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 1; i<=n/2; i++){
            if(n%i ==0){
                sb.append(i).append(" ");
            }
        }
        sb.append(n);
        System.out.println(sb);
    }
}
