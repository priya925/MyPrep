package org.example.knapsack;

public class LongestCommonSubsequence {
    static int[][] t;
    StringBuilder str;
    public static void main(String[] args){
        String a = "abcdgh";
        String b = "abcdfhr";
        t = new int[a.length()+1][b.length()+1];

        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        lcs.str = new StringBuilder("");
        int longestCommonSubsequenceLength = lcs.findLongestCommonSubsequenceLength(a.toCharArray(), b.toCharArray(), a.length(),b.length());
        System.out.println(lcs.str);
        System.out.println(longestCommonSubsequenceLength);

    }
    public int findLongestCommonSubsequenceLength(char[] a, char[] b, int firstStringLength, int secondStringLength ){
        if(firstStringLength ==0 || secondStringLength == 0)
            return 0;
        for(int i=0; i<firstStringLength;i++){
            for(int j=0; j<firstStringLength; j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
//        if(t[firstStringLength][secondStringLength] != -1)
//            return t[firstStringLength][secondStringLength];
        for(int i=1; i<=firstStringLength;i++){
            for(int j=1; j<=secondStringLength;j++){
                if(a[i-1] == b[j-1]) {
                    t[i][j] = 1 + t[i-1][j-1];
                    str.append(a[i-1]);
                }

                else
                    t[i][j] = Integer.max(t[i][j-1], t[i-1][j]);
            }
        }
//        if(a[firstStringLength-1] == b[secondStringLength-1]) {
//            t[firstStringLength][secondStringLength] = 1+ findLongestCommonSubsequenceLength(a, b, firstStringLength-1, secondStringLength-1);
//        }
//        else
//            t[firstStringLength][secondStringLength] = Integer.max(findLongestCommonSubsequenceLength(a,b,firstStringLength,secondStringLength-1),
//                    findLongestCommonSubsequenceLength(a,b,firstStringLength-1, secondStringLength));
        return t[firstStringLength][secondStringLength];


    }
}
