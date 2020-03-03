//Create an ArrayList [1,2,3,6,7,3,2,1]. Remove all 2 from Arraylist
//Remove all odd numbers;

import java.util.ArrayList;
import java.util.Arrays;

public class ListHW2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,6,7,3,2,1));
        for (int i = 0; i <= numbers.size(); i++) {
            numbers.remove(new Integer(2));
        }

        System.out.println(numbers);
    }

}
