package lab5.task10;

public class Main {
    public static void main(String[] a){
        Computer c=new Computer(Brand.ASUS,new Processor("i5",3.2),new Memory(16),new Monitor(24));
        System.out.println(c);
    }
}