
package Prefixsum.DynamicProgramming;

import java.util.Arrays;

public class DP4 {
   static int[][] dp = new int[4][4];
    public static int Obstacles(int[][] A, int s,int e){
         

        return 0;
    }
    public static void main(String[] arg){

        int[][] A = {{0,0,0},{0,1,0},{0,0,0}};
          
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==0){
                    A[i][j]=1;
                }
                else{
                    A[i][j]=0;
                }
            }
        }

        dp[0][0]=A[0][0];
        for(int i=1;i<A.length;i++){
            if(A[0][i]==0){
                dp[0][i]=0;
            }
            else{
                dp[0][i]=dp[0][i-1];
            }
            
        }

        for(int i=1;i<A.length;i++){
            if(A[i][0]==0){
                dp[i][0]=0;
            }
            else{
                dp[i][0]=dp[i-1][0];
            }
        }
        
        
        // for(int i=0;i<dp.length;i++){
        //     System.out.println(Arrays.toString(dp[i]));
        // }

        for(int i=1;i<A.length;i++){
            for(int j=1;j<A[i].length;j++){
                if(A[i][j]==0){
                    dp[i][j]=0;
                }
                else{
                    //System.out.print(dp[i-1][j]+"\t"+dp[j][i-1]);
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
            System.out.println(Arrays.toString(dp[i]));
        }
        


         System.out.print(dp[A.length-1][A.length-1]);

    }
}
