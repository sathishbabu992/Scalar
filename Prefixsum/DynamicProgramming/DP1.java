package Prefixsum.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DP1 {
    static int f[]=new int[6];
    
    public static int solve(int a){
        if(a==0) return 0;
        if(f[a]!=-1){
             return f[a];
            }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i*i<=a;i++){
            ans=Math.min(ans,solve(a-i*i)+1);
        }
        f[a]=ans;
        return ans;
    }
    public int minimumTotal(ArrayList<ArrayList<Integer>> a) {
        int sum=0;
        for(int i=0;i<a.size();i++){
            Collections.sort(a.get(i));
            for(int j=0;j<a.get(i).size();j++){
                if(a.get(i).get(j)>0){
                    sum+=a.get(i).get(j);
                    break;
                }
            }
        }
        return sum;
	}
    public static void main(String[] ar){
        // List<Integer> A = 
    }
}
