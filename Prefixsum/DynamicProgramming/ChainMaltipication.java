package Prefixsum.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

import Prefixsum.stcaks;

public class ChainMaltipication {
    public static int solve(ArrayList<Integer> A) {
        int N = A.size();
        int[][] dp = new int[N][N];
        for(int i=0; i<N; i++){
            Arrays.fill(dp[i], -1);
        }
        return minops(A, 0, N-2, dp);
    }

    public static int minops(ArrayList<Integer> A, int left, int right, int[][] dp){
        if(left == right){
            return 0;
        }
        if(dp[left][right] != -1){
            return dp[left][right];
        }
        int ans = Integer.MAX_VALUE;
        for(int p=left+1; p<=right; p++){
            int cl = minops(A, left, p-1, dp);
            int cr = minops(A, p, right, dp);
            int cost = A.get(left)*A.get(p)*A.get(right+1);
            dp[left][right] = ans = Math.min(ans, cl+cr+cost);
            System.out.println(Arrays.toString(dp[left]));
        }
        return ans;
    }
    public static void main(String[] arg){ 
        int[] A = {40, 20, 30, 10, 30};
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            a.add(A[i]);
        }
        System.out.println(solve(a));

    }
    
}
