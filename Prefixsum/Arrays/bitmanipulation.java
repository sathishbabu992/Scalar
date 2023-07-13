package Prefixsum.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bitmanipulation {
    
    public static void main(String[] arg){
        int A=153,B=20; 
        List<Integer> l = Arrays.asList(101,2,4,6,7);
        // List<Integer> l1 =new ArrayList<>();
        // l.stream().filter(i->(i%2==0)).forEach(m ->{
        //     System.out.print(m);
        //     l1.add(m);
        // } );
        int sum=0;
        while(A!=0){ 
            sum+=Math.pow(A%10,3);
            A/=10;
        }
        System.out.print(sum);
    }
}
