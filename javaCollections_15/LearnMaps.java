package javaCollections_15;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class LearnMaps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // Only unique keys
        map.put("US", "United-States");
        map.put("PK", "Pakistan");
        map.put("PK", "Hafizabad"); // Overwrite
        map.putIfAbsent("IN", "India"); // If not present("India")

        System.out.println(map); // { PK=Hafizabad, US=United-States }
        // Remove
        map.remove("US"); // { PK=Hafizabad }
        System.out.println(map); // { PK=Hafizabad, IN=India }
        // Get
        System.out.println(map.get("PK")); // Hafizabad
        // Present
        System.out.println(map.containsKey("PK")); // true
        // PUTAll
        Map<String, String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);// { PK=Hafizabad, IN=India }

        // getOrDefault
        System.out.println(map.getOrDefault("PK", "Not Found")); // WE will try to find PK in map if not found then we
                                                                 // will print "Not Found"
        Set<String> keys = map.keySet(); // returns set of all keys
        System.out.println(keys);// [PK, IN]

        Set<Map.Entry<String, String>> entries = map.entrySet(); // returns set of all entries
        System.out.println(entries);// [{PK=Hafizabad}, {IN=India}]
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " , " + entry.getValue());
        }

    }
}
