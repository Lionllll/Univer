package lab4.task3;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> items = new ArrayList<>();

    public void add(Product p) {
        items.add(p);
        System.out.println("Товар добавлен: " + p.getName());
    }

    public double getTotal() {
        double sum = 0;
        for (Product p : items)
            sum += p.getPrice();
        return sum;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void buy() {
        System.out.println("Покупка товаров:");
        for (Product p : items)
            System.out.println("- " + p);

        System.out.println("Итого к оплате: " + getTotal() + " руб.");
        items.clear();
    }
}
