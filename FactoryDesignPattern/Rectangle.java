package FactoryDesignPattern;

public class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Draw method calling from : Rectangle");
    }
    
}
