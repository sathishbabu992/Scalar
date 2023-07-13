package Prefixsum;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {

  public static String sortFun(String s){
    String[] str = s.split(" ");
    ArrayList<Integer> a = new ArrayList<>();
    for(int i=0;i<str.length;i++){
        if(Character.isDigit(str[i].charAt(0))){
            a.add(Integer.parseInt(str[i]));
        }
    } 
    
    for(int i=1;i<a.size();i++){
      if(a.get(i-1)>a.get(i)) return ""+0;
    }
    return "1";
  }
    public static void main(String[] arg){
        int[] A = {2, -1, 3};
        int B=2;

        String s = "    -9000";
        BigInteger b =new BigInteger(s);
        System.out.print("hiii "+b.intValue());

        // Deque<Integer> dq = new LinkedList<>();
        // int min=Integer.MAX_VALUE;
        // int max= Integer.MIN_VALUE;
        // for(int i=0;i<B;i++){
        //   min=Math.min(min,A[i]);
        //   max=Math.max(max,A[i]);
        //   dq.add(A[i]);
        // } 

        // int mod =1000000007;
        // long sum = (min+max)%mod;

        // for(int i=B;i<A.length;i++){
        //   int p=dq.poll();
        //   if(p==min || p==max){
        //       max = Integer.MIN_VALUE;
        //       min=Integer.MAX_VALUE;
        //       ArrayList<Integer> tmp = new ArrayList<>();
        //       while(!dq.isEmpty()){
        //           int t = dq.poll();
        //           min=Math.min(min,t);
        //           max=Math.max(max,t);
        //           tmp.add(t);
        //       }

        //       for(int j=0;j<tmp.size();j++){
        //           dq.add(tmp.get(i));
        //       }
        //   }
          
        //     min=Math.min(min,A[i]);
        //     max=Math.max(max,A[i]);
        //     dq.add(A[i]);
        //     sum=((sum%mod)+((min+max)%mod))%mod;
        // }

        // System.out.println(sum);



          

        


        // PriorityQueue<Integer> pq =
        //  new PriorityQueue<>(B.length,new Comparator<Integer>() {
        //     public int compare(Integer x,Integer y){
        //         if(x<y) return -1;
        //         if(x>y) return 1;
        //         return 0;
        //     }
        //  }); 
         
        // Queue<Integer> pq = new LinkedList<>();
          
        //  int[] res = new int[B.length];

        //  for(int i=0;i<B.length;i++){
        //     pq.add(B[i]);
        //  }
          
        // long sum=0;
        // int mod=1000000007;
        //  while(A!=0){
        //    int temp= pq.remove();
        //    sum=(sum+temp*1l)%mod;
        //    pq.add((int)Math.floor(temp/2));
        //    A--;
        //  }
        //  System.out.println(sum);
    }
    
}
