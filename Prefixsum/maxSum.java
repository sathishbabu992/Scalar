package Prefixsum;
import java.util.*;
import java.util.stream.Stream;
public class maxSum {
    static long gcd(long B,long C){
        if(B==0) return C;
        return gcd(C%B,B);
    }
    static long fun(long A,long B,long C){
        long lcm = (B*C)/gcd(B,C);
        long ans = (((A/B)+(A/C))-(A/lcm));
        return ans;
    }

    public static int solve(int A, int B, int C) {
        int mod=(int)Math.pow(10,9)+7;
        long l=1;
        long b=B;
        long c=C;
        long a=A;
        long h=a*Math.min(b,c);
        long ans = -1;
        while(l<=h){
            long mid=(l+h)/2;
            // long count = fun(mid,B*1l,C*1l);
            if(fun(mid,b,c)>=A){
                ans=mid%mod;
                h=mid-1;
            }  
            else{ 
                l=mid+1;
            }
        }

        return (int)ans%mod;
    }

    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList <Integer> retarr= new ArrayList<>();
        HashMap <Integer,Integer> freqmap= new HashMap<>();
        HashMap<Integer, Stack<Integer>> stackmap=new HashMap<>();
        int n=A.size();
        int maxfreq=0;
        int freq=0;
        for(int i=0;i<n;i++){
             int optype= A.get(i).get(0);
             int data= A.get(i).get(1);
            if(optype==1){
                Stack<Integer> st=new Stack<>();
                freqmap.put(data, freqmap.getOrDefault(data,0)+1);
                freq=freqmap.get(data);
                if(freq>maxfreq){
                    maxfreq=freq;
                }
                st=stackmap.get(freq);
                if(st==null){
                    st= new Stack<>();
                    st.push(data);
                }
                else{
                    st.push(data);
                }
            stackmap.put(freq,st);
            retarr.add(-1);
            }
            else{
                Stack <Integer> st= stackmap.get(maxfreq);
                int val= st.pop();
                freqmap.put(val,freqmap.get(val)-1);
                    if(st.isEmpty()){
                        maxfreq--;
                    }
                    retarr.add(val);
                }
            }
            return retarr;
        }
        
    public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A){
        ArrayList<ArrayList<Integer>> r = new ArrayList<>();

        return r;
    }


    public static int solve(int[] A, int[] B) {
        int ans = 0;
        int n = A.length;
        HashMap<Double,Integer> mp = new HashMap<>();
        for(int i = 0;i<n;i++){
            int cnt = 0;
            for(int j = 0;j<n;j++){
                if(A[i]==A[j] && B[i]==B[j]){
                    cnt++;
                    continue;
                }
                double slope = (double)(B[j]-B[i])/(double)(A[j]-A[i]);
                mp.put(slope,mp.getOrDefault(slope,0)+1);
            }
            ans = Math.max(ans,cnt);
            for(double tmp:mp.keySet()){
                ans = Math.max(ans,mp.get(tmp)+cnt);
            }
            mp.clear();
        }
        return ans;
    }

    public static int specialMedian(ArrayList<Integer> A) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    
        maxHeap.add(A.get(0));
        int median = maxHeap.peek();
        for (int i = 1; i < A.size(); i++) {
            if (median == A.get(i)) {
                return 1;
            }
            if (!maxHeap.isEmpty() && A.get(i) < median) {
                maxHeap.add(A.get(i));
            } else {
                minHeap.add(A.get(i));
            }
            if (maxHeap.size() - minHeap.size() > 1) {
                minHeap.add(maxHeap.poll());
            } else if (minHeap.size() - maxHeap.size() > 1) {
                maxHeap.add(minHeap.poll());
            }
            if (maxHeap.size() == minHeap.size()) {
                median = (maxHeap.peek() + minHeap.peek()) / 2;
            } else {
                median = maxHeap.peek();
            }
        }
    
        maxHeap.removeAll(maxHeap);
        minHeap.removeAll(minHeap);
    
        maxHeap.add(A.get(A.size() - 1));
        median = maxHeap.peek();
        for (int i = A.size() - 2; i >= 0; i--) {
            if (median == A.get(i)) {
                return 1;
            }
            if (!maxHeap.isEmpty() && A.get(i) < median) {
                maxHeap.add(A.get(i));
            } else {
                minHeap.add(A.get(i));
            }
            if (maxHeap.size() - minHeap.size() > 1) {
                minHeap.add(maxHeap.poll());
            } else if (minHeap.size() - maxHeap.size() > 1) {
                maxHeap.add(minHeap.poll());
            }
            if (maxHeap.size() == minHeap.size()) {
                median = (maxHeap.peek() + minHeap.peek()) / 2;
            } else {
                median = maxHeap.peek();
            }
        }
        return  0;
    }

    public static void main(String[] arg){
         
        int[] A = {2147483647, -2147483648, 0};
        int[] B = {1, 0, 1, 2, 3, 4};

        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            a.add(A[i]);
        } 


        System.out.println(specialMedian(a));
        // System.out.println(solve(A,B));
    }   
}
