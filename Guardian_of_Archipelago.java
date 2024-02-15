import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Routes {
    public static String[] getPossibleRoutes(int islandIndex) {
        // Define and return possible routes based on the island index
        String[][] allRoutes = {
                { "Imber Cove ---> Autumnvale", "Imber Cove ---> Frostpeak ---> Autumnvale",
                        "Imber Cove ---> Frostpeak ---> Aquaville ---> Kindlewood ---> Autumnvale" },
                { "Imber Cove ---> Frostpeak", "Imber Cove ---> Autumnvale ---> Frostpeak",
                        "Imber Cove ---> Autumnvale ---> Kindlewood ---> Aquaville ---> Frostpeak" },
                { "Imber Cove ---> Autumnvale ---> Kindlewood",
                        "Imber Cove ---> Frostpeak ---> Autumnvale ---> Kindlewood",
                        "Imber Cove ---> Frostpeak ---> Aquaville ---> Kindlewood" },
                { "Imber Cove ---> Frostpeak ---> Aquaville",
                        "Imber Cove ---> Autumnvale ---> Frostpeak ---> Aquaville",
                        "Imber Cove ---> Autumnvale ---> Kindlewood ---> Aquaville" }
        };
        return allRoutes[islandIndex - 1];
    }
}

public class GuardianofArchipelago {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void Introduction() {
        System.out.println("MISSIONS TO ACCOMPLISH:");
        System.out.println(" * Save all the stranded tourists who scattered in different islands");
        System.out.println(" * Overcome the obstacles by answering the random general questions and riddles");
        System.out.println(" * Bring the tourists back home (Celestial Shores)");
    }

    public static void Map() {
        System.out.println("\nMAP\n");
        String[] islands = { "Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\t\t\t\t\t\t\t       You're here!\n");
                System.out.println("\t\t\t\t\t\t\t *********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t *                     *");
                System.out.println(
                        "\t\t\t\t ------------------------*     " + islands[i] + "      * -----------------------");
                System.out.println("\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println("\t\t\t\t|\t\t\t ***********************\t\t\t|");
                System.out.print("\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\tv\t\t\t\t\t\t\t\t\t|\n");

            } else if (i == 5) {
                System.out.println("\t\t\t\t|\t\t\t ***********************\t\t\t|"); // Celestial Shores
                System.out.println("\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out
                        .println("\t\t\t\t ----------------------> *   " + islands[i] + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t *********************");

            } else if (i % 2 == 0) {
                System.out.println("\t\t\t\t|\t\t\t\t\t  -------\t     *********************"); // Aquaville and
                                                                                                  // Frostpeak
                System.out.println("\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                System.out.println("\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                System.out.println("\t\t\t\t|\t\t\t\t\t\t\t     *                     *");
                System.out.println(
                        "\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t|\t\t\t\t\t\t\t\t\t|");

            } else {
                System.out.println("\t\t     ***********************\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");
            }
        }
    }

    public static void checkList() {
        System.out.println("\n\n");
        System.out.println("Checklist:\n( ) Autumnvale\n( ) Frostpeak\n( ) Kindlewood\n( ) Aquaville");
    }

    public static void Islands() {
        String[] location = { "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville" };
        Destination(location);
    }

    public static void Destination(String[] locations) {
        System.out.print(
                "\nIslands\n(1) Autumnvale\n(2) Frostpeak\n(3) Kindlewood\n(4) Aquaville\n\nEnter the island you want to go: ");
        int choice = scan.nextInt();

        if (choice >= 1 && choice <= locations.length) {
            switch (choice) {
                case 1:
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // autumnvale
                    System.out.print(
                            "\nDESCRIPTION: Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
                    displayRoutes(1);
                    break;
                case 2:
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // frostpeak
                    System.out.println(
                            "\nDESCRIPTION: An island of ice and snow. Frostpeak is the territory of wolves which has a keen sense of smell, hearing, and vision.\n");
                    displayRoutes(2);
                    break;
                case 3:
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // kindlewood
                    System.out.println(
                            "\nDESCRIPTION: One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    displayRoutes(3);
                    break;
                case 4:
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // aquaville
                    System.out.println(
                            "\nDESCRIPTION: Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    displayRoutes(4);
                    break;
                default:
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    

    public static void displayRoutes(int islandIndex) {
        Routes Routes = new Routes();
        
        System.out.println("\nPossible routes from your current location:");
        String[] routes = Routes.getPossibleRoutes(islandIndex);
        int numRoutes = routes.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-100 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meter - " + routes[i]);

        }

        // Find shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display shortest route
        System.out.println(
                "Shortest Route: (" + (shortestRouteIndex + 1) + ") Distance: " + distances[shortestRouteIndex] + " meter - " + routes[shortestRouteIndex]);
        System.out.print("\nEnter the number of the route you want to take from the options: ");
        int chosenRoutes = scan.nextInt();
        System.out.println("You choose this routes: (" + chosenRoutes + ") " + distances[chosenRoutes - 1] + " meter - " + routes[chosenRoutes - 1]);
    }

    public static void main(String[] args) {
        System.out.println("\n\nWelcome to the Guardian of Archipelago!\n");

        Introduction();

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.print("\nDo you want to continue?\n(1) Yes\n(2) No \n");
            System.out.print("\nEnter your choice: ");
            int YN = scan.nextInt();
            switch (YN) {
                case 1:
                    continueProgram = false;
                    Map();
                    checkList();
                    Islands();
                    break;
                case 2:
                    System.out.print("\nAre you sure you want to end the game?\n(1) Yes\n(2) No\nEnter your choice: ");
                    int exiting = scan.nextInt();
                    switch (exiting) {
                        case 1:
                            continueProgram = false;
                            System.out.print("\nExit");
                            break;
                        case 2:
                            continueProgram = true;
                            break;
                        default:
                            System.out.println("Invalid input. Enter the number that are listed in the option only.");

                    }
                    break;
                default:
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");

            }
        }
        scan.close();
    }
}
