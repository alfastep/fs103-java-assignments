package org.ctac.fs103.practicejavaproblems.map2;

import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public Map<String, Integer> word0(String[] strings) {
//      Create map that will be returned
        Map<String, Integer> map = new HashMap<String, Integer>();
//      Loop through each string in the array
        for (String string : strings) {
//          If the string does not exist as a key in the map
            if (!map.containsKey(string)) {
//              Add the string as a key and set its value to 0
                map.put(string, 0);
            }
        }
        return map;
    }
}
