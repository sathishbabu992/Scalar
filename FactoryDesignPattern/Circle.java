package FactoryDesignPattern;

public class Circle implements Shape{

    @Override
    public void draw() { 
        System.out.println("Draw method calling from Cirle");
    }
    
}
