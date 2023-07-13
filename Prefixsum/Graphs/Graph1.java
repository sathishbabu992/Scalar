
package Prefixsum.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import Prefixsum.stcaks;

public class Graph1 {
    static void dfs(HashMap<Integer,HashSet<Integer>> h, int v, boolean[] status ){
        for(int i : h.get(v)){ 
            if(h.get(i).contains(v)){
                status[i]=true;
                return;
            } 
        } 
        return;
    }

    public static int solve(int A, int[][] B) {
        HashMap<Integer,HashSet<Integer>> h = new HashMap<>();
        for(int i=1;i<=A;i++){
            h.put(i,new HashSet<Integer>());
        }
        for(int i=0;i<B.length;i++){
            h.get(B[i][0]).add(B[i][1]);
        }

        for(int i:h.keySet()){
            for(int j:h.get(i)){
                h.get(j).add(i);
            }
        }
        // for(int i=1;i<=A;i++){
            System.out.println(h);
        // }
        boolean[]  status = new boolean[A+1];
        Arrays.fill(status,false);
        for(int i=1;i<=A;i++){
            dfs(h,i,status);
            System.out.println(Arrays.toString(status));
        }
        
        // System.out.print(Arrays.toString(status));
        for(int i=0;i<status.length;i++){
            if(status[i]) return 1;
        }
        return 0;
    }
    public static void main(String[] args){

        int A=7;
        int[][] B ={{1,2},{2,3},{3,1},{2,4},{2,5},{2,7},{4,6},{5,6}};
        System.out.print(solve(A, B));
    }
}
