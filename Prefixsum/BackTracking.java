package Prefixsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.StyleSheet;



public class BackTracking {
    // public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {

    // }
   static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    // public static void print( List<Integer> ar , int i,ArrayList<Integer> curr){
    //     if(i==ar.size()) {

    //       return;
    //     }
    //     curr.add(ar.get(i));
    //     print(ar,i+1,curr);
        
    //     System.out.println(curr);
    //     curr.remove(curr.size()-1);
    //     print(ar,i+1,curr);
        
    //     System.out.println(curr);
    //     // return curr;
    // }
    public static ArrayList<ArrayList<Integer>> r = new ArrayList<>();
   
    public static ArrayList<ArrayList<Integer>> subsets(List<Integer> A) {
        Collections.sort(A);
        print(A,0,new ArrayList());
        return r;
    }

    static void computeSubSet(int index, List<Integer> A, ArrayList<Integer> tempList){
        //add currentlist to result as its valid subset
        res.add(new ArrayList(tempList));
        
        //for loop to iterate from start to end of inputlist
        for (int i=index; i <A.size();i++){
         //DO operation
         tempList.add(A.get(i));
         //Recursive call for next element
         computeSubSet(index+1, A, tempList);
         //UNDO operation
         tempList.remove (tempList.size()-1);
        }
       }
    
    public static void print(List<Integer> a, int i, ArrayList<Integer> curr){
        r.add(new ArrayList(curr));
        System.out.println(curr);
        for(int j=i;j<a.size();j++){
            curr.add(a.get(j));
            print(a,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
    public static void main(String[] arg){

        List<Integer> A = Arrays.asList(12, 13 );
        
         
        String a ="56...7.8..9";
        // System.out.println(a.contains("78"));
        //subsets(A);
        // computeSubSet(0,A, new ArrayList<>());
        // for(int i=0;i<res.size()-1;i++){
        //     System.out.println(res.get(i));
        // }
            int i=5;
        // System.out.println(3*(i3));  
    }
}
