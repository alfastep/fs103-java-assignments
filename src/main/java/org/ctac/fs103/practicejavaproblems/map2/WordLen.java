package org.ctac.fs103.practicejavaproblems.map2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public Map<String, Integer> wordLen(String[] strings) {
//      Create map to return
        Map<String, Integer> map = new HashMap<String, Integer>();
//      Loop through array of strings
        for (String string : strings) {
//          If string does not exist as a key in the map
            if (!map.containsKey(string)) {
//              Add that string as a key and its length as the value
                map.put(string, string.length());
            }
        }
        return map;
    }
}
