package Prefixsum;

// public class test {

      class Test extends Derived{
        void myMethod1(){
          System.out.println("InterviewBit");
        }
      }
     class Derived {
        void myMethod(){
          System.out.println("IB");
        }
      
        public static void main(String[] args){
          Derived object = new Test();
        //   Test t = new Test();
          object.myMethod();
          System.out.println(object.getClass());
        }
      }
    

