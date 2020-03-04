import java.util.HashSet;
import java.util.Set;

public class SetNew {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        for (int i = 1; i <= 10; i++) { //this loop will create a set of integers from 1 to 10
            if(i % 2 != 0) {            //and here I delete all odd numbers
                mySet.add(i);
            }
        }
        System.out.println(mySet);
        for (int i = 0; i <= 20 ; i++) {    //here I trying to add duplicate numbers to mySet
            mySet.add(i);
        }
        System.out.println(mySet);
    }
}
