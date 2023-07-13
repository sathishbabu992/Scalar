package testFolder;
import java.util.*;
class abc{

    class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) {
              val = x;
              left=null;
              right=null;
            }
        }

        class Solution {
            int min=Integer.MAX_VALUE;
            
            public ArrayDeque<Integer> s;
            
            public Solution(int v){
               s = new ArrayDeque();
            }
        
            public void push(int x) {
                if(x<min){

                }
            }
        
            public void pop() {
                if(!s.isEmpty()) s.pop();
            }
        
            public int top() {
                if(!s.isEmpty()) s.peek();
                return -1;
            }
        
            public int getMin() {
                int m= Integer.MAX_VALUE;
                return m;
            }
        }
    public static void main(String[] a){ 
        

        byte b=(byte)129;
        
      String A="nmnn";
      int n=A.length();
        int[] ch=new int[26];
        for(int i=0;i<n;i++){
           ch[A.charAt(i)-'a']++;
        }

        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<A.length();i++){
             h.put(A.charAt(i)-'a',h.getOrDefault(A.charAt(i)-'a',0)+1);
        }

        System.out.println(h);

        for(int i=1;i<25;i++){
            if(h.containsKey(i) && h.containsKey(i-1) && h.containsKey(i+1)){
           
                if(h.get(i)+h.get(i-1)+h.get(i+1)==A.length()){
                    // return 0;
                    System.out.println(i);
                }
            }
       }

        for(int i=1;i<25;i++){
            if(ch[i]+ch[i-1]+ch[i+1]==n){
                // return 0;
                System.out.println(i);
            }
        }
        
        System.out.println(Arrays.toString(ch));
    }
}