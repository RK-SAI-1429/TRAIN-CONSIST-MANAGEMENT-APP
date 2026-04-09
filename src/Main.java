import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        // User input
        System.out.print("\nEnter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // ---------------- UC18 START ----------------

        boolean found = false;

        for (int i = 0; i < bogieIDs.length; i++) {
            if (bogieIDs[i].equals(searchKey)) {
                found = true;
                break; // Early termination
            }
        }

        // ---------------- UC18 END ----------------

        // Result
        if (found) {
            System.out.println("Bogie Found: " + searchKey);
        } else {
            System.out.println("Bogie NOT Found");
        }

        sc.close();
    }
}