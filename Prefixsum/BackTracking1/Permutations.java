package Prefixsum.BackTracking1;

import java.util.Arrays;

class temp {
    protected String name;
}

public class Permutations {
    
    static int[] call(int[] A,int index,int[] B){
         for(int k=index;k<A.length;k++){
            B[index]=A[k];
            int t = A[index];
            A[index]=A[k];
            A[k]=t;
            //System.out.print(Arrays.toString(A));
            call(A,index+1,B);
            int tmp = A[index];
            A[index]=A[k];
            A[k]=tmp;
           // System.out.print(Arrays.toString(A));
            
         }

        return B;
    }
    static int[][] permute(int[] A){
        int[][] r = new int[A.length][A.length];
        int[] tmp = new int[A.length];
        for(int i=0;i<A.length;i++){
            tmp[i]=A[i];

        }

        return r;
    } 

    public static void main(String[] arg){
        int[] A = {1,2,3};
        
        int[][] res = new int[A.length][A.length];

        int[] tmp =new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            tmp[i]=A[i];
            res[i]=call(A,i,tmp);
            System.out.print(Arrays.toString(res[i]));
        }
    }
}
