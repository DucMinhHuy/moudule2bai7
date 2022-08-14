package baitap;

public class main1 {
    public static void main(String[] args) {
        Retangle h=new Retangle();
        h=new Retangle("blue",3,4);
        System.out.println(h.getArea());

        Circle h1=new Circle();
        h1=new Circle("god",4);
        System.out.println(h1.getArea());
    }
}
