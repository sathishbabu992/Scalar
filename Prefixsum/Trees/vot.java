package Prefixsum.Trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class vot {
    
    static class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) {
              val = x;
              left=null;
              right=null;
             }
         }
   
    
    public static TreeNode createBBST(int[] A, int s, int e){
        if(s>e) {
            return null;
        }
        int m = (s+e)/2;
        TreeNode root = new TreeNode(A[m]);
        root.left = createBBST(A, s, m-1);
        root.right = createBBST(A, m+1, e);
        return root;
    }

    public static int clear(int a,int i){
        if(i>10){
            
            return 1;
        } 
        System.out.println(a+"*"+i+"="+(a*i));
        int temp=1;
        for(int j=1;j<20;j++){
            clear(j, i+1);
            i=1;j++;
        } 
        //System.out.println(temp);
        return temp;
    }
 
    public static void main(String[] ar){

        List<Integer> A = Arrays.asList(90, 228);
 
        clear(10,1);
        //  int[] t = {1,2,3,4};
        //  TreeNode root = createBBST(t,0,A.size()-1);


    }
}
