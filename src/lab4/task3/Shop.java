package lab4.task3;

import java.util.*;

public class Shop {
    private ArrayList<Product> products = new ArrayList<>();

    public Shop() {
        products.add(new Product("iPhone 15", 95000, Catalog.PHONES));
        products.add(new Product("Samsung Galaxy S23", 70000, Catalog.PHONES));

        products.add(new Product("MacBook Air", 120000, Catalog.LAPTOPS));
        products.add(new Product("HP Pavilion", 55000, Catalog.LAPTOPS));

        products.add(new Product("LG OLED", 130000, Catalog.TV));
        products.add(new Product("Samsung QLED", 90000, Catalog.TV));

        products.add(new Product("Sony WH-1000XM5", 30000, Catalog.HEADPHONES));
        products.add(new Product("JBL Tune 500BT", 3500, Catalog.HEADPHONES));
    }

    public void printCatalogs() {
        System.out.println("=== Каталоги ===");
        for (Catalog c : Catalog.values()) {
            System.out.println(c.ordinal() + 1 + ") " + c.getTitle());
        }
    }

    public void printProducts(Catalog catalog) {
        System.out.println("=== Товары: " + catalog.getTitle() + " ===");
        for (Product p : products) {
            if (p.getCatalog() == catalog)
                System.out.println("- " + p);
        }
    }

    public Product findProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name))
                return p;
        }
        return null;
    }
}
