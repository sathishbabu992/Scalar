package Prefixsum.DynamicProgramming;

import java.util.Arrays;
 
public class DP8 {
    static int[] n;
    public static int change(int[] A,int N,int k){
        if(N==0){  
            return (k==0)?1:0;
        } 
        int ans = change(A,N-1,k);
        n[N-1]=ans;
        if(k>=A[N-1]){
            ans+=change(A,N-1,k-A[N-1]);
        }
        n[N-1]=ans;
        System.out.print(Arrays.toString(n));
        return ans;
    }
    public static void main(String[] arg){
        int[] A= {1,2,3};
        n= new int[A.length];
        int B=4;
        System.out.print(change(A, A.length, B));
    }
}
