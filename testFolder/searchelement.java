package testFolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;
public class searchelement {

    // public static ArrayList<Integer> solve(List<Integer> A, List<Integer> B,int C){
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     HashMap<Integer,ArrayList<Integer>> h = new HashMap<>();
        
    //     for(int i=0;i<A.size();i++){
    //         int aval=A.get(i);
    //         int l=0,r=B.size();
            
    //         int temp=Integer.MAX_VALUE;
    //         while(l<r){
    //             ArrayList<Integer> temp1 = new ArrayList<>();
    //             int mid=(l+r)/2;
    //             if(aval+B.get(mid) >C){
    //                 r=mid-1;
    //             }
    //             else if(aval+B.get(mid)<C){
    //                 l=mid+1;
    //             }
    //             else{
    //                 temp1.add(i);
    //                 temp1.add(mid);
    //                 temp=Math.min(temp,Math.abs(aval+B.get(mid)-C));
    //                 if(!h.containsKey(temp)){
    //                     h.put(temp,temp1);
    //                 }
    //                 else if(h.get(temp).get(0)>i && h.get(temp).get(1)>mid){   
    //                     h.put(temp, temp1);
    //                 }
    //             // System.out.println(h);
    //                 break;
    //             }            
    //             temp=Math.min(temp,Math.abs(aval+B.get(mid)-C));
    //             temp1.add(i);
    //             temp1.add(mid);
    //             if(temp==0){System.out.println(i+"\t"+mid+"\t"+A.get(i)+","+B.get(mid));}
              
    //             if(!h.containsKey(temp)){
    //                 h.put(temp, temp1);
    //             }
    //             else if(h.get(temp).get(0)>i && h.get(temp).get(1)>mid){
    //                 h.put(temp, temp1);
    //             }
                
    //             // System.out.println(h);
    //         }

    //     }
    //     // ans.add(A.get(h.get(temp).get(0)));
        
    //     // ans.add(B.get(h.get(temp).get(1)));
    //     return ans;
    // }
 
    public static int[] solve(int[] A, int[] B, int c) {
        int m = A.length;
        int n = B.length;
        int result[] = new int[2];
        int mindiff = Integer.MAX_VALUE;
        int left = 0;
        int right = n-1;
        while(left < m && right >=0){
            int diff = Math.abs(A[left] + B[right] - c);
            if(diff == mindiff && A[left] == result[0])
            {
                result[1] = B[right];
            }
            if(diff < mindiff){
                mindiff = diff;
                result[0] = A[left];
                result[1] = B[right];
            }
       

            if((A[left] + B[right] ) > c){
                right--;
            }else{
                left++;
            }
        }
        return result;
    }

    public static int count (int a,int b){
        if(b==0) return a;
        if(b>a) a++;
        int c=  count(a, b-1);
        System.out.print(b+" ");
       return c;
    }

    public static void main(String[] arg){

 
        //  List<Integer> A= Arrays.asList(2, 5, 7, 21, 40, 51, 53, 54, 60, 70, 77, 88, 92, 93, 97, 110, 115, 117, 121, 147, 156, 158, 173, 187, 202, 205, 211, 216, 228, 230, 233, 249, 256, 276, 296, 307, 308, 330, 346, 376, 388, 397, 407, 424, 435, 449, 462, 463, 472, 481, 482, 488, 497, 498 );
        //  List<Integer> B = Arrays.asList(4, 11, 16, 17, 30, 36, 37, 43, 65, 66, 77, 80, 96, 97, 98, 134, 162, 174, 190, 197, 206, 219, 221, 227, 228, 242, 249, 251, 261, 262, 265, 279, 281, 283, 296, 323, 332, 334, 351, 354, 361, 362, 384, 399, 404, 410, 425, 427, 455, 461, 462, 475, 477, 497);
         
        //  int[] A={2, 5, 7, 21, 40, 51, 53, 54, 60, 70, 77, 88, 92, 93, 97, 110, 115, 117, 121, 147, 156, 158, 173, 187, 202, 205, 211, 216, 228, 230, 233, 249, 256, 276, 296, 307, 308, 330, 346, 376, 388, 397, 407, 424, 435, 449, 462, 463, 472, 481, 482, 488, 497, 498};
        //  int[] B={4, 11, 16, 17, 30, 36, 37, 43, 65, 66, 77, 80, 96, 97, 98, 134, 162, 174, 190, 197, 206, 219, 221, 227, 228, 242, 249, 251, 261, 262, 265, 279, 281, 283, 296, 323, 332, 334, 351, 354, 361, 362, 384, 399, 404, 410, 425, 427, 455, 461, 462, 475, 477, 497};
        //  int C=420;

        //  System.out.println(Arrays.toString(solve(A, B, C)));

        


    }
}
