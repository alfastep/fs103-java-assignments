package org.ctac.fs103.practicejavaproblems.map1;

import java.util.Map;

public class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
//      If the key "ice cream" exists in the map
        if (map.containsKey("ice cream")) {
//          Update ice cream's value to be cherry
            map.put("ice cream", "cherry");
        }
//      Always add/set the key of bread to the value butter
        map.put("bread", "butter");
        return map;
    }
}
