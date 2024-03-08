package org.example.slidingwindow;

public class SubArrayOfSizeWithMaximumSum {

    public static void main(String[] args){
        int[] arr = {1,9,40,5,6,7,120};
        int size = 3;
        System.out.println(findMaximumSumOfSubarray(arr,size));
    }

    public static int findMaximumSumOfSubarray(int[] arr, int k){
        int n = arr.length;
        int start =0, end = 0, maximumSum = 0, subarraySum =arr[start];
        while(end <n){
            if(end-start+1 < k){
                end++;
                subarraySum+= arr[end];
            } else if(end-start+1 == k){
                subarraySum-= arr[start];
                start++;
                end++;
                if(end<n)
                    subarraySum+=arr[end];
            }
            if(maximumSum < subarraySum){
                maximumSum = subarraySum;
            }
        }
        return  maximumSum;

    }
}
