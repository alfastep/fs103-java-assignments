package org.ctac.fs103.practicejavaproblems.map2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {
//      Create a map to store keys and how many times they occur in array
        Map<String, Integer> map = new HashMap<String, Integer>();
//      Create map to store keys and a true or false value for if they occur more than once
        Map<String, Boolean> finalMap = new HashMap<String, Boolean>();
//      Loop through array of strings
        for (String string : strings) {
//          If string already exists as a key, increment the value by 1
            if(map.containsKey(string)) {
                map.put(string, map.get(string)+1);
            } else {
//              Add key to map and set value to one since this is the only occurrence so far
                map.put(string, 1);
            }
        }
//      Now loop through the keys in the first map
        for (String key : map.keySet()) {
//          If there is more than one occurrence of that key in the array
            if(map.get(key) > 1) {
//              Add that key with a value of true to the final map
                finalMap.put(key, true);
            } else {
//              Add that key with a value of true to the final map because it only occurred once
                finalMap.put(key, false);
            }
        }

        return finalMap;
    }
}
