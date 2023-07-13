package Prefixsum;
import java.util.*;
public class Equilibrium {
     static class ListNode {
             public int val;
             public ListNode next;
             ListNode(int x) { val = x; next = null; }
         }
        
        

       public static ListNode getMiddle(ListNode A){
            ListNode s=A;
            ListNode f=A;
            if(f!=null && f.next!=null){
                s=s.next;
                f=f.next.next;
            }
            return s;
       }
  

    public static ListNode mergeList(ListNode A, ListNode B){
        ListNode r = new ListNode(-1);
        ListNode h = r;
        h.next=null;
        while(A!=null && B!=null){
            if(A.val>B.val){
                h.next=B;
                h=h.next;
                B=B.next;
            }
            else{
                h.next=A;
                h=h.next;
                A=A.next;
            }
        }

        if(A!=null){
            h.next=A;
        }
        if(B!=null){
            h.next=B;
        }

        return r.next;
    }
    public static ListNode fun(ListNode A){
        if(A==null || A.next==null) return A;
        ListNode s=A;
        ListNode f = A;
        ListNode t=null;

        while(f!=null && f.next!=null){
            t=s;
            s=s.next;
            f=f.next.next;
        }

        t.next=null;

        ListNode n = fun(A);
        ListNode n1 = fun(s);
 
        return mergeList(n, n1);

    }

    public static ListNode reverseList(ListNode A, int B) {
        if(B==1) return A;
        ListNode t1 = A;
        ListNode ans = new ListNode(-1);
        ListNode a = ans;
        a.next=null;
        while(t1!=null){
            int c=0;
            ListNode n = new ListNode(-1);
            ListNode n1=n;
            n1.next=null;
            while(c!=B){
                n1.next=new ListNode(t1.val);
                n1=n1.next;
                t1=t1.next;
                c++;
            }
            ListNode n2 = Reverse(n.next) ;
           
            a.next=n2; 
            while(a.next!=null){
                a=a.next;
            }
        }
        return ans.next;
    }

   static ListNode Reverse(ListNode A){
        ListNode prev = A;
        ListNode curr = A.next;
        prev.next = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
  
     public static void main(String[] arg){ 

           List<Integer> A = Arrays.asList(6,10,0,3,4,8); 
           ListNode head=new ListNode(A.get(0));
           ListNode tmp=head;
           for(int i=1;i<A.size();i++){
                  ListNode tmp1 = new ListNode(A.get(i));
                  tmp.next = tmp1;
                  tmp=tmp1;
            }

            reverseList(head,3);

        

 
    }   
}
