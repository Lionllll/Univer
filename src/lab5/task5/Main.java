package lab5.task5;

public class Main {
    public static void main(String[] a){
        MovableCircle5 c=new MovableCircle5(0,0,1,2,5);
        c.moveUp(); c.moveRight();
        System.out.println(c);
    }
}