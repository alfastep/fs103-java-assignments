package org.ctac.fs103.practicejavaproblems.array3;

public class CountClumps {
    public int countClumps(int[] nums) {
//      Result to return number of clumps
        int result = 0;
//      Loop through array of nums
        for (int i = 0; i < nums.length; i++) {
//          If it is not the last element. Need this check for out of bounds exceptions
            if(i != nums.length-1) {
//              If we are at the first element. Need check for out of bounds exceptions
                if(i == 0) {
//                  If the number right after is the same increment result by 1
                    if((nums[i] == nums[i+1]) ) {
                        result++;
                    }
//                For every other number
                } else {
//                  Check if the number after or before it is the same. increment result by 1 if so
                    if((nums[i] == nums[i+1]) && (nums[i] != nums[i-1])) {
                        result++;
                    }
                }
            }
        }
//      Return result
        return result;
    }
}
