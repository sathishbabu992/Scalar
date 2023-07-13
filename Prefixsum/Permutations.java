package Prefixsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;


public class Permutations {
    public static class tmp11{
        int tmp1;
    }
    
    
   static void permute(int l,int r,ArrayList<Integer> A, ArrayList<ArrayList<Integer>> res){
        if(l==r){
            if(!res.contains(A)){
                res.add(new ArrayList<>(A));
                System.out.println(A);
            }
        }
        for(int i=l;i<r;i++){
            Collections.swap(A,l,i);
            permute(l+1, r, A, res);
            Collections.swap(A, l,i);
        }
   }
   static ArrayList<ArrayList<Integer>> r = new ArrayList<>();
 
    public static  ArrayList<ArrayList<Integer>> subsets(List<Integer> A) {
        Collections.sort(A);
        r.add(new ArrayList());
        print(A,0,new ArrayList());
        return r;
    }

    public static void print(List<Integer> a, int i, ArrayList<Integer> curr){
        if(i==a.size()) return;
        curr.add(a.get(i));
        // System.out.println(curr);
        r.add(new ArrayList(curr));
        print(a,i+1,curr);
        System.out.println("1st recursion : "+i);
        curr.remove(curr.size()-1);
        print(a,i+1,curr);
        System.out.println("2nd recursion : "+i);
    }


    static void test(int n){
        if(n==6) return;
        System.out.print(n+"\t");
        for(int i=0;i<5;i++){
            test(n+1);
        }
        // System.out.print(n+"\t");
    }

    public static String testing(List<Integer> A){
        

        return "";
    }

    public static String largestNumber(final List<Integer> A) {
        if(A.size() == 1) return String.valueOf(A.get(0));
        int count = 0;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) == 0) count++;
        }
        if(count == A.size() || A.isEmpty()) return "0";
        
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<A.size(); i++){
            list.add(A.get(i)+"");
        }
        Collections.sort(list,(a,b) -> (b + a).compareTo(a + b));
        String ans = String.join("", list);// you can use stringBuilder to reduce 
        return ans;                         //space complexity;
    } 
    public int solve(ArrayList<ArrayList<Integer>> A) {
        
        
        
        int m1=Math.min(A.get(0).get(0),A.get(0).get(1));
        int m2= Math.max(A.get(0).get(0),A.get(0).get(1));
        
         return 0;
    }

    static class Pair{
        int first,second;
        public Pair(int f,int s){
            this.first=f;
            this.second=s;
        }
    }

   static class Box{

        int width;
    
        int height;
    
        int length;
    
        void volume(){
    
            System.out.println(length * width * height);
    
        }
    
    }
    public static void main(String[] arg){
   

        
    tmp11 t = new tmp11();
    t.tmp1=10;
    System.out.println(t.tmp1);
        Box b = new Box();

        b.height = 5;

        b.width = 4;

        b.volume();
        // int[][] t = { {0, 14},{18, 23},{15, 29},{4, 15},{2, 11},{5, 13}};
        // PriorityQueue<Pair> pq = new PriorityQueue<>(t.length,new Comparator<Pair>(){
        //     public int compare(Pair a,Pair b){
        //         return (a.first>b.first)?1:-1;
        //     }
        // });
        // for(int i=0;i<t.length;i++){ 
        //     // Pair p = new Pair(t[i][0],t[i][1]);
        //     pq.add(new Pair(t[i][0],t[i][1]));
        // }

        // Pair p = pq.remove();
        // int m1 = Math.min(p.first,p.second);
        // int m2 = Math.max(p.first,p.second);

        // int c=0;
        // while(!pq.isEmpty()){
        //     Pair p1 = pq.remove();
        //     if(p1.first>=m1 && p1.second<=m2){
        //         c++;
        //     }
        //     else{
        //         m1=Math.min(p1.first,m1);
        //         m2=Math.max(p1.second,m2);
        //     }
        // }

        // System.out.println(c);

        //  ArrayList a = new ArrayList<>();
        //  a.add("hi");
        //  a.add(0,"h");
        //  System.out.println(a.size());
        // subsets(A);

        // permute(0,A.size(),curr,res);
    }
    
}
