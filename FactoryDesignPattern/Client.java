package FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();
        Shape s = shape.getShape("Circle");
        s.draw();
        // shape.getShape("Circle");
        s= shape.getShape("Rectangle");
        s.draw();

        // Shape s1 = new Circle();
        // s1.draw();
    }

    
}
