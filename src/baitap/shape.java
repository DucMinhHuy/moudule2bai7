package baitap;

public abstract class shape {
    private String color="blue";
    public shape(){

    }

    public shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();
}
