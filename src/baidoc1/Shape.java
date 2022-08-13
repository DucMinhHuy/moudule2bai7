package baidoc1;

abstract public class Shape {
    protected int x,y;
    protected Shape(int _x,int _y){
        x=_x;
        y=_x;
    }
    abstract public void draw();
    abstract public void erase();
    public void moveTo(int x,int y){
        erase();
        this.x=x;
        this.y=y;
        draw();
    }
}
