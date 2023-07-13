package Prefixsum.DynamicProgramming;

import java.util.Collections;
import java.util.List;

import Prefixsum.stcaks;

public class DP5 {
    public static int maxProduct(final List<Integer> A) {
        

        Collections.sort(A);

        return (A.get(A.size()-1)*A.get(A.size()-2))%1000000007;
    
    }
    public static void main(String[] arg){

        System.out.print(-29*-30);
    }
}
