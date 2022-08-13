package thuchanh1;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals=new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for(Animal huy:animals) {
            System.out.println(huy.makeSound());
            if(huy instanceof Chicken){
                Edible edible=(Chicken)huy;
                System.out.println(edible.howToEat());
            }
        }
    }
}
