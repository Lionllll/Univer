package lab5.task1;

public class MovablePoint implements Movable {
    private int x,y,xSpeed,ySpeed;
    public MovablePoint(int x,int y,int xs,int ys){
        this.x=x; this.y=y; this.xSpeed=xs; this.ySpeed=ys;
    }
    public int getX(){return x;} public int getY(){return y;}
    public int getXSpeed(){return xSpeed;} public int getYSpeed(){return ySpeed;}
    @Override public void moveUp(){ y-=ySpeed; }
    @Override public void moveDown(){ y+=ySpeed; }
    @Override public void moveLeft(){ x-=xSpeed; }
    @Override public void moveRight(){ x+=xSpeed; }
    @Override public String toString(){ return "Point("+x+","+y+")"; }
}