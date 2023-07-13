package Prefixsum;

import java.util.Arrays;
import java.math.BigInteger;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;
import javax.print.FlavorException;
import javax.swing.text.AbstractDocument.LeafElement;

import org.omg.CosNaming._BindingIteratorImplBase;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.AbstractCollection;

import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.AbstractSet;
import java.lang.*;
import java.lang.annotation.Target;
import java.util.*;
import java.util.Collections;
import java.io.*;
// import java.
import java.util.Arrays;
import java.util.ArrayList;
// import java.lang.*;
import java.util.HashSet;
import java.io.OutputStream;
import java.util.Comparator;
import java.math.*;
public class test4 {
 
    static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    static long powFun(long A,long B,long M){
        if(B==0) return 1;
        long res = powFun(A, B/2, M);
        if(B%2==0){
            return (res*res)%M;
        }
        
        return ((res*res)%M * A%M)%M;
        
    }
 
    static long fact(long A, long M){
        if(A==0 || A==1) return 1;
        // long ans = fact((A-1),M);
        return (A%M)*fact((A-1),M);   
    }

    static ArrayList<Integer> gray(ArrayList<Integer> A, int B){
        if(B==0){ A.add(0); return A;}
        System.out.println((B^(B>>1)));
        A.add((B^(B>>1)));
        return gray(A,B-1);
    }
 
   static int invCount(ArrayList<Integer> A, int l,int r){
        if(l==r) return 0;
        int mid=(l+r)/2;
        int x= invCount(A,l,mid);
        int y = invCount(A,mid+1,r);
        int z= merge(A,l,mid,r);

        return x+y+z;
    }

    static int merge(ArrayList<Integer> A, int l,int mid, int r){
        int p1=l;
        int p2=mid+1;
        int c=0;
        ArrayList<Integer> temp = new ArrayList<>();
        while(p1<mid && p2<r){
            if(A.get(p1)<=A.get(p2)){
                System.out.println(A.get(p1)+"\t"+A.get(p2));
                temp.add(A.get(p1));
                p1++;
            }
            else{
                
                System.out.println(A.get(p1)+"\t"+A.get(p2));
                temp.add(A.get(p2));
                p2++;
                c+=mid-p1+1;
            }
        }
 
        // int i=0,j=0,cnt=0;
        // while(i<temp.size()){
        //     while(A.get(j)<temp.get(i)){
        //         cnt+=1;
        //         j+=1;
        //     }
        //     c+=cnt;
        //     i+=1;
        // }

        System.out.println(temp);
        System.out.println(A);

        return c;
    }
 
    public static void main(String[] args){ 
         
        int[] arr = {10,3,8,15,6,12,2,8,7,1}; 
        
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }

        System.out.println(invCount(a, 0, arr.length));
   
   
    }


}
