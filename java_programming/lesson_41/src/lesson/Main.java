package lesson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        Map<Integer, List<String>> map3 = new HashMap<>();
        map1.put("qwe1", "23122335");
        map1.put("qwe2", "1231262");
        map1.put("qwe3", "121283");
        map1.put("qwe4", "12313");
        System.out.println(map1.keySet());

        // iterate map
        for (String key : map1.keySet()) {
            System.out.println(key + " " + map1.get(key));
        }
        Set<Map.Entry<String, String>> entries = map1.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
