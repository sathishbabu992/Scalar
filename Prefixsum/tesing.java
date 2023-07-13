package Prefixsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class tesing {
     

    static boolean  check(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2){
        for(Character x:hm1.keySet()){
            if(!hm2.containsKey(x)){
                 return false;
            }
             
        }
        return true;
    }
    public static void main(String[] a ) {
        
        List<Integer> A = Arrays.asList(  1, 7, 11, 8, 11, 7, 1 );
        
        List<List<Integer>> B = Arrays.asList(Arrays.asList(0, 1, 2, 3));

        ArrayList<Long> psum = new ArrayList<>();
        psum.add((long)A.get(0));
        for(int i=1;i<A.size();i++){
            psum.add(((psum.get(i-1)+A.get(i))*(long)Math.pow(26,i))%(int)Math.pow(10,9));
        }
        System.out.println(psum);
         ArrayList<Integer> res = new ArrayList<>();
         for(int i=0;i<B.size();i++){
             long ans = Integer.MAX_VALUE;
             int c=0; 
             int j=0;
             int l1= B.get(i).get(j);
             int r1=B.get(i).get(j+1);
             int l2=B.get(i).get(j+2);
             int r2=B.get(i).get(j+3);
              
             if(l1==l2 && r1==r2){
                 c++;
             }    
             else{
                 long hash=0l;
                 long temp =0l;
                 hash=(l1!=0)?psum.get(r1)-psum.get(l1-1):psum.get(r1);
                 temp = (l2!=0)?psum.get(r2)-psum.get(l2-1):psum.get(r2);
                 
                 if(temp==hash){
                     c++;
                 }
              }
             
          res.add(c);
         }
 
    }
    
}
