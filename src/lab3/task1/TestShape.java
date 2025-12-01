package lab3.task1;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // s1.getRadius(); // compile error: Shape doesn't have getRadius()

        Circle c1 = (Circle) s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); // compile error: Shape is abstract

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength()); // compile error: Shape doesn't have getLength()

        Rectangle r1 = (Rectangle) s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
       // System.out.println(s4.getSide()); // Cannot resolve method 'getSide' in 'Shape'

        Rectangle r2 = (Rectangle) s4; // downcast to Rectangle (superclass of Square)
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());
        //System.out.println(r2.getSide()); Cannot resolve method 'getSide' in 'Rectangle'

        Square sq1 = (Square) r2; // downcast to Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
