package org.ctac.fs103.assignmentio;

import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        try {
            // Read integers from input1.txt
            String file1Path = "src/main/java/org/ctac/fs103/assignmentio/input1.txt";
            File file1 = new File(file1Path);
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            String line;
            StringBuilder mergedContent = new StringBuilder();

            while ((line = reader1.readLine()) != null) {
                mergedContent.append(line).append(System.lineSeparator());
            }
            reader1.close();

            // Read integers from input2.txt
            String file2Path = "src/main/java/org/ctac/fs103/assignmentio/input2.txt";
            File file2 = new File(file2Path);
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));
            while ((line = reader2.readLine()) != null) {
                mergedContent.append(line).append(System.lineSeparator());
            }
            reader2.close();

            // Write merged content to merged.txt
            String mergedFilePath = "src/main/java/org/ctac/fs103/assignmentio/merged.txt";
            FileWriter mergedWriter = new FileWriter(mergedFilePath);
            mergedWriter.write(mergedContent.toString());
            mergedWriter.close();
            System.out.println("Merged content written to merged.txt");

            // Find common integers and write to common.txt
            String[] numbers = mergedContent.toString().split("[\\s,]+"); // Split merged content by whitespace and comma
            StringBuilder commonContent = new StringBuilder();
            HashSet<Integer> numberSet = new HashSet<>();

            for (String number : numbers) {
                try {
                    int num = Integer.parseInt(number);
                    if (numberSet.contains(num)) {
                        commonContent.append(num).append(System.lineSeparator());
                    } else {
                        numberSet.add(num);
                    }
                } catch (NumberFormatException e) {
                    // Handle the NumberFormatException if necessary
                    System.out.println("Invalid integer: " + number);
                }
            }

            String commonFilePath = "src/main/java/org/ctac/fs103/assignmentio/common.txt";
            FileWriter commonWriter = new FileWriter(commonFilePath);
            commonWriter.write(commonContent.toString());
            commonWriter.close();
            System.out.println("Common integers written to common.txt");
        } catch (FileNotFoundException e) {
            System.out.println("One of the input files was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing a file.");
            e.printStackTrace();
        }
    }
}
