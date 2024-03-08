package org.example.knapsack;

public class CountSubsetWithGivenDifference {
    static int[][] t;
    public static void main(String[] args){
        int[] arr = {1,1,2,3};
        int difference = 1;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        int sum1 = (difference+sum)/2;
        t = new int[arr.length+1][sum1+1];
        System.out.println(countSubsetForGivenDiff(arr, sum1, arr.length));

    }

    public static int countSubsetForGivenDiff(int[] arr, int sum, int n){
        if(sum ==0)
            return 1;
        if(n==0 && sum !=0 )
            return 0;
        for(int i=0; i<=n;i++){
            for(int j=0; j<=sum; j++){
                if(i==0)
                    t[i][j] = 0;
                if(j==0)
                    t[i][j] = 1;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j)
                    t[i][j] = t[i-1][j]+t[i-1][j-arr[i-1]];
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][sum];
    }
}
