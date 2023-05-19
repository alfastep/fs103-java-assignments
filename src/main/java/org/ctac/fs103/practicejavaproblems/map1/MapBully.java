package org.ctac.fs103.practicejavaproblems.map1;

import java.util.Map;

public class MapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
//      Check if "a" exists as a key in the map, and also that "a" has a value
        if(map.containsKey("a") && !map.get("a").equals("")) {
//          Change replace b's value with a's value
            map.put("b", map.get("a"));
//          Change a's value to an empty string
            map.put("a", "");
        }
        return map;
    }
}
