package org.example.basicmaths;

public class FindGCDOfTwoNumbers {

    public static void main(String[] args){
        System.out.println(findGCD(12, 16));
    }

    public static int findGCD(int n1, int n2){
        int min = Math.min(n1, n2);
        int max = min == n1 ? n2 : n1;

        while(max != 0){
            int temp = max;
            max = max%min;
            min = temp;
        }

        return min;
    }
}
