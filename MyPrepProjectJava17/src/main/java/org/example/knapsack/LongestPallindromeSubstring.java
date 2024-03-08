package org.example.knapsack;

public class LongestPallindromeSubstring {

    static int t[][];
    public static int longestPalindrome(char[] a, int n) {
        // Corner cases.
        int maxLength = 0;
        if(n<2)
            return n;
        for(int diff =0; diff<n; diff++){
            for(int i=0,j=i+diff; j<n;i++,j++){
                if(i==j)
                    t[i][j] = 1;
                else if(diff ==1)
                    t[i][j] = (a[i] == a[j])?2:0;
                else {
                    if(a[i] == a[j] && t[i+1][j-1] !=0){
                        t[i][j] = 2+ t[i+1][j-1];
                    }
                }
                if(maxLength<t[i][j])
                    maxLength = t[i][j];
            }
        }
        return maxLength;
    }

    public static void main(String args[]) {
        // Your code goes here
        LongestPallindromeSubstring flp = new LongestPallindromeSubstring();
        String s = "HelleH";
        t = new int[s.length()][s.length()];
        System.out.println(longestPalindrome(s.toCharArray(), s.length()));
    }
}
