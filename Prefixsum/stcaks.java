package Prefixsum;

import java.util.Stack;
 
public class stcaks {
    public static int solve(int[][] A) {
        int n=A.length,m=A[0].length,ans=Integer.MIN_VALUE;
        int[] left=new int[m];
        int[] rgt=new int[m];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                if(A[j][i]!=0)
                A[j][i]=A[j-1][i]+A[j][i];
            }
        }
        for(int i=0;i<n;i++){
            ans=Math.max(ans,max(A,i,m,left,rgt,st));
        }
        return ans;
    }

    public static int max(int[][] a,int row,int m,int[] left,int[] rgt,Stack<Integer> st){
        int val=0,max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
             while(st.size()>0&&a[row][st.peek()]>=a[row][i])
             st.pop();
             if(st.size()>0)
             left[i]=st.peek();
             else left[i]=-1;
             st.push(i);
         }
         st.clear();
         for(int i=m-1;i>=0;i--){
             while(st.size()>0&&a[row][st.peek()]>=a[row][i])
             st.pop();
             if(st.size()>0)
             rgt[i]=st.peek();
             else rgt[i]=m;
             st.push(i);
         }
         st.clear();
         for(int i=0;i<m;i++){
             val=(rgt[i]-left[i]-1)*a[row][i];
             max=Math.max(max,val);
         }
         return max;
    }


    public static void main(String[] arg){
        int[][] A ={   {0, 0, 1},
        {0, 1, 1},
        {1, 1, 1}   };

        System.out.println(solve(A));
    }
    
}
