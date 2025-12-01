package lab4.task1;

public class Main {
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Моё любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemperature());
        System.out.println("Описание: " + favorite.getDescription());

        System.out.println();

        printSeasonDescription(favorite);

        System.out.println();

        for (Season s : Season.values()) {
            System.out.println(
                    s + " | температура: " +
                    s.getAverageTemperature() +
                    " | описание: " + s.getDescription()
            );
        }
    }

    public static void printSeasonDescription(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
