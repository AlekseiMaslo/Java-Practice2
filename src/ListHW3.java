//Remove all odd numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListHW3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,6,7,3,2,1));
        numbers.removeIf(number -> number % 2 == 0);

        System.out.println(numbers);
    }
}
