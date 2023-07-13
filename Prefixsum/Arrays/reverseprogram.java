package Prefixsum.Arrays;

import java.util.*;
public class reverseprogram {
    static int[] reverse(int[] a, int start,int end){
        int temp=0;
        while(start<end){
            temp = a[start];
            a[start] = a[end];
            a[end]=temp;
            start++;
            end--;
        }
        return a;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int[] b = {2,3};

        
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        int[][] arr = new int[b.length][a.length];
       
        int n=a.length; 
        for(int i=0;i<b.length;i++){
            int[] temp = a.clone();
            reverse(temp,0,n-1);
            reverse(temp,n-(b[i]%n),n-1);
            reverse(temp,0,n-(b[i]%n)-1);
            for(int j=0;j<n;j++){
                arr[i][j] = temp[j];
                System.out.print(temp[j]+" ");
            }
            System.out.println();
        }

    }


}
