import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Map{
    public static void map() {
    System.out.println("\nMAP\n");
    String[] islands = { "Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shores" };
    for (int i = 0; i < islands.length; i++) {
        if (i == 0) {
            System.out.println("\t\t\t\t\t\t\t       You're here!\n");
            System.out.println("\t\t\t\t\t\t\t *********************"); // Imber Cove
            System.out.println("\t\t\t\t\t\t\t *                     *");
            System.out.println("\t\t\t\t ------------------------*     " + islands[i] + "      * -----------------------");
            System.out.println("\t\t\t\t|\t\t\t *                     *\t\t\t|");
            System.out.println("\t\t\t\t|\t\t\t ***********************\t\t\t|");
            System.out.print("\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\tv\t\t\t\t\t\t\t\t\t|\n");

        } else if (i == 5) {
            System.out.println("\t\t\t\t|\t\t\t ***********************\t\t\t|"); // Celestial Shores
            System.out.println("\t\t\t\t|\t\t\t *                     *\t\t\t|");
            System.out.println("\t\t\t\t ----------------------> *   " + islands[i] + "  * <----------------------");
            System.out.println("\t\t\t\t\t\t\t *                     *");
            System.out.println("\t\t\t\t\t\t\t *********************");

        } else if (i % 2 == 0) {
            System.out.println("\t\t\t\t|\t\t\t\t\t  -------\t     *********************"); // Aquaville and Frostpeak
            System.out.println("\t\t\t\t|\t\t\t\t\t        -------      *                     *");
            System.out.println("\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
            System.out.println("\t\t\t\t|\t\t\t\t\t\t\t     *                     *");
            System.out.println("\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t|\t\t\t\t\t\t\t\t\t|");

        } else {
            System.out.println("\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Autumnvale and Kindlewood
            System.out.println("\t\t     *                     *\t\t\t\t\t\t\t\t|");
            System.out.println("\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
            System.out.println("\t\t     *                     *      -------\t\t\t\t\t\t|");
            System.out.println("\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");
            }
        }
    }
}

class Routes {
    public static String[] routesImberCove(int islandIndex1) { // from Imber Cove
    // Define and return possible routes based on the island index
    String[][] allRoutes1 = {
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
        return allRoutes1[islandIndex1 - 1];
    }

    public static String[] routesAutumnvale(int islandIndex2) { // from Autumnvale
        String[][] allRoutes2 = {
                { "Autumnvale ---> Frostpeak", "Autumnvale ---> Kindlewood ---> Aquaville ---> Frostpeak" },
                { "Autumnvale ---> Kindlewood", "Autumnvale ---> Frostpeak ---> Aquaville ---> Kindlewood" },
                { "Autumnvale ---> Frostpeak ---> Aquaville", "Autumnvale ---> Kindlewood ---> Aquaville" },
        };
        return allRoutes2[islandIndex2 - 1];
    }
    
    public static String[] routesFrostpeak(int islandIndex3) { // from Frostpeak
        String[][] allRoutes3 = {
            { "Frostpeak ---> Autumnvale", "Frostpeak ---> Aquaville ---> Kindlewood ---> Autumnvale" },
            { "Frostpeak ---> Autumnvale ---> Kindlewood", "Frostpeak ---> Aquaville ---> Kindlewood" },
            { "Frostpeak ---> Aquaville", "Frostpeak ---> Autumnvale ---> Kindlewood ---> Aquaville" },
        };
        return allRoutes3[islandIndex3 - 1];
    }
    
    public static String[] routesKindlewood(int islandIndex4) { //from Kindlewood
        String[][] allRoutes4 = {
            { "Kindlewood ---> Autumnvale", "Kindlewood ---> Aquaville ---> Frostpeak ---> Autumnvale" },
            { "Kindlewood ---> Autumnvale ---> Frostpeak", "Kindlewood ---> Aquaville ---> Frostpeak" },
            { "Kindlewood ---> Aquaville", "Kindlewood ---> Autumnvale ---> Frostpeak ---> Aquaville" },
        };
        return allRoutes4[islandIndex4 - 1];
    }
    
    public static String[] routesAquaville(int islandIndex5) { //from Aquaville
        String[][] allRoutes5 = {
            { "Aquaville ---> Frostpeak ---> Autumnvale", "Aquaville ---> Kindlewood ---> Autumnvale" },
            { "Aquaville ---> Frostpeak", "Aquaville ---> Kindlewood ---> Autumnvale ---> Frostpeak" },
            { "Aquaville ---> Kindlewood", "Aquaville ---> Frostpeak ---> Autumnvale ---> Kindlewood" },
        };
        return allRoutes5[islandIndex5 - 1];
    }
}

class QuizGame {
    private Scanner scan;
    private Random random;
    private String[] questions;
    private String[] answers;
    private Thread timerThread;

    public QuizGame(String[] questions, String[] answers) {
        this.scan = new Scanner(System.in);
        this.random = new Random();
        this.questions = questions;
        this.answers = answers;
    }
    
    public QuizGame() {
        String[] defaultQuestions = {
            "What is the capital of France?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the boiling point of water in Celsius?",
            "Which country is known as the Land of the Rising Sun?",
            "Which planet is known as the ‘Red Planet’?",
            "What do we call the pattern of stars that people imagine in the sky?",
            "On what continent would you find the world’s largest desert?",
            "Who was the first Disney princess?",
            "Who is known as the “Father of Modern Physics”?",
            "Who painted the famous artwork “The Last Supper”?",
            "What is the name of the little mermaid in the Disney movie?",
            "What animal is known for its long neck and spots on its body?",
            "In what season do leaves fall off the trees?",
            "What animal is known for its ability to change color to match its surroundings?",
            "In what fairy tale does a pumpkin turn into a carriage?",
            "What is the main color of the Smurfs?",
            "In the nursery rhyme, who had a farm with a dog named BINGO?",
            "Which bird can repeat words and phrases that it hears, often kept as a pet?",
            "Google Chrome, Safari, Firefox, and Explorer are different types of what?",
            "What part of the atom has no electric charge?",
            "What is the symbol for potassium?",
            "What is meteorology the study of?",
            "Which planet is the hottest in the solar system?",
            "Which natural disaster is measured with a Richter scale?",
            "What animals are pearls found in?",
            "Which planet has the most gravity?",
            "What was the name of the actor who played Jack Dawson in Titanic?",
            "Which cartoon character lives in a pineapple under the sea?",
            "Which popular soft drink was originally created as a medicine in the 19th century?",
            "What goes up and down but doesn’t move?",
            "What has one eye, but can’t see?",
            "What building has the most stories?",
            "I am the beginning of everything, the end of everywhere. I'm the beginning of eternity, the end of time and space. What am I?",
            "What can fill a room but takes up no space?",
            "What kind of tree can you carry in your hand?",
            "They come out at night without being called, and are lost in the day without being stolen. What are they?",
            "What goes through cities and fields, but never moves?",
            "When it is alive we sing, when it is dead we clap ourhands. What is it?",
            "I have no life, but I can die. What am I?",
            "What kind of room has no walls, door or windows?",
            "I make a loud sound when I’m changing. When I do change, I get bigger but weigh less. What am I?",
            "It has keys, but no locks. It has space, but no room. You can enter, but can’t go inside. What is it?",
            "I’m orange, I wear a green hat and I sound like a parrot. What am I?",
            "What thrives when you feed it but dies when you water it?",
            "What has 13 hearts but no other organs?",
            "What kind of ship has two mates but no captain?",
            "Which word in the dictionary is spelled incorrectly?",
            "What begins with an 'e' and only contains one letter?",
            "Which fish costs the most?",
            "What five-letter word becomes shorter when you add two letters to it?",
            "What has a face and two hands but no arms or legs?",
            "What has many keys but cannot open a single lock?",
            "What's always found on the ground but never gets dirty?",
            "What gets wet while drying?",
            "What has a head and a tail but no body?",
            "What is full of holes but still holds water?",
            "What has many teeth but cannot bite?",
            "What has one head, one foot, and four legs?",
            "What's always running but never gets hot?",
        };

        String[] defaultAnswers = {"PARIS", "WILLIAM SHAKESPEARE", "100", "JAPAN", "MARS", "CONSTELLATION", "ANTARCTICA", "SNOW WHITE", "ALBERT EINSTEIN", "LEONARDO DA VINCI", "ARIEL", "GIRAFFE", "AUTUMN/FALL", "CHAMELEON", "CINDERELLA", "BLUE", "OLD MACDONALD", "PARROT", "WEB BROWSERS", "NEUTRON", "K", "WEATHER", "VENUS", "EARTHQUAKES", "OYSTERS", "JUPITER", "LEONARDO DICAPRIO", "SPONGEBOB SQUAREPANTS", "COCA-COLA", "STAIRCASE", "NEEDLE", "LIBRARY", "E", "LIGHT", "PALM", "STARS", "ROAD", "BIRTHDAY CANDLE", "BATTERY", "MUSHROOM", "POPCORN", "KEYBOARD", "CARROT", "FIRE", "DECK OF CARDS", "RELATIONSHIP", "INCORRECTLY", "ENVELOPE", "GOLDFISH", "SHORT", "CLOCK", "PIANO", "SHADOW", "TOWEL", "COIN", "SPONGE", "COMB", "BED", "REFRIGERATOR",
        };

        this.questions = defaultQuestions;
        this.answers = defaultAnswers;
        this.random = new Random();
        this.scan = new Scanner(System.in);
    }

    public String getRandomQuestion() {
        int index = random.nextInt(questions.length);
        return questions[index];
    }

    public boolean checkAnswer(String userAnswer, int questionIndex) {
        return userAnswer.equalsIgnoreCase(answers[questionIndex]);
    }

    public void startTimer(int seconds) {
        timerThread = new Thread(() -> {
            for (int i = seconds; i >= 0; i--) {
                System.out.print("\r" + i + " seconds remaining");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("\nTimer stopped.");
                    return;
                }
            }
            System.out.println("\rTime's up!");
            System.exit(0);
        });

        timerThread.start();
    }

    public void stopTimer() {
        timerThread.interrupt();
    }
    
    public String[] getQuestions() {
        return questions;
    }

    public String[] getAnswers() {
        return answers;
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
                    System.out.print("\nDESCRIPTION: Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
                    displayRoutes(1);
                    onBoat();
                    break;
                case 2:
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // frostpeak
                    System.out.println("\nDESCRIPTION: An island of ice and snow. Frostpeak is the territory of wolves which has a keen sense of smell, hearing, and vision.\n");
                    displayRoutes(2);
                    onBoat();
                    break;
                case 3:
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // kindlewood
                    System.out.println("\nDESCRIPTION: One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    displayRoutes(3);
                    onBoat();
                    break;
                case 4:
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // aquaville
                    System.out.println("\nDESCRIPTION: Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    displayRoutes(4);
                    onBoat();
                    break;
                default:
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void displayRoutes(int islandIndex1) {
        Routes Routes = new Routes();
        
        System.out.println("\nPossible routes from your current location:");
        String[] routes = Routes.routesImberCove(islandIndex1);
        int numRoutes = routes.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
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
        System.out.println("The route you choose is: (" + chosenRoutes + ") " + distances[chosenRoutes - 1] + " meter - " + routes[chosenRoutes - 1]);
    }
        
    public static void onBoat() {
        System.out.println("\nThe boat where you at started sailing...");
        System.out.println("\nWarning: You encounter an obstacle!\n");
    
        QuizGame quizGame = new QuizGame();
    
        System.out.println("Welcome! You have 60 seconds to answer the question.");
        quizGame.startTimer(60);
    
        String question = quizGame.getRandomQuestion();
        System.out.println(question);
        int questionIndex = Arrays.asList(quizGame.getQuestions()).indexOf(question);
        scan.nextLine(); // Consume the newline character
        String userAnswer = scan.nextLine().toUpperCase();
    
        // Stop the timer thread when the user enters an answer
        quizGame.stopTimer();
    
        if (questionIndex >= 0 && questionIndex < quizGame.getAnswers().length) {
            if (quizGame.checkAnswer(userAnswer, questionIndex)) {
                System.out.println("Your answer is: " + userAnswer);
                System.out.println("Correct!");
            } else {
                System.out.println("Your answer is: " + userAnswer);
                System.out.println("Correct answer is: " + quizGame.getAnswers()[questionIndex]);
                System.out.println("Incorrect!");
            }
        } else {
            System.out.println("Invalid question index.");
        }
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
                    Map Map = new Map();
                    Map.map();
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
