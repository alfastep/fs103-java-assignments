package org.ctac.fs103.practicejavaproblems.array2;

public class Sum28 {
    public boolean sum28(int[] nums) {
//      Sum to return
        int result = 0;
//      Loop through array
        for(int num : nums) {
//          If a 2 is found, add it to the result
            if (num == 2) {
                result += num;
            }
        }
//      returns true if result is 8 or false if otherwise
        return result == 8;
    }

}
