package lab4.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает штаны: размер " + size +
                " (" + size.getDescription() + "), цвет " + color + ", цена " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надевает штаны: размер " + size +
                " (" + size.getDescription() + "), цвет " + color + ", цена " + price);
    }
}
