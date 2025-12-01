package lab5.task2;

public class Main {
    public static void main(String[] a){
        MovableRectangle r=new MovableRectangle(0,0,5,5,1,1);
        r.moveUp(); r.moveRight();
        System.out.println(r);
    }
}