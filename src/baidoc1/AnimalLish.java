package baidoc1;

public class AnimalLish {
    private String[] animals=new String[5];
    private int nextIndex=0;
    public void add(String animal){
        if(nextIndex< animals.length){
            animals[nextIndex]=animal;
            System.out.println("animal added at"+nextIndex);
            nextIndex++;
        }
    }
}
