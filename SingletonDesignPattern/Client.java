package SingletonDesignPattern;

import Prefixsum.stcaks;

public class Client {

    public static void main(String[] args){
        Singleton s = Singleton.getSingleton();
        Singleton s1 = Singleton.getSingleton();
    }
    
}
