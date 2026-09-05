package day7;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Rectangle(20,10);
        System.out.println("Rectangle Area is : "+shape.calculateArea());
        shape.print();
    }
}