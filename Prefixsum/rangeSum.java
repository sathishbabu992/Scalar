package Prefixsum;

import java.util.Arrays;
import java.util.Scanner;

public class rangeSum {

    static long[] finalsum(int[] a, int[][] b){
        int N= a.length;
        long p[] = new long[N];
        p[0] = a[0];
        for(int i=1;i<N;i++){
            p[i]=p[i-1]+a[i];
        }
        // System.out.println("PreSum of "+p[b[0][0]-1]+" + "+p[b[0][1]]+" = "+(p[b[0][1]] - p[b[0][0]-1]));
        long res[] = new long[b.length];
        for(int i=0;i<b.length;i++){
            if(b[i][0] !=0){
             res[i]= p[b[i][1]] - p[b[i][0]-1];
            }
            else{
                res[i]= p[b[i][1]];
            }
        }
        
        return res;
    }
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        
        int a[] =  { 720, 79473, 40625, 68587, 35751, 5635, 86295, 522, 96613, 81173, 67463, 90371, 78911, 8415, 90539, 7434, 22848, 78504, 42592, 78437, 47656, 31353, 28830, 95539, 35937, 51021, 90271, 1033, 74361, 25764, 64718, 58167, 93537, 17975, 13742, 2634, 45537, 91654, 86884, 56650, 34901, 49740, 66242, 53124, 65641, 23508, 51824, 55362, 4588, 58149, 74521, 87189, 68404, 90425, 81135, 71093, 878, 24107, 21212, 92863, 38175, 27983, 89671, 91069, 860, 94171, 97407, 26212, 75331, 73347, 15815, 9495, 82165, 58371, 66174, 88296, 55024 };
        int b[][] =  {{0,0},{5,0}};

       long res[] =  finalsum(a,b);
        System.out.println(res[0]+" "+res[1]);
    }
    
}
