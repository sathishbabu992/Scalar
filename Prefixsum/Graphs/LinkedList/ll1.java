package Prefixsum.Graphs.LinkedList;

import java.util.ArrayList;

public class ll1 {
    static ListNode root;
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int v){
            this.val=v;
            this.next=null;
        }
        public ListNode(int v,ListNode next){
            this.val=v;
            this.next=next;
        }
    }

    static  ListNode removeElements(ListNode head, int val) {
        
        ListNode l = head;
        // ListNode l2 = head;
        ListNode l2 =new ListNode(-1);
        ListNode l1 = l2;
        l1.next=null;
        while(l!=null && l.next!=null){
            if(l.val==val){
                l=l.next;
                continue;
            }
            l1.next=new ListNode(l.val);
            l=l.next;
            l1=l1.next;
        }
        return l2.next; 
    } 
   
    public static void reorderList(ListNode head) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode l = head;
        ListNode m= head;
        while(l!=null){
            a.add(l.val);
            l=l.next;
        }
        System.out.print(a);
        ListNode ans = m;
        ListNode aa = ans;
        aa.next=null;
        int i=0,j=a.size()-1;
        while(i<j){
            aa.next = new ListNode(a.get(i));
            aa=aa.next;
            aa.next = new ListNode(a.get(j));
            aa=aa.next;
            i++;j--;
        }
        head= ans.next;
    }


    
    static ListNode t = new ListNode(-1);
    
    static ListNode t1 = t;
    public static ListNode rev(ListNode h){
        if(h==null) return null;
        if(h.next==null) return h;
        ListNode newHead = rev(h.next);
        h.next.next = h;
        h.next=null;
        return newHead;
    }

    public static void delNode(ListNode h){
        ListNode nextNode = h.next;
        h.val = nextNode.val;
        h.next = nextNode.next;
        nextNode.next=null;
    }

 

    public static void main(String[] arg){
         
        // recurion(); 
        int[] A={1,2,3,4,5};
        int val=6;

        root = new ListNode(A[0]);
        ListNode root1=root;
        root1.next=null;
        for(int i=1;i<A.length;i++){
            root1.next = new ListNode(A[i]);
            root1=root1.next;
        }

 
         
        rev(root);
        //  rev1(root);  
        delNode(root1.next.next); 
        // while(root!=null){
        //     System.out.print(root.val+"\t");
        //     root = root.next;
        //  }
         while(root1!=null){
            System.out.print(root1.val+"\t");
            root1 = root1.next;
         }



        // removeElements(root, val);

        // while(root!=null){
        //     System.out.print(root.val+"->");
        //     root=root.next;
        // }

     }
    
}
