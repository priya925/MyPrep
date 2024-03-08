package org.example.knapsack;

public class SubsetSum {
    static boolean[][] t;

    public static void main(String[] args){
        int[] arr  = {1,5,7,8,10};
        int total = 6;
        t = new boolean[arr.length+1][total+1];
        SubsetSum ss = new SubsetSum();
        System.out.println(ss.isSubsetExistForTotalSum(arr, total, arr.length));
    }

    public boolean isSubsetExistForTotalSum(int[] arr, int total, int n){
        if(n==0 || total ==0)
            return false;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=total; j++){
                if(i==0)
                    t[i][j] = false;
                if(j==0)
                    t[i][j] = true;
            }
        }
        for(int i=1; i<=n;i++){
            for(int j=1; j<=total; j++){
                if(arr[i-1]<= j){
                    t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]] ;
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][total];

    }
}
