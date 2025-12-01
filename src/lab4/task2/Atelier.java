package lab4.task2;

public class Atelier {

    public void dressMan(Clothes[] clothes) {
        System.out.println("=== Мужская одежда ===");
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                ((MenClothing) c).dressMan();
            }
        }
    }

    public void dressWomen(Clothes[] clothes) {
        System.out.println("=== Женская одежда ===");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                ((WomenClothing) c).dressWomen();
            }
        }
    }
}
