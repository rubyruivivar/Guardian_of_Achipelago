import java.util.Scanner;

public class Guardian_of_Archipelago {
    static Scanner scan = new Scanner(System.in);

    public static void Introduction() {
        System.out.println("Introduction");
    }

    public static void Map() {
        System.out.println("\nMAP:\n");
        String[] islands = {"Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shore"};
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\t\t\t\t***********************");
                System.out.println("\t\t\t\t*                     *");
                System.out.println("\t\t\t\t*   " + islands[i] + "   *");
                System.out.println("\t\t\t\t*                     *");
                System.out.println("\t\t\t\t***********************\n");
                System.out.println("\n\n");
                
            } else if (i == 5){
            	System.out.println("\t\t\t\t***********************");
                System.out.println("\t\t\t\t*                     *");
                System.out.println("\t\t\t\t*   " + islands[i] + "   *");
                System.out.println("\t\t\t\t*                     *");
                System.out.println("\t\t\t\t***********************\n");
                
            }else if (i % 2 == 0) {
                System.out.println("\t***********************");
                System.out.println("\t*                     *");
                System.out.println("\t*      " + islands[i] + "      *");
                System.out.println("\t*                     *");
                System.out.println("\t***********************\n");
                System.out.println("\n\n");
            
            }else {
                System.out.println("\t\t\t\t\t\t\t\t***********************");
                System.out.println("\t\t\t\t\t\t\t\t*                     *");
                System.out.println("\t\t\t\t\t\t\t\t*     " + islands[i] + "     *");
                System.out.println("\t\t\t\t\t\t\t\t*                     *");
                System.out.println("\t\t\t\t\t\t\t\t***********************\n");
                System.out.println("\n\n");
            }
        }
    }

    public static void checkList() {
        System.out.println("Checklist:\n( ) Autumnvale\n( ) Frostpeak\n( ) Kindlewood\n( ) Aquaville");
    }

    public static void Islands() {
        String[] location = {"Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville"};
  
        System.out.print("\nIslands\n(1) Autumnvale\n(2) Frostpeak\n(3) Kindlewood\n(4) Aquaville\nEnter the island you want to go: ");
        
        int loc = scan.nextInt();

        switch (loc) {
            case 1:
                System.out.println("\nYou choose the island of " + location[0]);
                System.out.println("\nDescription");
                
                break;
            case 2:
                System.out.println("\nYou choose the island of " + location[1]);
                System.out.println("\nDescription");
                break;
            case 3:
                System.out.println("\nYou choose the island of " + location[2]);
                System.out.println("\nDescription");
                break;
            case 4:
                System.out.println("\nYou choose the island of " + location[3]);
                System.out.println("\nDescription");
                break;
            default:
                System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }
    
    public static void possibleRoutes() {
    	System.out.println("Possible routes\n(1) Imber Cove ---> Autumnvale\n(2) Imber Cove ---> Frostpeak ---> Autumnvale\n(3) Imber Cove ---> Frostpeak ---> Aquaville ---> Kindlewood ---> Autumnvale");
    	System.out.println("Possible routes\n(1) Imber Cove ---> Frostpeak\n(2) Imber Cove ---> Autumnvale ---> Frostpeak(3) Imber Cove ---> Autumnvale ---> Kindlewood ---> Aquaville ---> Frostpeak");
    	System.out.println("Possible routes\n(1) Imber Cove ---> Autumnvale ---> Kindlewood\n(2) Imber Cove ---> Frostpeak ---> Autumnvale ---> Kindlewood\n(3) Imber Cove ---> Frostpeak ---> Aquaville ---> Kindlewood");
    	System.out.println("Possible routes\n(1) Imber Cove ---> Frostpeak --->  Aquaville\n(2) Imber Cove ---> Autumnvale ---> Frostpeak ---> Aquaville(3) Imber Cove ---> Autumnvale ---> Kindlewood ---> Aquaville");
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
                    possibleRoutes();
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
    }
}
