package lab5.task2;

import lab5.task1.*;
public class MovableRectangle implements Movable {
    private MovablePoint tl, br;
    public MovableRectangle(int x1,int y1,int x2,int y2,int xs,int ys){
        tl=new MovablePoint(x1,y1,xs,ys); br=new MovablePoint(x2,y2,xs,ys);
    }
    private boolean same(){ return tl.getXSpeed()==br.getXSpeed() && tl.getYSpeed()==br.getYSpeed(); }
    @Override public void moveUp(){ if(same()){ tl.moveUp(); br.moveUp();}}
    @Override public void moveDown(){ if(same()){ tl.moveDown(); br.moveDown();}}
    @Override public void moveLeft(){ if(same()){ tl.moveLeft(); br.moveLeft();}}
    @Override public void moveRight(){ if(same()){ tl.moveRight(); br.moveRight();}}
    public String toString(){ return "Rect TL="+tl+" BR="+br; }
}