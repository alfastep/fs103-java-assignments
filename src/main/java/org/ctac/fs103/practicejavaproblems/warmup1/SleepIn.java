package org.ctac.fs103.practicejavaproblems.warmup1;

public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
//      Will return true if it is not a weekday and if vacation is true. It will return false otherwise
        return !weekday || vacation;
    }
}
