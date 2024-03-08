package org.example.knapsack;

public class EqualSumPartition {
    static boolean t[][];
    public static void main(String[] args){
        int[] arr = {3,5,7,11};
        int sum =0;
        for(int i=0; i<arr.length;i++)
            sum = sum+arr[i];
        if(sum%2 != 0)
            System.out.println(false);
        else{
            t = new boolean[arr.length+1][sum/2+1];
            EqualSumPartition esp = new EqualSumPartition();
            System.out.println(esp.isEqualSumPartitionPossible(arr, sum/2, arr.length));
        }

    }

    public boolean isEqualSumPartitionPossible(int[] arr, int sum, int n){
        if(n==0 || sum == 0)
            return false;
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
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
