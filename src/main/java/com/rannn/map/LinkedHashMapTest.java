package com.rannn.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new LinkedHashMap<>(10, 0.75f, true);

        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        map.put("4", "D");

        Iterator<Map.Entry<String, Object>> it1 = map.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry<String, Object> entry = it1.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("[" + key + ", " + value + "], size=" + map.size());
        }
        System.out.println("==============End1=========");

        map.get("1");
        Iterator<Map.Entry<String, Object>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, Object> entry = it2.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("[" + key + ", " + value + "], size=" + map.size());
        }
        System.out.println("==============End2=========");

        map.put(null, "F");
        String previous = (String) map.put(null, null);
        Iterator<Map.Entry<String, Object>> it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<String, Object> entry = it3.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("[" + key + ", " + value + "], size=" + map.size() + ", previous=" + previous);
        }
        System.out.println("==============End3=========");
    }
}
