package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ABC");
        map.put(2, "XYZ");
        map.put(new Integer(1), "AAA");
        System.out.println(map);
    }
}
