package lab4.task2;

public class Main {
    public static void main(String[] args) {

        Clothes[] clothes = {
                new TShirt(Size.M, 1200, "белый"),
                new Pants(Size.L, 2500, "черный"),
                new Skirt(Size.XS, 1800, "красный"),
                new Tie(Size.S, 900, "синий")
        };

        Atelier atelier = new Atelier();

        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWomen(clothes);
    }
}
