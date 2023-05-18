package org.ctac.fs103.objectsinlists;

public class Counter {
    private int startValue;
    private int value;

    public Counter(int startValue) {
        this.startValue = startValue;
        this.value = startValue;
    }

    public Counter() {
        this.startValue = 0;
        this.value = 0;
    }

    public int getStartValue() {
        return startValue;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public void increase() {
        setValue(value() + 1);
    }

    public void increase(int increaseBy) {
        if(increaseBy > 0) {
            setValue(value() + increaseBy);
        }
    }

    public void decrease() {
        setValue(value() - 1);
    }

    public void decrease(int decreaseBy) {
        if(decreaseBy > 0) {
            setValue(value() - decreaseBy);
        }
    }
}
