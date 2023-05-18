package org.ctac.fs103.practicehandlingexceptions;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return !sensors.isEmpty();
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or no sensors added");
        }

        int sum = 0;
        List<Integer> currentReadings = new ArrayList<>();
        readings.clear();

        for (Sensor sensor : sensors) {
            int reading = sensor.read();
            System.out.println(reading);
            currentReadings.add(reading);
            sum += reading;
        }

        readings.addAll(currentReadings);

        return sum / sensors.size();
    }

    public List<Integer> readings() {
        return new ArrayList<>(readings);
    }
}
