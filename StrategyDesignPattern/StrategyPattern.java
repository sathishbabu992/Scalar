package StrategyDesignPattern;

public class StrategyPattern {
    private Strategy s;

    public StrategyPattern(Strategy s1){
        this.s = s1;
    }
    public int getStrategyPattern(int a,int b){
        return s.doOperation(a, b);
    }
    
}
