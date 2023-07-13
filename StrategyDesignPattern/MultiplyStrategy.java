package StrategyDesignPattern;

public class MultiplyStrategy implements Strategy{

    @Override
    public int doOperation(int a, int b) {
        return a*b;
    }
    
}
