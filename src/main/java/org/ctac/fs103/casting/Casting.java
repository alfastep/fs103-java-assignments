package org.ctac.fs103.casting;

public class Casting {
    public static void main(String[] args) {
        double doubleVar = 112.35;
        int intVar = (int) doubleVar;
        System.out.println("Double: " + doubleVar);
        System.out.println("int: " + intVar);

        String str = "49";
        int strInt = Integer.parseInt(str);

        System.out.println("The string value is: " + str);
        System.out.println("The integer value is: " + strInt);
    }
}
