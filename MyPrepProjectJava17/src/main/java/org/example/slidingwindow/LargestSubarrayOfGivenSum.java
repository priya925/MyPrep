package org.example.slidingwindow;

public class LargestSubarrayOfGivenSum {
    public static void main(String[] args){
        int[] arr = {4,1,1,1,2,3,5};
        int sum = 5;
        System.out.println(findLargestSubArrayOfGivenSum(arr,sum));
    }

    public static int findLargestSubArrayOfGivenSum(int[] arr, int sum){
        int n=arr.length;
        int k = 0;
        int i=0,j=0;
        int currentSum = arr[i];
        while(j<n){
            if(currentSum < sum){
                j++;
                currentSum+=arr[j];
            } else{
                if(currentSum == sum && k< j-i+1)
                    k = j-i+1;
                currentSum-= arr[i];
                i++;
                j++;
                if(j<n)
                    currentSum+= arr[j];
            }
        }
        return k;
    }
}
