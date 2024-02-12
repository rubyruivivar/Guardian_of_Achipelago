import java.util.Scanner;

public class Guardian_of_Archipelago {
    static Scanner scan = new Scanner(System.in);

    public static void Introduction() {
        System.out.println("Introduction");
    }

    public static void Map() {
        System.out.println("\nMAP:\n");
        String[] islands = {"Coastal Shore", "Aquaville ", "Kindlewood", "Frostpeak ", "Autumnvale", "Imber Cove"};
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\t***********************");
                System.out.println("\t*                     *");
                System.out.println("\t *   " + islands[i] + "   *");
                System.out.println("\t*                     *");
                System.out.println("\t***********************\n");
            } else if (i % 2 == 0) {
                System.out.println("\t***********************");
                System.out.println("\t*                     *");
                System.out.println("\t*      " + islands[i] + "     *");
                System.out.println("\t*                     *");
                System.out.println("\t***********************\n");
            } else {
                System.out.println("\t\t\t\t\t\t\t\t***********************");
                System.out.println("\t\t\t\t\t\t\t\t*                     *");
                System.out.println("\t\t\t\t\t\t\t\t*      " + islands[i] + "     *");
                System.out.println("\t\t\t\t\t\t\t\t*                     *");
                System.out.println("\t\t\t\t\t\t\t\t***********************\n");
            }
        }
    }

    public static void checkList() {
        System.out.println("Checklist:\n( ) Aquaville\n( ) Kindlewood\n( ) Frostpeak\n( ) Autumnvale");
    }

    public static void Islands() {
        String[] location = {"Coastal Shore", "Aquaville ", "Kindlewood", "Frostpeak ", "Autumnvale", "Imber Cove"};

        System.out.print("\nIslands\n(1) Aquaville\n(2) Kindlewood\n(3) Frostpeak\n(4) Autumnvale\nEnter the island you want to go: ");
        int loc = scan.nextInt();

        switch (loc) {
            case 1:
                System.out.println("You choose the island of " + location[0]);
                System.out.println("\nDescription");
                break;
            case 2:
                System.out.println("You choose the island of " + location[1]);
                System.out.println("\nDescription");
                break;
            case 3:
                System.out.println("You choose the island of " + location[2]);
                System.out.println("\nDescription");
                break;
            case 4:
                System.out.println("You choose the island of " + location[3]);
                System.out.println("\nDescription");
                break;
            default:
                System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
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
                    System.out.print("Are you sure you want to end the game?\n(1) Yes\n(2) No\nEnter your choice: ");
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
            }
        }
        
    }
}
