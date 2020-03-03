//Initiate an Arraylist. Using For loop add integers from 1 to 10


import java.util.ArrayList;

public class ListHW1 {
    public static void main(String[] args) {
        ArrayList<Integer> listTest = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            listTest.add(i);
        }
        System.out.println(listTest);
    }



}
