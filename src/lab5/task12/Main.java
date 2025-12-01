package lab5.task12;

public class Main {
    public static void main(String[] a){
        UndoStringBuilder u=new UndoStringBuilder();
        u.append("Hello ").append("World");
        System.out.println(u);
        u.undo();
        System.out.println(u);
    }
}