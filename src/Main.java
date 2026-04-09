import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ---------------- UC1 ----------------
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // ---------------- UC2 ----------------
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies:");
        System.out.println(passengerBogies);

        // ---------------- UC3 ----------------
        Set<String> bogieIDs = new HashSet<>();
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIDs);

        // ---------------- UC4 START ----------------

        // Create LinkedList for ordered train consist
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies in order
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(consist);

        // Insert Pantry Car at position 2
        consist.add(2, "Pantry Car");

        // Remove first and last bogie
        consist.removeFirst();
        consist.removeLast();

        // Final ordered consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(consist);

        // ---------------- UC4 END ----------------
    }
}