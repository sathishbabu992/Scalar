package InheritanceTest;

public class Client {

    public static void main(String[] args){
        test1 t1 = new test1();
        test2 t2 = new test2();
        test1 t3 = new test2();
         
        test1.test();
        test2.test();
        
    }
    
}
