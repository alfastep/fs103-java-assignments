package org.ctac.fs103.practicehandlingexceptions;

public interface Sensor {
    boolean isOn();    // returns true if the sensor is on
    void setOn();      // sets the sensor on
    void setOff();     // sets the sensor off
    int read();
}
