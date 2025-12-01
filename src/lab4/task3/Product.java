package lab4.task3;

public class Product {
    private String name;
    private double price;
    private Catalog catalog;

    public Product(String name, double price, Catalog catalog) {
        this.name = name;
        this.price = price;
        this.catalog = catalog;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " — " + price + " руб.";
    }
}
