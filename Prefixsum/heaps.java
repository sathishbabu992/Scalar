package Prefixsum;

import java.util.HashSet;

public class heaps {
    
    public static void main(String[] arg){
        int n=10;
        HashSet<Integer> h = new HashSet<>();
        for(int i=1;i<n;i++){
            if(i%2==0){
                h.add(i*2);
            }
            else if(i%3==0){
                h.add(i*3);
            }
            else if(i%5==0){
                h.add(i*5);
            }
        }

        System.out.print(h);
    }
}
