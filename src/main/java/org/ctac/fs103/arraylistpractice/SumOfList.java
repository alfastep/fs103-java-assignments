package org.ctac.fs103.arraylistpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        double sum = 0;
        StringBuilder result = new StringBuilder();

        while(true) {
            System.out.println("Enter a number or enter 0 to stop.");
            double num = Double.parseDouble(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                list.add(num);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.size() == 2) {
                if(i == list.size()-1) {
                    result.append(" and ").append(list.get(i));
                } else {
                    result.append(list.get(i));
                }
            } else if(list.size() == 1) {
                result.append(list.get(i));
            } else {
                if(i == list.size()-1) {
                    result.append("and ").append(list.get(i));
                } else {
                    result.append(list.get(i)).append(", ");
                }
            }
            sum += list.get(i);
        }

        if (list.size() == 1) {
            System.out.println(result + " is the only item in the list. The sum of that list is: " + sum);
        } else {
            System.out.println(result + " were the items in the list. The sum of that list is: " + sum);
        }
    }
}
