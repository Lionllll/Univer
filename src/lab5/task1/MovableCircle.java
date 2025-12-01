package lab5.task1;

public class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;
    public MovableCircle(int x,int y,int xs,int ys,int r){
        center=new MovablePoint(x,y,xs,ys); radius=r;
    }
    @Override public void moveUp(){ center.moveUp(); }
    @Override public void moveDown(){ center.moveDown(); }
    @Override public void moveLeft(){ center.moveLeft(); }
    @Override public void moveRight(){ center.moveRight(); }
    @Override public String toString(){ return "Circle center="+center+" r="+radius; }
}