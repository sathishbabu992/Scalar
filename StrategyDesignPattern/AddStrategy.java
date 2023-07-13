package StrategyDesignPattern;

public class AddStrategy implements Strategy {

    @Override
    public int doOperation(int a, int b) { 
        return a+b;
    }
    
}
