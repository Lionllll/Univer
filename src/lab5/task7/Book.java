package lab5.task7;

import lab5.task6.Printable;
public class Book implements Printable {
    private String t;
    public Book(String t){this.t=t;}
    public void print(){ System.out.println("Book: "+t); }
}