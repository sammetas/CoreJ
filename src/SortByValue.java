import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "abc");
        map.put(2,"ops");
        map.put(3,"irp");
        map.put(5,"bcd");

        System.out.println(map);
     Map<Integer,String> sorted =   map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)-> e2, LinkedHashMap::new));
        System.out.println(sorted);
        Map<String,Integer> inverted =   map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey,(e1,e2)-> e2, LinkedHashMap::new));
        System.out.println(inverted);

    }
}
