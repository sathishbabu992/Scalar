package Prefixsum.DynamicProgramming;

import java.time.format.SignStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DP11 {
    
    public static int lengthOfLIS(int[] nums) {
        int ans =Integer.MIN_VALUE;
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            System.out.println();
            ans = Math.max(ans,c);
        }
        return ans;
    }

    // public static List<List<Integer>> permute(int[] nums) {
        
    //     List<List<Integer>> ans = new ArrayList<List<Integer>>();
    //      List<Integer> a = new ArrayList<>();
    //     perList(nums,ans,a,nums.length);
    //     return ans;
    // }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

         List<Integer> a = new ArrayList<>();
        //  HashSet<ArrayList<Integer>> h = new HashSet<>();
        perList(nums,ans,a,0);
        // for(ArrayList<Integer> i:h){
        //     System.out.println(i);
        //     ans.add(i);
        // }
        return ans;
    }
   static void perList(int[] nums, List<List<Integer>> ans,List<Integer> a,int size){
        if(a.size()==nums.length) {

              ans.add(new ArrayList<Integer>(a));
              for(List<Integer> i:ans){
                System.out.println(i);
             }
            return;
            }
        for(int i=size;i<nums.length;i++){
            // if(a.contains(nums[i])) continue;
            a.add(nums[i]);
            perList(nums,ans,a,size+1);
            System.out.println(size);
            a.remove(a.size()-1);
        }
    }
    static void myfun(List<Integer> l,int i){
        if(i+1==l.size()) return;
        System.out.println("beofe swap :"+l);
        
        Collections.swap(l, i+1, i);
        
        myfun(l, ++i);
        Collections.swap(l, i, i-1);
       
        // if(i+1<l.size()){
        //     Collections.swap(l, i, i+1);
        // } 
            // Collections.swap(l, i, i+1);     
        
        // myfun(l, i);
        System.out.println("after swap :"+l+""+i);
    
        return;
    }
    public static void main(String[] arg){
        int[] A ={1,2,3,4,5};
        // System.out.print(lengthOfLIS(A));
        // ArrayList<Integer> a1 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        List<Integer> l1 = Arrays.asList(1,3,2,4,5);
       
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        // ans.add(l);
        // if(!ans.contains(l))
        //      ans.add(l);
        
        // System.out.println(ans.size());
        
        myfun(l,0);
        // permuteUnique(A);
        
    }
}
