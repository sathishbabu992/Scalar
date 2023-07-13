

package Prefixsum.DynamicProgramming;

import java.util.Arrays;

public class DP7 {

    static int[] checkCol(int[][] mat,int col){
        int[] r = new int[mat.length];
        for(int i=0;i<mat.length;i++){ 
            r[i]=mat[i][col];
        }
        return r;
    }
    public static void main(String[] arg){
 
        int[][] matrix = {{1,2,3},{3,1,2},{2,3,1}};
        for(int i=0;i<matrix.length;i++){
            int[] res = new int[matrix.length];
             for(int j=0;j<matrix[0].length;j++){
               res= checkCol(matrix, i);
             }
             Arrays.sort(res);
            //  Arrays.sort(matrix[i]);
            System.out.println(Arrays.toString(matrix[0])+"\t"+Arrays.toString(res)+"\t"+Arrays.equals(res, matrix[0]));
            // System.out.println("result array :"+);
            //  if(Arrays.equals(res, matrix[i])){
            //     System.out.print(i);
            //  }
        }
    }

}