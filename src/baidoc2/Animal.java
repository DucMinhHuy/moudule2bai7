package baidoc2;

public abstract class Animal {
    public abstract String howToEat();

    public static void main(String[] args) {
        Animal animal=new Chicken();
        eat(animal);
        animal=new Duck();
        eat(animal);
    }
    public static void eat(Animal animal){
        animal.howToEat();
    }
}
