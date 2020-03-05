import java.util.HashMap;
import java.util.Map;
//Write a Java program to test if a map contains a mapping for the specified key.
public class HWMaps1 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Audi", 1);
        myMap.put("BMW", 2);
        myMap.put("Tesla", 3);

        if (myMap.containsKey("BMW")){
            System.out.println("map contains BMW");
        }

    }
}
