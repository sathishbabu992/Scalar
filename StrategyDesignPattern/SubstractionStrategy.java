package StrategyDesignPattern;

public class SubstractionStrategy implements Strategy{

    @Override
    public int doOperation(int a, int b) {
        return a-b;
    }
    
}
