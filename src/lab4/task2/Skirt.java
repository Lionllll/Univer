package lab4.task2;

public class Skirt extends Clothes implements WomenClothing {

    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надевает юбку: размер " + size +
                " (" + size.getDescription() + "), цвет " + color + ", цена " + price);
    }
}
