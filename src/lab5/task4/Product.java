package lab5.task4;

public class Product implements Priceable {
    private double price;
    public Product(double p){ price=p; }
    public double getPrice(){ return price; }
}