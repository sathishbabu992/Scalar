
package testFolder;
 
public class test {
    class test1{
        class test2{
            void display(){
                
            }
        }
    }

    public static void main(String[] args){
       test t1 = new test();
       test.test1  t = t1.new test1();
        test.test1.test2 t2 = t.new test2();
        t2.display();
    }
}
