package Prefixsum.DynamicProgramming;

import Prefixsum.stcaks;

public class DP9 {
    
    public static int solve(String A, String B) {
        return LCS(A,B,A.length(),B.length());
    }

    static int LCS(String A,String B,int n,int m){
        //  if(n==0 && m==0) return 1;
        if(n==0 || m==0) return 0;
        if(A.charAt(n-1)==B.charAt(m-1)){
            return 1+LCS(A,B,n-1,m-1);
        }
        return Math.max(LCS(A,B,n-1,m),LCS(A,B,n,m-1));
    }
    public static void main(String[] ar){
        String A="bebdeeedaddecebbbbbabebedc";
        String B="abaaddaabbedeedeacbcdcaaed";
        System.out.print(solve(A, B));
    }
}
