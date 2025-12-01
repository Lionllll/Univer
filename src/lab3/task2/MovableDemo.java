package lab3.task2;

public class MovableDemo {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(0,0,1,1);
        MovablePoint p2 = new MovablePoint(5,5,1,1);
        MovableRectangle mr = new MovableRectangle(p1, p2);
        System.out.println(mr);
        mr.moveLeft();
        mr.moveUp();
        System.out.println(mr);

        MovableCircle mc = new MovableCircle(2,2,1,1,3);
        System.out.println(mc);
        mc.moveRight();
        System.out.println(mc);
    }
}
