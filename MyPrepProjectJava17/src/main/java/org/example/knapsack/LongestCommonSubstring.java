package org.example.knapsack;

public class LongestCommonSubstring {
    static int[][] t;
    static  StringBuilder str;
    public static void main(String[] args){
        LongestCommonSubstring lcs = new LongestCommonSubstring();
        String a = "abcdefgh";
        String b = "abcdefmn";
        t = new int[a.length()+1][b.length()+1];
        str = new StringBuilder("");
        int lognestCommonSubStringLength = lcs.findLongestCommonSubStringLength(a.toCharArray(), b.toCharArray(), a.length(),b.length());
        System.out.println(str);
        System.out.println(lognestCommonSubStringLength);
    }

    public int findLongestCommonSubStringLength(char[] a, char[] b, int firstStringLength, int secondStringLength){
        if(firstStringLength == 0 || secondStringLength == 0 )
            return 0;
        for(int i =0; i<=firstStringLength; i++){
            for(int j=0; j<=secondStringLength; j++){
                if(i==0 || j==0)
                    t[i][j] = 0;
            }
        }
        for(int i=1; i<=firstStringLength; i++){
            for(int j=1; j<=secondStringLength; j++){
                if(a[i-1] == b[j-1]){
                    str.append(a[i-1]);
                    t[i][j] = 1+ t[i-1][j-1];
                } else
                    t[i][j] = t[i-1][j-1];
            }
        }
        return t[firstStringLength][secondStringLength];
    }
}
