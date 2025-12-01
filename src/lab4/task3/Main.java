package lab4.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        Shop shop = new Shop();
        Cart cart = new Cart();

        System.out.println("===== Интернет-магазин =====");

        // 1) Аутентификация
        while (true) {
            System.out.print("Введите логин: ");
            String login = sc.nextLine();

            System.out.print("Введите пароль: ");
            String password = sc.nextLine();

            if (user.authenticate(login, password)) {
                System.out.println("Успешный вход!\n");
                break;
            } else {
                System.out.println("Неверные данные. Попробуйте снова.\n");
            }
        }

        // Основное меню
        while (true) {
            System.out.println();
            System.out.println("1) Показать каталоги");
            System.out.println("2) Показать товары каталога");
            System.out.println("3) Добавить товар в корзину");
            System.out.println("4) Купить товары");
            System.out.println("5) Выход");

            System.out.print("Ваш выбор: ");
            String line = sc.nextLine();
            if (line.isEmpty()) continue;
            int choice;
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Введите число от 1 до 5.");
                continue;
            }

            switch (choice) {
                case 1 -> shop.printCatalogs();

                case 2 -> {
                    shop.printCatalogs();
                    System.out.print("Выберите номер каталога: ");
                    int cat;
                    try {
                        cat = Integer.parseInt(sc.nextLine());
                        if (cat < 1 || cat > Catalog.values().length) {
                            System.out.println("Неверный номер каталога.");
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный ввод.");
                        break;
                    }
                    Catalog selected = Catalog.values()[cat - 1];
                    shop.printProducts(selected);
                }

                case 3 -> {
                    System.out.print("Введите название товара: ");
                    String name = sc.nextLine();
                    Product p = shop.findProduct(name);
                    if (p != null) {
                        cart.add(p);
                    } else {
                        System.out.println("Товар не найден.");
                    }
                }

                case 4 -> {
                    if (!cart.isEmpty()) {
                        cart.buy();
                    } else {
                        System.out.println("Корзина пуста.");
                    }
                }

                case 5 -> {
                    System.out.println("Выход из магазина...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Неверный выбор.");
            }
        }
    }
}
