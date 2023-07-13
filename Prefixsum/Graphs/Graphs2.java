package Prefixsum.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graphs2 {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static boolean isCycle;
    private static boolean dfs(int v, int previous) {
        visited[v] = true;
        for (int u : graph[v]) {
          if (u != previous) {
            if (!visited[u]) {
              dfs(u, v);
            } else {
              isCycle = true;
              return true;
            }
          }
        }
        return false;
      }

      private static boolean isCycleInUndirectedGraph(int A) {
        for (int i = 1; i <= A; i++) {
          if (!visited[i]) {
            dfs(i, 0);
          }
          if (isCycle) {
            break;
          }
        }
        return isCycle;
      }
    public static ArrayList<Integer>[] buildAdjacencyList(int A, int[][] B) {
        ArrayList<Integer>[] g = new ArrayList[A + 1];
        for (int i = 0; i <= A; i++) {
          g[i] = new ArrayList<>();
        }
        for (int[] num : B) {
          int u = num[0];
          int v = num[1];
          g[u].add(v);
          g[v].add(u);
        }
        // System.out.println(Arrays.toString(g));
        return g;
      }
    public static void main(String[] arg){
        int A=4;
        int[][] B ={{1,2},{2,3},{3,4}};
         
        isCycle=false;
        graph=buildAdjacencyList(A, B);
        visited=new boolean[A+1];

        HashMap<Integer,ArrayList<Integer>> h = new HashMap<>();
        for(int i=1;i<=A;i++){
            h.put(i,new ArrayList<>());
        }

        for(int i=0;i<B.length;i++){
            h.get(B[i][0]).add(B[i][1]);
            h.get(B[i][1]).add(B[i][0]);
        }
        System.out.println(Arrays.toString(graph));
        System.out.println(h);

        System.out.print(isCycleInUndirectedGraph(A));


    }
}
