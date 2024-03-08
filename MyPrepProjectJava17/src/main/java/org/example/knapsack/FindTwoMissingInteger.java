package org.example.knapsack;

public class FindTwoMissingInteger {

    public static void main(String[] args){

        FindTwoMissingInteger ftmi = new FindTwoMissingInteger();
        int[] arr = {3,4,2,6};
        int n= 6;
        ftmi.printMissingInteger(arr, n);

    }

    public void printMissingInteger(int[] arr, int n){
        int totalSumOfN = n*(n+1)/2;
        int sumOfArray = 0;
        for(int i=0; i<arr.length;i++){
            sumOfArray = sumOfArray+ arr[i];
        }
        int sumOfMissingIntegers = totalSumOfN - sumOfArray;
        int averageOfMissingIntegers = sumOfMissingIntegers/2;
        int sumOfSmallerThanAverage = 0;
        for(int i=0; i<arr.length;i++){
            if(averageOfMissingIntegers > arr[i])
                sumOfSmallerThanAverage = sumOfSmallerThanAverage + arr[i];
        }
        int firstMissingInteger = averageOfMissingIntegers - sumOfSmallerThanAverage;
        int secondMissingInteger = sumOfMissingIntegers - firstMissingInteger;
        System.out.println(firstMissingInteger + " " + secondMissingInteger);
    }

}
