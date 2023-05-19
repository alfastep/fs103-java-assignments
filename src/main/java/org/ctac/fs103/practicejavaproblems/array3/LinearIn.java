package org.ctac.fs103.practicejavaproblems.array3;

import java.util.HashMap;
import java.util.Map;

public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
//      Map to store all the outer values
        Map<Integer, String> map = new HashMap<Integer, String>();
//      bool allFound initially set to true
        boolean allFound = true;
//      Loop through outer array
        for (int out : outer) {
//          Store each number in map with a value of empty string. Value is of no use.
            map.put(out, "");
        }
//      Loop through numbers in inner array
        for (int in : inner) {
//          Once a number is not found in the map, set allFound to false and break out of loop
            if(!map.containsKey(in)) {
                allFound = false;
                break;
            }
        }
//      Return the bool
        return allFound;
    }
}
