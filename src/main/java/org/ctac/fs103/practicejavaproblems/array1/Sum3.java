package org.ctac.fs103.practicejavaproblems.array1;

public class Sum3 {
    public int sum3(int[] nums) {
//      Result to return
        int result = 0;
//      Loop through nums array
        for(int num : nums) {
//          Add the num to the result
            result += num;
        }
//      Return result
        return result;
    }
}
