package Prefixsum;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
public class testing2 {
   
    static List<Integer> merge(List<Integer> A, List<Integer> B){
        List<Integer> res = new ArrayList<>();
        int p1=0,p2=0;
        while(p1<A.size() && p2<B.size()){
            if(A.get(p1)<=B.get(p2)){
                res.add(A.get(p1));
                p1++;
            }
            else{
                res.add(B.get(p2));
                p2++; 
            }
        }

        while(p1<A.size()){
            res.add(A.get(p1));
            p1++;   
        }

        while(p2<B.size()){
            res.add(B.get(p2));
            p2++;
        }

        return res;
    }
   
   static boolean check(List<Integer> A, int k,int B){
        for(int i=0;i<A.size();i++){
            int sum=0;
            if(k+i<A.size()){
                for(int j=i;j<=k+i;j++){
                    sum+=A.get(j);
                }
                if(sum>B){
                    return true;
                }
            }
            else{
                return false;
            }
            
        }
        return false;
    }
    public static void main(String[] arg){ 

        List<Integer> A = Arrays.asList(   1, 7, 11, 8, 11, 7, 1);
        List<List<Integer>> B = Arrays.asList(Arrays.asList(0, 2, 4, 6));

        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0;i<B.size();i++){
            long ans = Integer.MAX_VALUE;
            int c=0; 
            int j=0;
            int l1= B.get(i).get(j);
            int r1=B.get(i).get(j+1);
            int l2=B.get(i).get(j+2);
            int r2=B.get(i).get(j+3);
            long hash=0l;
            int temp=0;  
            if(l1==l2 && r1==r2){
                c++;
            }    
            else{
                for(int k=l1;k<=r1;k++){
                    hash+=A.get(k)*(long)Math.pow(26,temp++);
                }
                temp--;
                for(int k=l2;k<=r2;k++){
                    hash-=A.get(k)*(long)Math.pow(26,temp--);
                }
                if(hash==0){
                    c++;
                }
             }
            
         res.add(c);
        }

        System.out.println(res);
    }
 
}
