package lab4.task3;

public enum Catalog {
    PHONES("Смартфоны"),
    LAPTOPS("Ноутбуки"),
    TV("Телевизоры"),
    HEADPHONES("Наушники");

    private final String title;

    Catalog(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
