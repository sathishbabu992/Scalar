package Prefixsum.PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
 
public class p1 {
    static class Pair{
        int key;
        int value;
        public Pair(int k,int v){
            this.key=k;
            this.value=v;
        }
    }
 
    public static void main(String[] arg){
        int[] A ={1,5,7,1};
        int[] B={7,8,8,8};

        Comparator<Pair> com = new Comparator<Pair>(){
            public int compare(Pair a,Pair b){
                return a.value-b.value;
            }
        };

        // ArrayList<Pair> pq= new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(A.length, com);
        for(int i=0;i<A.length;i++){
            pq.add(new Pair(A[i],B[i]));
        }
        // Collections.sort(pq,com);
        int v=1;
       // int LastEndTime = pq.get(0).value; 
        int LastEndTime = pq.remove().value; 
       
       
        for(int i=1;i<A.length;i++){
            // Pair p = pq.get(i);
            Pair p = pq.remove();
            int CurrStartTime = p.key;
            int CurrEndTime = p.value;
            if(CurrStartTime>=LastEndTime){
                v++;
                LastEndTime=CurrEndTime;
            }
        }

        System.out.print(v);

    }
    
}
