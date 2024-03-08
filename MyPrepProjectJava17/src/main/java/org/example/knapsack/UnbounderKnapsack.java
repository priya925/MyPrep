package org.example.knapsack;

public class UnbounderKnapsack {
    static int[][] t;

    public static void main(String[] args) {
        int[] val = {200,300,600};
        int[] weight = {2,3,5};
        int w = 10;
        t = new int[val.length + 1][w + 1];
        System.out.println(getMaximumProfit(val, weight, val.length, w));
    }

    public static int getMaximumProfit(int[] val, int[] weight, int n, int w) {
        if (n == 0 || w == 0)
            return 0;
        if (weight[n - 1] <= w) {
            t[n][w] = Integer.max(getMaximumProfit(val, weight, n-1, w),
                    val[n-1]+getMaximumProfit(val, weight, n, w-weight[n-1]));
        } else {
            t[n][w]  = getMaximumProfit(val, weight, n-1, w);
        }

        return t[n][w];

    }

}
