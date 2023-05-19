package org.ctac.fs103.practicejavaproblems.map2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
//      Create map to return with correct types for key and value
        Map<String, Integer> map = new HashMap<String, Integer>();
//      Loop through strings in array
        for (String string : strings) {
//          If the string already exists as a key in the map
            if(map.containsKey(string)) {
//              Increment the value of the key by 1
                map.put(string, map.get(string)+1);
            } else {
//              Set the value of the key to 1 because this is the first occurence
                map.put(string, 1);
            }
        }
        return map;
    }

}
