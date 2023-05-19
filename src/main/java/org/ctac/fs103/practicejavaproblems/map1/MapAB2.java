package org.ctac.fs103.practicejavaproblems.map1;

import java.util.Map;

public class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
//      If the keys "a" and "b" exist in the map
        if (map.containsKey("a") && map.containsKey("b")) {
//          If the values of keys "a" and "b" are the same
            if(map.get("a").equals(map.get("b"))) {
//              Remove both keys
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}
