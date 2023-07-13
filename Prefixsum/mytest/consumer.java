package Prefixsum.mytest;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

import Prefixsum.stcaks;

public class consumer {
     
    class Pair{

        public String key;
        public int value;

        public Pair(String k,int v){
            this.key= k;
            this.value=v;
        }
    }

    public static void main(String[] ar){


        
        HashMap<String,Integer> h = new HashMap<>();

        h.put("abc",1);

        h.put("sbc",10);
        
        h.put("kbc",10);
        h.put("ubc",10);
        h.put("pbc",10);

        Comparator<Pair> com = new Comparator<Pair>(){
            public int compare(Pair a,Pair b){
                return a.value-b.value;
            }
        };
        // PriorityQueue<Pair> pq = new PriorityQueue<Pair>(, com);
       
    }

}
