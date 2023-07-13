package Prefixsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class WindowString {
    
     

    public static class Integer{
        int i;
        boolean j;
        public int fun(){
            return i++;
        }
    }
    public static void main(String[] arg){

        Double d = 2.9;
        float f = 2.3f;
        char c = 'A';
        int a =35535;
        c=(char) ((char)c+2.6f); 

        Integer onj = new Integer();
        // System.out.print(onj.j);

        for(int i=0;i<10;i++){
            System.out.println(onj.fun());
        }

        // for(int i=0;true;i++){
        //     System.out.println("hello "+i);
        // }
        // String A = "ADOBECODEBANC";
        // String B = "ABC";
        // System.out.print(getMinWindow(A, B));

        // List<Integer> nums =  Arrays.asList(1,2,5,9,4,7,2);
        
        // Deque<Integer> dq = new LinkedList<>();
        // int k=3;
        // for(int i=0;i<nums.size();i++){
        //     dq.add(nums.get(i));
        // }
        // for(int i=0;i<k;i++){
        //     dq.addFirst(dq.pollLast());
        // }

        // int[] res = new int[nums.size()];
        // int i=0;
        // while(!dq.isEmpty()){
        //     res[i++]=dq.pollFirst();
        // }

        // System.out.print(Arrays.toString(res));

    }
}
