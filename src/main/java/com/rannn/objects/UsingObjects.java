package com.rannn.objects;

import java.util.Map;
import java.util.Objects;

public class UsingObjects {
    String getValSafe(Map<String, String> aMap, String key) {
        Map<String, String> safeMap = Objects.requireNonNull(aMap, "Map is null");
        String safeKey = Objects.requireNonNull(key, "Key is null");

        return safeMap.containsKey(safeKey) ? safeMap.get(safeKey) : null;
    }

    public static void main(String[] args) {
        UsingObjects obj = new UsingObjects();
        obj.getValSafe(null, "dummy");
    }
}
