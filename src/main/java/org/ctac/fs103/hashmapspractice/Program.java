package org.ctac.fs103.hashmapspractice;

import java.util.HashMap;

public class Program {
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static void printValues(HashMap<String,Book> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(hashmap.get(key).toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (String key: hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key).toString());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

        System.out.println();
        System.out.println("Print me another hashmap assignment");

        HashMap<String, Book> hashmap2 = new HashMap<>();
        hashmap2.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap2.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap2);
        System.out.println("---");
        printValueIfNameContains(hashmap2, "prejud");
    }
}
