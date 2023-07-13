package StrategyDesignPattern;

public class Client {
    
    public static void main(String[] args){
        StrategyPattern s = new StrategyPattern(new AddStrategy());
        System.out.println(s.getStrategyPattern(10, 20));
        s= new StrategyPattern(new MultiplyStrategy());
        System.out.println(s.getStrategyPattern(10, 20));
    }
}
