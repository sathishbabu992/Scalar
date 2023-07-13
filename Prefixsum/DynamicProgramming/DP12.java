package Prefixsum.DynamicProgramming;

import java.util.Arrays;

public class DP12 {
    static int[][] dp;
    static int card(int A,int B,int C){
        if(B==A && C==0) return 1;
        dp[B][C]=B*C+card(A,B+1,C-1);
        System.out.println(Arrays.toString(dp[B]));
        return dp[B][C];
    }
    public static void main(String[] arg){
        int A= 3;
        dp=new int[A][A+1];

        System.out.print(card(A, 0, A));   
    }
}
