package Prefixsum;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Queues1 {
     
    public static class Queue{
        int[] queue;
        int size;
        int front,rear;
        public Queue(int s){
           queue =new int[s];
        } 

        void enQueue(int val){
            if(!isFull()){
                queue[rear]=val;
                rear=(rear+1)%queue.length;
                size=size+1;
            }
            else System.out.println("Queue is Full "+val+" not added");
        }

        int deQueue(){
            if(!isEmpty()){
                int data = queue[front];
                front=(front+1)%queue.length;
                size=size-1;
                return data;
            }
            else System.out.println("Queue is Empty");
            return -1;
        }
        
        boolean isEmpty(){
            return size==0;
        }
        boolean isFull(){
            return queue.length==size;
        }

        void show(){
            for(int i=0;i<size;i++){
                System.out.print(queue[(front+i)%queue.length]+" ");
            }
        }

        int peek(){
            return queue[front];
        }

    }

    public static void main(String[] arg){
        
        Queue q = new Queue(5);
        q.enQueue(5);
        q.enQueue(7);
        q.enQueue(9);
        q.enQueue(8);
        System.out.println();
        q.deQueue();
        q.deQueue();
        q.show();
        
        q.enQueue(70);
        q.enQueue(90);
        q.enQueue(80);
        
        q.enQueue(900);
        q.enQueue(800);


        q.show();

        q.deQueue();
        q.deQueue();
        System.out.println();
        q.show();
        
        System.out.println();
        System.out.println(q.peek());
    }
    
}
