package org.ctac.fs103.practicejavaproblems.array2;

public class Sum13 {
    public int sum13(int[] nums) {
//      Sum to return
        int result = 0;
//      If the array is empty return 0 which is what the result is initialized as
        if(nums.length == 0) {
            return result;
        }
//      Loop through array
        for(int i = 0; i < nums.length; i++) {
//          First check if the number is not 13
            if (nums[i] != 13) {
//              If this is the first element, we simply add it to result. Need this check for out of bounds edge case
                if(i == 0) {
                    result += nums[i];
//                If this is the last element
                } else if (i == nums.length-1) {
//                  Check if the number that precedes is not 13. Add to result if that condition is met
                    if(nums[i-1] != 13) {
                        result += nums[i];
                    }
//                 We check for if any of the other numbers come after 13. If not, we add it to result
                } else {
                    if (nums[i-1] != 13) {
                        result += nums[i];
                    }
                }

            }
        }
//      return the result
        return result;
    }
}
