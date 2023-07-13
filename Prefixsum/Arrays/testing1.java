package Prefixsum.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;
import java.io.*;
public class testing1 {

    static class Pair{
        int k;
        char v;
        public Pair(int key,char val){
            this.k=key;
            this.v=val;
        }

    }

    public static String frequencySort(String s) {
        // PriorityQueue<Pair>
        return "";
    }

    static class com1 implements Comparable<com1>{

        int rollno,marks;
        String name;
    
        public com1(int no,String name,int marks){
            super();
            rollno=no;
            this.name=name;
            this.marks=marks;
        }
    
        public int compareTo(com1 c){
            return (marks>c.marks)?1:-1;
        }
    
        public String toString1(com1 c){
            return "["+c.rollno+","+c.name+","+c.marks+"]";
        }
     
    }
    public static void main(String[] arg){
        
    }
}
