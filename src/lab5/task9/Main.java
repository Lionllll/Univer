package lab5.task9;

import lab5.task6.Printable;
import lab5.task7.Book;
import lab5.task8.Magazine;
public class Main {
    public static void main(String[] a){
        Printable[] arr={ new Book("Java"), new Magazine("Forbes") };
        for(Printable p: arr) p.print();
    }
}