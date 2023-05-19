package org.ctac.fs103.practicejavaproblems.map1;

import java.util.Map;

public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
//      If the key "a" exists in the map
        if (map.containsKey("a")) {
//          Add/set key "b" to the value of key "a"
            map.put("b", map.get("a"));
        }
//      Always remove key c
        map.remove("c");

        return map;
    }

}
