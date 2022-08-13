package thuchanh1;

public class main {
    public static void main(String[] args) {
        Fruit []fruit=new Fruit[2];
        fruit[0]=new Orange();
        fruit[1]=new Apple();
        for(Fruit deo:fruit){
            System.out.println(deo.howToEat());
        }
    }
}
