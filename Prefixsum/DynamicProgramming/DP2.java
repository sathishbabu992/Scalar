package Prefixsum.DynamicProgramming;

import java.util.Arrays;
import java.util.List;

public class DP2 {
    static int product(List<Integer> a,int ind){
        if(ind==a.size()) return 1;
        int ans = Integer.MIN_VALUE;
  
        return ans;
    }

    public static void main(String[] arg){

        List<Integer> A = Arrays.asList(0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        int m=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.size();j++){
                m=Math.max(m,A.get(i)*A.get(j));
            }
        }

        System.out.println(m);
    }

}

