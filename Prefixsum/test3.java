package Prefixsum;

import java.math.BigInteger;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;
import javax.print.FlavorException;
import javax.swing.text.AbstractDocument.LeafElement;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.AbstractCollection;

import java.util.AbstractSet;
import java.lang.*;
import java.util.*;

import java.io.*;
// import java.
import java.util.Arrays;
import java.util.ArrayList;
// import java.lang.*;
import java.util.HashSet;
import java.io.OutputStream;

class Simple1 extends Thread{  
    public void run(){ 
        for(int i=1;i<=100;i++){
            System.out.print(i+" "); 
        }  
        // System.out.println();
    }  
   }  
     
class Simple2 extends Thread{  
    public void run(){   
        for(int i=101;i<=200;i++){
            System.out.print(i+" "); 
        }   
    }  
   }  


        class Node
        {
            int data;
            Node next;  
            Node(int d)
            {
                data = d;
                next = null;
            }
        }





public class test3 {

    static String solve(Node A){ 
        if(A==null) return "";
        //  solve(A.next);
        // System.out.println(A.data);
        return ""+A.data+solve(A.next);
    }
    static Node head;
     
    
    
    
    
    
    
    
    public static void main(String[] arg){
        // int[] A = {30, 4, 20, 71, 69, 9 ,16 ,41 ,50 ,97 ,24 ,19, 46 ,47 ,52 ,22 ,56 ,80 ,89, 65, 29, 42, 51 ,94, 1, 35 ,65 ,25 ,15, 88 ,57, 44, 92, 28};
         
  
        int[] A = {52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70};
    
        int B=19;        
        int s=0,e=0,c=0;
        System.out.println(Arrays.toString(A));
        for(int i=0;i<A.length;i++){
            if(A[e]>B){
                e+=1;
            }
            else{
                for(int j=0;j<e;j++){
                    if(A[j]>B){
                        s=j; 
                        c+=1;
                        break;
                    }
                }
                int temp = A[e];
                A[e]=A[s];
                A[s]=temp;
            }
        } 

 
        System.out.println(Arrays.toString(A)+"\t"+s+"\t"+e+"\t"+c);
      
        // int total = Integer.parseInt(solve(l1))+Integer.parseInt(solve(l2));
        
        // System.out.println(total);
         
        // System.out.println(A);
        // System.out.println(Integer.toBinaryString(32));
        
        // // A = ((A & 0xffff0000) >>16)| ((A& 0x0000ffff)<<16);
        // // A = ((A & 0xff00ff00) >>8) | ((A & 0x00ff00ff)<<8);
        // A = ((A & 0xf0f0f0f0) >>4) | ((A & 0x0f0f0f0f)<<4);
        // A = ((A & 0xcccccccc) >>2) | ((A & 0x33333333)<<2);
        // A = ((A & 0xaaaaaaaa) >>1) | ((A & 0x55555555)<<1);

        // A>>=2;
        // System.out.println(A);
        // System.out.println(Integer.toBinaryString(A));
   
    }

 
}  
 

