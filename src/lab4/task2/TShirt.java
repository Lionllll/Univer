package lab4.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает футболку: размер " + size +
                " (" + size.getDescription() + "), цвет " + color + ", цена " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надевает футболку: размер " + size +
                " (" + size.getDescription() + "), цвет " + color + ", цена " + price);
    }
}
