package lab5.task8;

import lab5.task6.Printable;
public class Magazine implements Printable {
    private String t;
    public Magazine(String t){this.t=t;}
    public void print(){ System.out.println("Magazine: "+t); }
}