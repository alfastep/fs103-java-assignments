package org.ctac.fs103.practicingmethods;

public class MethodReturnTypes {
    public static void main(String[] args) {
        System.out.println(text());
        System.out.println(number());
        System.out.println(bool());
    }

    public static String text() {
        return "String of text.";
    }

    public static int number() {
        return 5;
    }

    public static boolean bool () {
        return false;
    }
}
