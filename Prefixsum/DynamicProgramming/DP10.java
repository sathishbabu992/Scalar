package Prefixsum.DynamicProgramming;

import java.util.Arrays;

import Prefixsum.stcaks;

public class DP10 {

    public static int solve(int[] A, int[] B, int C) {
        int[] dp= new int[C+1];
        for(int i=1;i<=B.length;i++){
            for(int j=C;j>=0;j--){
                if(j>=B[i-1]){
                    dp[j]=Math.max(dp[j],dp[j-B[i-1]]+A[i-1]);
                }
            }
            System.out.println(Arrays.toString(dp));
        }
        return dp[C];
    }
    public static void main(String[] arg){
        int[] A={6, 10, 12};
        int[] B = {10, 20, 30};
        int C=50;
        System.out.print(solve(A,B,C));
    }
    
}
