
package Prefixsum;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class bulbs {

    
    public static void main(String[] args){
        int[] A = {1,5,2,7,100,20,30,10};
        
        // PriorityQueue<Integer> pq =
        //  new PriorityQueue<>(B.length,new Comparator<Integer>() {
        //     public int compare(Integer x,Integer y){
        //         if(x<y) return -1;
        //         if(x>y) return 1;
        //         return 0;
        //     }
        //  }); 
        PriorityQueue<Integer> pq = new PriorityQueue<>(A.length,new Comparator<Integer>(){
             
            @Override
            public int compare(Integer a, Integer b) {
                 return a-b; 
 
            }
        });

        for(int i=0;i<A.length;i++){
            pq.add(A[i]);
        }

        System.out.print(pq);


    }
}
