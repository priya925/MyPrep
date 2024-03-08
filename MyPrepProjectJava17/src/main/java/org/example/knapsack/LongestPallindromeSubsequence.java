package org.example.knapsack;

public class LongestPallindromeSubsequence {

    static int t[][];
    public static int longestPalindrome(String s, char[] a, char[] b, int n) {
        // Corner cases.
        if(n==0 || n==1)
            return n;
        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(i==0 || j==0)
                    t[i][j] =0;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(a[i-1] == b[j-1]){
                    t[i][j] = 1+t[i-1][j-1];
                } else {
                    t[i][j] = Integer.max(t[i-1][j], t[i][j-1]);
                }

            }
        }
        return t[a.length][a.length];
    }

    public static String reverseString(String s){
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        int length = s.length();
        for(int i=0, j=length; i<s.length()/2;i++,j--){
            char temp = arr[i];
            arr[i] = arr[j-1];
            arr[j-1] = temp;
        }
        for(int i=0; i<arr.length;i++){
            sb.append(arr[i]);
        }
        return String.valueOf(sb);
    }

    public static void main(String args[]) {
        // Your code goes here
        LongestPallindromeSubsequence flp = new LongestPallindromeSubsequence();
        String s = "qabddcddbapoq";
        t = new int[s.length()+1][s.length()+1];
        String reverse = reverseString(s);
        System.out.println(longestPalindrome(s,s.toCharArray(), reverse.toCharArray(), s.length()));
    }
}
