package Prefixsum.DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DP3 {
 
    public static void main(String[] arg){
        int[][] A = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] dp = new int[A.length+1][A[0].length+1];
         dp[0][0]=A[0][0];
        
         for(int i=1;i<A.length;i++){
            if(A[0][i]==0){
                dp[0][i]=0;
            }
            else{
                dp[0][i]=dp[0][i-1];
            }
         }
        
         for(int i=1;i<A[0].length;i++){
            if(A[i][0]==0){
                dp[i][0]=0;
            }
            else{
                dp[i][0]=dp[i-1][0];
            }
         }

         System.out.println(Arrays.toString(dp[0]));
         for(int i=1;i<A.length;i++){
            for(int j=1;j<A[0].length;j++){
                if(A[i][j]==1){
                    dp[i][j]=1;
                    System.out.println(Arrays.toString(dp[i]));
                }
                else{
                    dp[i][j]= dp[i-1][j]+dp[i][j-1];
                }
            }
         }
         System.out.println(dp[A.length][A[0].length]);

    }
    
}
