import java.util.HashMap;
import java.util.Map;
//Write a Java program to copy all of the mappings from the specified map to another map.
public class HWMaps2 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Audi", 1);
        myMap.put("BMW", 2);
        myMap.put("Tesla", 3);

        Map<String,Integer> myMap2 = new HashMap<String, Integer>();
        myMap2.putAll(myMap);

        System.out.println(myMap2);
    }
}
