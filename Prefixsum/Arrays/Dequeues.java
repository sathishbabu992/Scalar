 
 package Prefixsum.Arrays;
import java.util.*;
public class Dequeues {

    public static void main(String[] arg){
        int[] nums= {-7,-8,7,5,7,1,6,0};
        int k=4; 
        HashMap<Integer,Integer> h = new HashMap<>();
        // h.keySet();
        for(int i:h.keySet()){
            if(h.get(i)>1){
                h.remove(i);
            }
        }
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=0;i<k-1;i++){
            if(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
        }
        for(int i=k-1;i<nums.length;i++){
            if(dq.peekFirst()<i-k+1){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                    dq.pollLast();
            }
            dq.addLast(i);
            A.add(nums[dq.peekFirst()]);
        }

        System.out.print(A);
    }
    
}
