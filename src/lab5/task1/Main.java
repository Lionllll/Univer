package lab5.task1;

public class Main {
    public static void main(String[] a){
        Movable p=new MovablePoint(0,0,2,3);
        p.moveRight(); p.moveUp();
        System.out.println(p);
    }
}