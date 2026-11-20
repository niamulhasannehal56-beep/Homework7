
import java.io.File;
import java.util.Scanner;

public class Task4 {

    // Calculate total size of files and subdirectories
    public static long calculateSize(File directory) {

        long totalSize = 0;

        File[] files = directory.listFiles();

        if (files == null) {
            return 0;
        }

        for (File file : files) {

            if (file.isFile()) {
                totalSize += file.length();
            }
            else if (file.isDirectory()) {
                totalSize += calculateSize(file);
            }
        }

        return totalSize;
    }

    // Display directory size
    public static void displaySize(File directory) {

        long bytes = calculateSize(directory);

        double kb = bytes / 1024.0;
        double mb = bytes / (1024.0 * 1024.0);

        System.out.println("\nDirectory: " +
                directory.getAbsolutePath());

        System.out.println("Size: " + mb + " MB");
        System.out.println("Size: " + kb + " KB");
        System.out.println("Size: " + bytes + " bytes");
    }

    // Display each directory separately
    public static void displayAllDirectories(File directory) {

        displaySize(directory);

        File[] files = directory.listFiles();

        if (files == null) {
            return;
        }

        for (File file : files) {

            if (file.isDirectory()) {
                displayAllDirectories(file);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory path: ");

        String path = scanner.nextLine();

        File directory = new File(path);

        if (!directory.exists() || !directory.isDirectory()) {

            System.out.println("Error: Directory does not exist.");

        } else {

            System.out.println("\nDirectory exists!");

            displayAllDirectories(directory);
        }

        scanner.close();
    }
}
