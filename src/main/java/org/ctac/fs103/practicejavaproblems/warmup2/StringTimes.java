package org.ctac.fs103.practicejavaproblems.warmup2;

public class StringTimes {
    public String stringTimes(String str, int n) {
//      Result to be returned
        String result = "";
//      Loop that stops at n-1
        for(int i = 0; i < n; i++) {
//          Concatenate each string to the result
            result += str;
        }
//      return result
        return result;
    }
}
