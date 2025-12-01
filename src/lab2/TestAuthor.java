package lab2;
public class TestAuthor {
    public static void main(String[] args) {

        Author a1 = new Author("Sergey Ivanov", "serg@example.com", 'M');
        System.out.println(a1);

        a1.setEmail("ivanov.newmail@example.com");
        System.out.println(a1);

        Author a2 = new Author("Anna Petrova", "petrova@mail.ru", 'F');
        System.out.println(a2);
    }
}

