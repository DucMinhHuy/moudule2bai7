package baidoc1;

public class Circcle extends Shape {
    private double radius;

    public Circcle(int _x, int _y, double radius) {
        super(_x, _y);
        this.radius = radius;
    }
    public void draw(){
        System.out.println("draw circle");
    }
    public void erase(){
        System.out.println("erase cricle");
    }
}
