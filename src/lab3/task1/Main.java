package lab3.task1;
public class Main {
    public static void main(String[] args) {

        Shape c = new Circle(5, "red", true);
        Shape r = new Rectangle(3, 7, "yellow", false);
        Shape s = new Square(4, "green", true);

        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println();

        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println();

        System.out.println(s);
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
    }
}

