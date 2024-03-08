package org.example.knapsack;

public class MinimumSubsetSumDifference {
    static boolean[][] t;
    public static void main(String[] args){
        int[] arr = {1,3,5,6};
        int sum = 0;
        for(int i=0; i<arr.length; i++)
            sum = sum+arr[i];
        t = new boolean[arr.length+1][sum+1];

        System.out.println(getSubsetSum(arr, sum, arr.length));
    }

    public static int getSubsetSum(int[] arr, int sum, int n){
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)
                    t[i][j] = false;
                if(j==0)
                    t[i][j] = true;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j)
                    t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]];
                else
                    t[i][j] = t[i-1][j];
            }
        }

        return findMinimumSubsetSumDifference(sum, n);
    }

    public static int findMinimumSubsetSumDifference(int sum, int n){

        int minimumDifference = 0;
        for(int i=n; i>n-1; i--){
            for(int j=0; j<=sum/2; j++){
                if(t[i][j]){
                    int difference = sum - 2*j;
                    if(j==0)
                        minimumDifference = difference;
                    else if (minimumDifference>difference)
                        minimumDifference=difference;
                }

            }
        }
        return minimumDifference;
    }
}
