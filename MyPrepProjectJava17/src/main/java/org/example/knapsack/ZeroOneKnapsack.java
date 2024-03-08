package org.example.knapsack;

public class ZeroOneKnapsack {
    static int[][] t;
    public static void main(String[] args){
        int[] val = {2,3,4,6};
        int[] weight = {1,2,3,4};
        int w = 7;
        t = new int[val.length+1][w+1];
        System.out.println(getMaximumProfit(val, weight, val.length, w));
    }
    public static int getMaximumProfit(int[] val, int[] weight, int n, int w) {
        if (n == 0 || w == 0)
            return 0;
        if (weight[n - 1] <= w) {
            t[n][w] = Integer.max(getMaximumProfit(val, weight, n-1, w),
                    val[n-1]+getMaximumProfit(val, weight, n-1, w-weight[n-1]));
        } else {
            t[n][w]  = getMaximumProfit(val, weight, n-1, w);
        }

        return t[n][w];

    }

//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=w; j++){
//                if(i==0 || j==0)
//                    t[i][j] = 0;
//            }
//        }
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=w; j++){
//                if(weight[i-1]<=w){
//                    t[i][j] = Integer.max(t[i-1][j], val[i-1] + t[i-1][w-weight[i-1]]);
//                } else{
//                    t[i][j] = t[i-1][j];
//                }
//            }
//        }
//        return t[n][w];
//    }
}
