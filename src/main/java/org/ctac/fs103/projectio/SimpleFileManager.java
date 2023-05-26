package org.ctac.fs103.projectio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleFileManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path!");
            return;
        }

        while (true) {
            System.out.println("File Manager Options:");
            System.out.println("1. Display directory contents");
            System.out.println("2. Copy file");
            System.out.println("3. Move file");
            System.out.println("4. Delete file");
            System.out.println("5. Create directory");
            System.out.println("6. Delete directory");
            System.out.println("7. Search for a file");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    displayDirectoryContents(directory);
                    break;
                case 2:
                    copyFile(scanner, directory);
                    break;
                case 3:
                    moveFile(scanner, directory);
                    break;
                case 4:
                    deleteFile(scanner, directory);
                    break;
                case 5:
                    createDirectory(scanner, directory);
                    break;
                case 6:
                    deleteDirectory(scanner, directory);
                    break;
                case 7:
                    searchFiles(scanner, directory);
                    break;
                case 8:
                    System.out.println("Exiting the file manager...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void displayDirectoryContents(File directory) {
        System.out.println("Contents of directory: " + directory.getAbsolutePath());
        System.out.println("-----------------------------------------");

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                String name = file.getName();
                long size = file.length();
                Date lastModified = new Date(file.lastModified());
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                System.out.println("Name: " + name);
                System.out.println("Size: " + size + " bytes");
                System.out.println("Last Modified: " + dateFormat.format(lastModified));
                System.out.println("-----------------------------------------");
            }
        } else {
            System.out.println("No files found in the directory.");
        }
    }

    private static void copyFile(Scanner scanner, File directory) {
        System.out.print("Enter the source file name: ");
        String sourceFileName = scanner.nextLine();
        File sourceFile = new File(directory, sourceFileName);

        if (!sourceFile.exists() || sourceFile.isDirectory()) {
            System.out.println("Source file does not exist or is a directory!");
            return;
        }

        System.out.print("Enter the destination file name: ");
        String destinationFileName = scanner.nextLine();
        File destinationFile = new File(directory, destinationFileName);

        try {
            Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Failed to copy the file: " + e.getMessage());
        }
    }

    private static void moveFile(Scanner scanner, File directory) {
        System.out.print("Enter the source file name: ");
        String sourceFileName = scanner.nextLine();
        File sourceFile = new File(directory, sourceFileName);

        if (!sourceFile.exists() || sourceFile.isDirectory()) {
            System.out.println("Source file does not exist or is a directory!");
            return;
        }

        System.out.print("Enter the destination file name: ");
        String destinationFileName = scanner.nextLine();
        File destinationFile = new File(directory, destinationFileName);

        try {
            Files.move(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully!");
        } catch (IOException e) {
            System.out.println("Failed to move the file: " + e.getMessage());
        }
    }

    private static void deleteFile(Scanner scanner, File directory) {
        System.out.print("Enter the file name to delete: ");
        String fileName = scanner.nextLine();
        File file = new File(directory, fileName);

        if (!file.exists() || file.isDirectory()) {
            System.out.println("File does not exist or is a directory!");
            return;
        }

        if (file.delete()) {
            System.out.println("File deleted successfully!");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    private static void createDirectory(Scanner scanner, File directory) {
        System.out.print("Enter the directory name to create: ");
        String directoryName = scanner.nextLine();
        File newDirectory = new File(directory, directoryName);

        if (newDirectory.mkdir()) {
            System.out.println("Directory created successfully!");
        } else {
            System.out.println("Failed to create the directory.");
        }
    }

    private static void deleteDirectory(Scanner scanner, File directory) {
        System.out.print("Enter the directory name to delete: ");
        String directoryName = scanner.nextLine();
        File deleteDirectory = new File(directory, directoryName);

        if (!deleteDirectory.exists() || !deleteDirectory.isDirectory()) {
            System.out.println("Directory does not exist or is not a directory!");
            return;
        }

        try {
            Files.walk(deleteDirectory.toPath())
                    .sorted((path1, path2) -> -path1.compareTo(path2))
                    .map(Path::toFile)
                    .forEach(File::delete);
            System.out.println("Directory deleted successfully!");
        } catch (IOException e) {
            System.out.println("Failed to delete the directory: " + e.getMessage());
        }
    }

    private static void searchFiles(Scanner scanner, File directory) {
        System.out.print("Enter the search keyword: ");
        String keyword = scanner.nextLine();

        System.out.println("Search results for '" + keyword + "':");
        System.out.println("-----------------------------------------");

        searchFilesRecursively(directory, keyword);
    }

    private static void searchFilesRecursively(File directory, String keyword) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    searchFilesRecursively(file, keyword);
                } else {
                    String fileName = file.getName();
                    if (fileName.contains(keyword)) {
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        }
    }
}

