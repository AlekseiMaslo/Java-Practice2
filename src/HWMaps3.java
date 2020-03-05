import java.util.HashMap;
import java.util.Map;
//Remove a value from HashMap based on key
public class HWMaps3 {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Audi", 1);
        myMap.put("BMW", 2);
        myMap.put("Tesla", 3);

        if (myMap.containsKey("BMW")){
            myMap.remove("BMW", 2);
        }
        System.out.println(myMap);
    }
}