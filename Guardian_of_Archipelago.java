import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuardianOfArchipelago {
    static Scanner scan = new Scanner(System.in);

    public static void Introduction() {
        System.out.println("Introduction");
    }

    public static void Map() {
        System.out.println("\nMAP\n");
        String[] islands = {"Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shore"};
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\t\t\t\t\t\t\t ***********************");
                System.out.println("\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t ------------------------ *     " + islands[i] + "    * ------------------------");
                System.out.println("\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println("\t\t\t\t|\t\t\t ***********************\t\t\t|");
                System.out.print("\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\tv\t\t\t\t\t\t\t\t\t|\n");
                
            } else if (i == 5){
            	System.out.println("\t\t\t\t|\t\t\t ***********************\t\t\t|");
                System.out.println("\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println("\t\t\t\t ----------------------> *   " + islands[i] + "   * <----------------------");
                System.out.println("\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t ***********************");
                
            }else if (i % 2 == 0) {
                System.out.println("\t\t\t\t|\t\t\t\t\t  |-----|\t     ***********************");
                System.out.println("\t\t\t\t|\t\t\t\t\t        |-----|      *                     *");
                System.out.println("\t\t\t\t|\t\t\t\t\t\t      |----- *      " + islands[i] + "      *");
                System.out.println("\t\t\t\t|\t\t\t\t\t\t\t     *                     *");
                System.out.println("\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
            
            }else {
                System.out.println("\t\t     ***********************\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t     *     " + islands[i] + "     * -----|\t\t\t\t\t\t\t|");
                System.out.println("\t\t     *                     *      |-----|\t\t\t\t\t\t|");
                System.out.println("\t\t     ***********************\t\t|-----|\t\t\t\t\t\t|\n\t\t\t\t|\t\t\t      |-----|\t\t\t\t\t|\n\t\t\t\t|\t\t\t\t    |-----|\t\t\t\t|");
            }
        }
    }

    public static void checkList() {
        System.out.println("Checklist:\n( ) Autumnvale\n( ) Frostpeak\n( ) Kindlewood\n( ) Aquaville");
    }

    public static void Islands() {
        String[] location = {"Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville"};
        Destination(location);
    }

    public static void Destination(String[] locations) {
        /*System.out.println("\nIslands");
        for (int i = 0; i < locations.length; i++) {
            System.out.println("(" + (i + 1) + ") " + locations[i]);
        }*/
        System.out.print("\nIslands\n(1) Autumnvale\n(2) Frostpeak\n(3) Kindlewood\n(4) Aquaville\nEnter the island you want to go: ");
        int choice = scan.nextInt();
        
        if (choice >= 1 && choice <= locations.length) {
            switch (choice) {
                case 1:
                    System.out.println("\nYou choose the island of " + locations[choice - 1]);
                    System.out.println("\nDescription");
                    //System.out.print("\nPossible routes\n(1) Imber Cove ---> Autumnvale\n(2) Imber Cove ---> Frostpeak ---> Autumnvale\n(3) Imber Cove ---> Frostpeak ---> Aquaville ---> Kindlewood ---> Autumnvale\nEnter the route you want to take: ");
                    displayRoutes(1);
                    int routes1 = scan.nextInt();
                    
                    break;
                case 2:
                    System.out.println("\nYou choose the island of " + locations[choice - 1]);
                    System.out.println("\nDescription");
                    //System.out.print("Possible routes\n(1) Imber Cove ---> Frostpeak\n(2) Imber Cove ---> Autumnvale ---> Frostpeak(3) Imber Cove ---> Autumnvale ---> Kindlewood ---> Aquaville ---> Frostpeak\nEnter the route you want to take: ");
                    displayRoutes(2);
                    int routes2 = scan.nextInt();
                    break;
                case 3:
                    System.out.println("\nYou choose the island of " + locations[choice - 1]);
                    System.out.println("\nDescription");
                    //System.out.print("\nPossible routes\n(1) Imber Cove ---> Autumnvale ---> Kindlewood\n(2) Imber Cove ---> Frostpeak ---> Autumnvale ---> Kindlewood\n(3) Imber Cove ---> Frostpeak ---> Aquaville ---> Kindlewood\nEnter the route you want to take: ");
                    displayRoutes(3);
                    int routes3 = scan.nextInt();
                    break;
                case 4:
                    System.out.println("\nYou choose the island of " + locations[choice - 1]);
                    System.out.println("\nDescription");
                    //System.out.print("\nPossible routes\n(1) Imber Cove ---> Frostpeak --->  Aquaville\n(2) Imber Cove ---> Autumnvale ---> Frostpeak ---> Aquaville(3) Imber Cove ---> Autumnvale ---> Kindlewood ---> Aquaville\nEnter the route you want to take: ");
                    displayRoutes(4);
                    int routes4 = scan.nextInt();
                    break;
                default:
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            } 
        }else {
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }
    
    public static void possibleRoutes() {
    	System.out.println("Possible routes\n(1) Imber Cove ---> Autumnvale\n(2) Imber Cove ---> Frostpeak ---> Autumnvale\n(3) Imber Cove ---> Frostpeak ---> Aquaville ---> Kindlewood ---> Autumnvale");
    	System.out.println("Possible routes\n(1) Imber Cove ---> Frostpeak\n(2) Imber Cove ---> Autumnvale ---> Frostpeak(3) Imber Cove ---> Autumnvale ---> Kindlewood ---> Aquaville ---> Frostpeak");
    	System.out.println("Possible routes\n(1) Imber Cove ---> Autumnvale ---> Kindlewood\n(2) Imber Cove ---> Frostpeak ---> Autumnvale ---> Kindlewood\n(3) Imber Cove ---> Frostpeak ---> Aquaville ---> Kindlewood");
    	System.out.println("Possible routes\n(1) Imber Cove ---> Frostpeak --->  Aquaville\n(2) Imber Cove ---> Autumnvale ---> Frostpeak ---> Aquaville(3) Imber Cove ---> Autumnvale ---> Kindlewood ---> Aquaville");
    }
    
    public static void displayRoutes(int islandIndex) {
        System.out.println("\nPossible routes from your current location:");
        String[] routes = getPossibleRoutes(islandIndex);
        int numRoutes = routes.length;
    
        Random random = new Random();
        int[] distances = new int[numRoutes];
    
        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(91) + 10 + (i * 10); // Distance range: 10-100 km, increasing with index
        }
    
        // Sort distances array to ensure increasing order
        Arrays.sort(distances);
    
        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " m - " + routes[i]);
        }
    
        // Find shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }
    
        // Display shortest route
        System.out.println("Shortest Route: (" + (shortestRouteIndex + 1) + ") Distance: " + distances[shortestRouteIndex] + " m");
        System.out.println("\nEnter the number of the route you want to take from the options:");
    }

    
    public static String[] getPossibleRoutes(int islandIndex) {
        // Define and return possible routes based on the island index
        String[][] allRoutes = {
                {"Imber Cove ---> Autumnvale", "Imber Cove ---> Frostpeak ---> Autumnvale", "Imber Cove ---> Frostpeak ---> Aquaville ---> Kindlewood ---> Autumnvale"},
                {"Imber Cove ---> Frostpeak", "Imber Cove ---> Autumnvale ---> Frostpeak", "Imber Cove ---> Autumnvale ---> Kindlewood ---> Aquaville ---> Frostpeak"},
                {"Imber Cove ---> Autumnvale ---> Kindlewood", "Imber Cove ---> Frostpeak ---> Autumnvale ---> Kindlewood", "Imber Cove ---> Frostpeak ---> Aquaville ---> Kindlewood"},
                {"Imber Cove ---> Frostpeak ---> Aquaville", "Imber Cove ---> Autumnvale ---> Frostpeak ---> Aquaville", "Imber Cove ---> Autumnvale ---> Kindlewood ---> Aquaville"}
        };
        return allRoutes[islandIndex - 1];
    }


    public static void main (String[] args) {
        System.out.println("Welcome to the Guardian of Archipelago!");

        Introduction();
        
        boolean continueProgram = true;
        while (continueProgram) {
            System.out.print("\nDo you want to help the stranded tourist?\n(1) Yes\n(2) No\nEnter your choice: ");
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
