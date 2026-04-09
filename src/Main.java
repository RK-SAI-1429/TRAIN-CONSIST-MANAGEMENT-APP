import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogies));

        // ---------------- UC17 START ----------------

        Arrays.sort(bogies);  // Built-in sorting

        // ---------------- UC17 END ----------------

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogies));
    }
}