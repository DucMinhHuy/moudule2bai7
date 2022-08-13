package baidoc1;

public class MyDogLish {
    private String[] dogs=new String[5];
    private int nextIndex=0;
     public void add(String dog){
         if(this.nextIndex<this.dogs.length){
             dogs[nextIndex]=dog;
             System.out.println("dog added at"+ nextIndex);
             this.nextIndex++;
         }
     }
}
