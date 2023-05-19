package org.ctac.fs103.practicejavaproblems.array2;

public class Lucky13 {
    public boolean lucky13(int[] nums) {
//      bool to return
        boolean bool = true;
//      Loop through array
        for (int num : nums) {
//          Set bool to false and stop loop if 1 or 3 is found
            if(num == 1 || num == 3) {
                bool = false;
                break;
            }
        }
//      Return boolean
        return bool;
    }

}
