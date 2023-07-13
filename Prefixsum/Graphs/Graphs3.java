package Prefixsum.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graphs3 {

    static class Pair{
        int A;
        int B;
        public Pair(Integer a,Integer b){
            this.A=a;
            this.B=b;
        }
    }
    static class temp implements Comparator<Pair>{

        @Override
        public int compare(Pair o1, Pair o2) {
            // TODO Auto-generated method stub
            if(o1.A>o2.A) return 1;
            if(o1.A<o2.A) return -1;
            if(o1.A==o2.A){
                if(o1.B>o2.B) return 1;
            }
            return 0;
        }
        
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1) c++;
            }
            h.put(i,c);
        }
        int[] r = new int[k];    
        PriorityQueue<Pair> pq = new PriorityQueue<>(h.size(),new temp());

        for(int i=0;i<h.size();i++){
            pq.add(new Pair(h.get(i),i));
        } 
        for (Pair pair : pq) {
            System.out.println(pair.A+"->"+pair.B);   
        }
        int i=0;
        while(i!=k){
            Pair p = pq.remove();
            r[i]=p.B;
            i++;
        } 
        return r;

    }

   static boolean dfs(HashMap<Integer,ArrayList<Integer>> h,boolean[] visited,int v){
        System.out.print(v+"->");
        
        visited[v]=true;
        for(int i=0;i<h.get(v).size();i++){
            if(!visited[h.get(v).get(i)]){
                dfs(h,visited,h.get(v).get(i));
            } 
        }
        if(visited[v]){
            return true;
        }
        
        return false;
   }

    public static void main(String[] arg){

        int[][] A = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int B=3;
        System.out.print(Arrays.toString(kWeakestRows(A,B)));

        // PriorityQueue<Pair> pq = new PriorityQueue<>(A.length,new temp());
        // for(int i=0;i<A.length;i++){
        //     pq.add(new Pair(A[i],i));
        // }
 
        // while(!pq.isEmpty()){
        //     Pair p = pq.remove();
        //     System.out.println(p.A+"->"+p.B);
        // }

        //  int A=5;
        //  int B=5;   
        //  for(int i=0;i<=A;i++){
        //     // System.out.print((A<<i)+"->"); //multipling by 2
        //     // System.out.print((B>>i)+"->");//divides by 2
        //     System.out.print((1|i)+"->");
        //  }
        // int[][] B = {{1,2},{2,3},{3,4},{4,5}};
        // HashMap<Integer,ArrayList<Integer>> h = new HashMap<>();
        // for(int i=1;i<=A;i++){
        //     h.putIfAbsent(i,new ArrayList<Integer>());
        // }
        // for(int i=0;i<B.length;i++){
        //     h.get(B[i][0]).add(B[i][1]);
        // }
        // System.out.print(h);
        // boolean[] visited = new boolean[A+1];
        // // visited[1]=true;
        // boolean isCycle=false;
        
        // System.out.print(dfs(h, visited, 1));
        // System.out.println(Arrays.toString(visited));
        // System.out.print(isCycle);
 
    }
 
    
}
