package org.ctac.fs103.arraylistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a string or press enter to stop.");
            String word = scanner.nextLine();
            if (word.equals("")) {
                break;
            } else {
                list.add(word);
            }
        }

        System.out.println("The last item in the list: " + list.get(list.size()-1));

    }
}
