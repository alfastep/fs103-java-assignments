package org.ctac.fs103.practicehandlingexceptions;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0 || age >120) throw new IllegalArgumentException("Age must be between 0 and 120.");

        if (name == null || name.equals("") || name.length() > 40) {
            throw new IllegalArgumentException("Name must not be null, empty, or more than 40 characters.");
        }

        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person lon = new Person("Lon", 27);
        Person lane = new Person(null, 25);


        System.out.println(lon.name);
        System.out.println(lane);
    }
}
