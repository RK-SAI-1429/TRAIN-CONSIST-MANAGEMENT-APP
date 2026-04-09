import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBogies:");
        bogies.forEach(System.out::println);

        // ---------------- UC10 START ----------------

        // Calculate total seating capacity
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)       // extract capacity
                .reduce(0, Integer::sum);  // sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        // ---------------- UC10 END ----------------
    }
}