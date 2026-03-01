package org.example.dsaprep2026.arrayproblems;


public class FindSmallestMissingPositiveInteger {

    public static void main(String[] args){
        int[] arr = {1,3,2,4,5,6,7,8,9};
        System.out.println(findSmallestMissingPositiveInteger(arr));
    }

    static int findSmallestMissingPositiveInteger(int[] arr){
        for(int i=0; i<arr.length;i++){
            if(arr[i] >= 0 && arr[i] < arr.length ){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }
}
