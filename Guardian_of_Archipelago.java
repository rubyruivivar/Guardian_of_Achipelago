import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Map;
import java.awt.Color;

class nextadven {
    public static void adventure() {
        // ANSI escape code for green text
        String greenColor = "\u001B[32m";

        System.out.println(greenColor +
                "\t     ████████╗ ██████╗     ████████╗██╗  ██╗███████╗    ███╗   ██╗███████╗██╗  ██╗████████╗     █████╗ ██████╗ ██╗   ██╗███████╗███╗   ██╗████████╗██╗   ██╗██████╗ ███████╗██╗");
        System.out.println(
                "\t     ╚══██╔══╝██╔═══██╗    ╚══██╔══╝██║  ██║██╔════╝    ████╗  ██║██╔════╝╚██╗██╔╝╚══██╔══╝    ██╔══██╗██╔══██╗██║   ██║██╔════╝████╗  ██║╚══██╔══╝██║   ██║██╔══██╗██╔════╝██║");
        System.out.println(
                "\t        ██║   ██║   ██║       ██║   ███████║█████╗      ██╔██╗ ██║█████╗   ╚███╔╝    ██║       ███████║██║  ██║██║   ██║█████╗  ██╔██╗ ██║   ██║   ██║   ██║██████╔╝█████╗  ██║");
        System.out.println(
                "\t        ██║   ██║   ██║       ██║   ██╔══██║██╔══╝      ██║╚██╗██║██╔══╝   ██╔██╗    ██║       ██╔══██║██║  ██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║   ██║   ██║   ██║██╔══██╗██╔══╝  ╚═╝");
        System.out.println(
                "\t        ██║   ╚██████╔╝       ██║   ██║  ██║███████╗    ██║ ╚████║███████╗██╔╝ ██╗   ██║       ██║  ██║██████╔╝ ╚████╔╝ ███████╗██║ ╚████║   ██║   ╚██████╔╝██║  ██║███████╗██╗");

        // ANSI escape code to reset text color to default
        String resetColor = "\u001B[0m";
        System.out.print(resetColor); // Resetting color to default after printing the colored text
    }
}

class banner {
    public static void generateMAPBanner() {
        String beige = "\033[38;5;223m";

        System.out.println(beige +
                "\n                                                                                                                                                                                   ");
        System.out.println(
                "       █████   ███   █████          ████                                                 █████                  █████████                                     █████  ███ ");
        System.out.println(
                "       ░░███   ░███  ░░███          ░░███                                                ░░███                  ███░░░░░███                                   ░░███  ░░░ ");
        System.out.println(
                "        ░███   ░███   ░███   ██████  ░███   ██████   ██████  █████████████    ██████     ███████    ██████     ███     ░░░  █████ ████  ██████   ████████   ███████  ████   ██████   ████████  ");
        System.out.println(
                "        ░███   ░███   ░███  ███░░███ ░███  ███░░███ ███░░███░░███░░███░░███  ███░░███   ░░░███░    ███░░███   ░███         ░░███ ░███  ░░░░░███ ░░███░░███ ███░░███ ░░███  ░░░░░███ ░░███░░███  ");
        System.out.println(
                "        ░░███  █████  ███  ░███████  ░███ ░███ ░░░ ░███ ░███ ░███ ░███ ░███ ░███████      ░███    ░███ ░███   ░███    █████ ░███ ░███   ███████  ░███ ░░░ ░███ ░███  ░███   ███████  ░███ ░███ ");
        System.out.println(
                "         ░░░█████░█████░   ░███░░░   ░███ ░███  ███░███ ░███ ░███ ░███ ░███ ░███░░░       ░███ ███░███ ░███   ░░███  ░░███  ░███ ░███  ███░░███  ░███     ░███ ░███  ░███  ███░░███  ░███ ░███  ");
        System.out.println(
                "           ░░███ ░░███     ░░██████  █████░░██████ ░░██████  █████░███ █████░░██████      ░░█████ ░░██████     ░░█████████  ░░████████░░████████ █████    ░░████████ █████░░████████ ████ █████  ");
        System.out.println(
                "            ░░░   ░░░       ░░░░░░  ░░░░░  ░░░░░░   ░░░░░░  ░░░░░ ░░░ ░░░░░  ░░░░░░        ░░░░░   ░░░░░░       ░░░░░░░░░    ░░░░░░░░  ░░░░░░░░ ░░░░░      ░░░░░░░░ ░░░░░  ░░░░░░░░ ░░░░ ░░░░░  \033[0m");
        System.out.println(
                "                                                                                                                                                                                                           ");
        System.out.println(
                "                                                                                                                                                                                                         ");
        System.out.println(
                "                                                                                                                                                                                                 ");
        System.out.println(
                "                                                 ██████       █████████                      █████       ███                     ████                                 ███");
        System.out.println(
                "                                                 ███░░███     ███░░░░░███                    ░░███       ░░░                     ░░███                                ░███");
        System.out.println(
                "                                       ██████   ░███ ░░░     ░███    ░███  ████████   ██████  ░███████   ████  ████████   ██████  ░███   ██████    ███████  ██████    ░███ ");
        System.out.println(
                "                                      ███░░███ ███████       ░███████████ ░░███░░███ ███░░███ ░███░░███ ░░███ ░░███░░███ ███░░███ ░███  ░░░░░███  ███░░███ ███░░███   ░███  ");
        System.out.println(
                "                                     ░███ ░███░░░███░        ░███░░░░░███  ░███ ░░░ ░███ ░░░  ░███ ░███  ░███  ░███ ░███░███████  ░███   ███████ ░███ ░███░███ ░███   ░███");
        System.out.println(
                "                                     ░███ ░███  ░███         ░███    ░███  ░███     ░███  ███ ░███ ░███  ░███  ░███ ░███░███░░░   ░███  ███░░███ ░███ ░███░███ ░███   ░░░ ");
        System.out.println(
                "                                     ░░██████   █████        █████   █████ █████    ░░██████  ████ █████ █████ ░███████ ░░██████  █████░░████████░░███████░░██████     ███ ");
        System.out.println(
                "                                      ░░░░░░   ░░░░░        ░░░░░   ░░░░░ ░░░░░      ░░░░░░  ░░░░ ░░░░░ ░░░░░  ░███░░░   ░░░░░░  ░░░░░  ░░░░░░░░  ░░░░░███ ░░░░░░     ░░░ ");
        System.out.println(
                "                                                                                                               ░███                               ███ ░███ ");
        System.out.println(
                "                                                                                                               █████                             ░░██████ ");
        System.out.println(
                "                                                                                                             ░░░░░                               ░░░░░░");
        String resetColor = "\033[0m";
        System.out.print(resetColor);
    }
}

class mapwithlegend {
    public static void map() {
        System.out.println(
                "                                                                                     ________________________________________________");
        System.out.println(
                "                                                                                     |                                              |");
        System.out.println(
                "                                                                                     |\u001B[31m         LEGEND\u001B[0m                               |");
        System.out.println(
                "                                                                                     |                               **********     |");
        System.out.println(
                "                                                                                     |\u001B[33m   Island/Location :\u001B[0m           *        *     |");
        System.out.println(
                "                                                                                     |                               **********     |");
        System.out.println(
                "                                                                                     |                                              |");
        System.out.println(
                "                                                                                     |\u001B[32m   indicates your :\u001B[0m           You're here!    |");
        System.out.println(
                "                                                                                     |\u001B[32m   current position\u001B[0m                           |");
        System.out.println(
                "                                                                                     |                                              |");
        System.out.println(
                "                                                                                     |\u001B[36m        Paths :\u001B[0m                   ---         |");
        System.out.println(
                "                                                                                     |                                              |");
        System.out.println(
                "                                                                                     |\u001B[34m       Two way :\u001B[0m           -----------------  |");
        System.out.println(
                "                                                                                     |                                              |");
        System.out.println(
                "                                                                                     |\u001B[35m       One way :\u001B[0m           ------>   <------  |");
        System.out.println(
                "                                                                                     |                                              |");
        System.out.println(
                "                                                                                     |                              ^         |     |");
        System.out.println(
                "                                                                                     |                              |         |     |");
        System.out.println(
                "                                                                                     |                              |         v     |");
        System.out.println(
                "                                                                                     |______________________________________________|");

        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t███╗   ███╗ █████╗ ██████╗ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t████╗ ████║██╔══██╗██╔══██╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██╔████╔██║███████║██████╔╝");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║╚██╔╝██║██╔══██║██╔═══╝ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║ ╚═╝ ██║██║  ██║██║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t╚═╝     ╚═╝╚═╝  ╚═╝╚═╝");
        System.out.println("\n");

    }
}

class MainMap {
    public static void map() {

        String[] islands = { "Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t       \u001B[32mYou're here!\u001B[0m     \t\t\t\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
                        + "      * -----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|");
                System.out.print("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\tv\t\t\t\t\t\t\t\t\t|\n");

            } else if (i == 1) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Autumvale
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i == 3) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Kindlewood
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i % 2 == 0) {
                if (i == 2) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Frostpeak
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                } else if (i == 4) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Aquaville
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t             *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                }
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|"); // Celestial
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i] + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");

            }
        }
    }
}

class updatedMap {
    public static void Autumnvale() { // AUTUMNVALE
        String[] islands = { "Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
                        + "      * -----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|");
                System.out.print("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\tv\t\t\t\t\t\t\t\t\t|\n");

            } else if (i == 1) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Autumvale
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t    \u001B[32mYou're here!\u001B[0m     *     " + islands[i]
                        + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i == 3) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Kindlewood
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i % 2 == 0) {
                if (i == 2) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Frostpeak
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                } else if (i == 4) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Aquaville
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t             *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                }
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|"); // Celestial Shores
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i] + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");

            }
        }
    }

    public static void Frostpeak() {
        String[] islands = { "Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
                        + "      * -----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|");
                System.out.print("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\tv\t\t\t\t\t\t\t\t\t|\n");

            } else if (i == 1) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Autumvale
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i == 3) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Kindlewood
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i % 2 == 0) {
                if (i == 2) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Frostpeak
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i]
                            + "      *    \u001B[32mYou're here!\u001B[0m");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                } else if (i == 4) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Aquaville
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t             *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                }
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|"); // Celestial
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i] + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");

            }
        }
    }

    public static void Kindlewood() {
        String[] islands = { "Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
                        + "      * -----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|");
                System.out.print("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\tv\t\t\t\t\t\t\t\t\t|\n");

            } else if (i == 1) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Autumvale
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i == 3) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Kindlewood
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t    \u001B[32mYou're here!\u001B[0m     *     " + islands[i]
                        + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i % 2 == 0) {
                if (i == 2) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Frostpeak
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                } else if (i == 4) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Aquaville
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t             *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                }
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|"); // Celestial
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i] + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");

            }
        }
    }

    public static void Aquaville() {
        String[] islands = { "Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
                        + "      * -----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|");
                System.out.print("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\tv\t\t\t\t\t\t\t\t\t|\n");

            } else if (i == 1) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Autumvale
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i == 3) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Kindlewood
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i % 2 == 0) {
                if (i == 2) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Frostpeak
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                } else if (i == 4) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Aquaville
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i]
                            + "      *    \u001B[32mYou're here!\u001B[0m");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t             *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                }
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|"); // Celestial
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i] + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");

            }
        }
    }

    public static void CelestialShores() {
        String[] islands = { "Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
                        + "      * -----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|");
                System.out.print("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\tv\t\t\t\t\t\t\t\t\t|\n");

            } else if (i == 1) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Autumvale
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i == 3) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Kindlewood
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i % 2 == 0) {
                if (i == 2) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Frostpeak
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                } else if (i == 4) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Aquaville
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t             *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                }
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|"); // Celestial
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i] + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t   \u001B[32mMission Successful!\u001B[0m     \t\t\t\n");

            }
        }
    }
}

class Routes {
    public String[] routesImberCove(int islandIndex1) { // from Imber Cove
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
        // Define and return possible routes based on the island index
        String[][] allRoutes2 = {
                { "Autumnvale ---> Frostpeak", "Autumnvale ---> Kindlewood ---> Aquaville ---> Frostpeak" },
                { "Autumnvale ---> Kindlewood", "Autumnvale ---> Frostpeak ---> Aquaville ---> Kindlewood" },
                { "Autumnvale ---> Frostpeak ---> Aquaville", "Autumnvale ---> Kindlewood ---> Aquaville" },
        };
        return allRoutes2[islandIndex2 - 1];
    }

    public static String[] routesFrostpeak(int islandIndex3) { // from Frostpeak
        // Define and return possible routes based on the island index
        String[][] allRoutes3 = {
                { "Frostpeak ---> Autumnvale", "Frostpeak ---> Aquaville ---> Kindlewood ---> Autumnvale" },
                { "Frostpeak ---> Autumnvale ---> Kindlewood", "Frostpeak ---> Aquaville ---> Kindlewood" },
                { "Frostpeak ---> Aquaville", "Frostpeak ---> Autumnvale ---> Kindlewood ---> Aquaville" },
        };
        return allRoutes3[islandIndex3 - 1];
    }

    public static String[] routesKindlewood(int islandIndex4) { // from Kindlewood
        // Define and return possible routes based on the island index
        String[][] allRoutes4 = {
                { "Kindlewood ---> Autumnvale", "Kindlewood ---> Aquaville ---> Frostpeak ---> Autumnvale" },
                { "Kindlewood ---> Autumnvale ---> Frostpeak", "Kindlewood ---> Aquaville ---> Frostpeak" },
                { "Kindlewood ---> Aquaville", "Kindlewood ---> Autumnvale ---> Frostpeak ---> Aquaville" },
        };
        return allRoutes4[islandIndex4 - 1];
    }

    public static String[] routesAquaville(int islandIndex5) { // from Aquaville
        // Define and return possible routes based on the island index
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
                "\n\u001B[92m* What is the capital of France? *\n\u001B[0m",
                "\n\u001B[92m* Who wrote Romeo and Juliet? *\n\u001B[0m",
                "\n\u001B[92m* What is the boiling point of water in Celsius? *\n\u001B[0m",
                "\n\u001B[92m* Which country is known as the Land of the Rising Sun? *\n\u001B[0m",
                "\n\u001B[92m* Which planet is known as the Red Planet? *\n\u001B[0m",
                "\n\u001B[92m* What do we call the pattern of stars that people imagine in the sky? *\n\u001B[0m",
                "\n\u001B[92m* On what continent would you find the worlds largest desert? *\n\u001B[0m",
                "\n\u001B[92m* Who was the first Disney princess? *\n\u001B[0m",
                "\n\u001B[92m* Who is known as the Father of Modern Physics? *\n\u001B[0m",
                "\n\u001B[92m* Who painted the famous artwork The Last Supper? *\n\u001B[0m",
                "\n\u001B[92m* What is the name of the little mermaid in the Disney movie? *\n\u001B[0m",
                "\n\u001B[92m* What animal is known for its long neck and spots on its body? *\n\u001B[0m",
                "\n\u001B[92m* In what season do leaves fall off the trees? *\n\u001B[0m",
                "\n\u001B[92m* What animal is known for its ability to change color to match its surroundings? *\n\u001B[0m",
                "\n\u001B[92m* In what fairy tale does a pumpkin turn into a carriage? *\n\u001B[0m",
                "\n\u001B[92m* What is the main color of the Smurfs? *\n\u001B[0m",
                "\n\u001B[92m* In the nursery rhyme, who had a farm with a dog named BINGO? *\n\u001B[0m",
                "\n\u001B[92m* Which bird can repeat words and phrases that it hears, often kept as a pet? *\n\u001B[0m",
                "\n\u001B[92m* Google Chrome, Safari, Firefox, and Explorer are different types of what? *\n\u001B[0m",
                "\n\u001B[92m* What part of the atom has no electric charge? *\n\u001B[0m",
                "\n\u001B[92m* What is the symbol for potassium? *\n\u001B[0m",
                "\n\u001B[92m* What is meteorology the study of? *\n\u001B[0m",
                "\n\u001B[92m* Which planet is the hottest in the solar system? *\n\u001B[0m",
                "\n\u001B[92m* Which natural disaster is measured with a Richter scale? *\n\u001B[0m",
                "\n\u001B[92m* What animals are pearls found in? *\n\u001B[0m",
                "\n\u001B[92m* Which planet has the most gravity? *\n\u001B[0m",
                "\n\u001B[92m* What was the name of the actor who played Jack Dawson in Titanic? *\n\u001B[0m",
                "\n\u001B[92m* Which cartoon character lives in a pineapple under the sea? *\n\u001B[0m",
                "\n\u001B[92m* Which popular soft drink was originally created as a medicine in the 19th century? *\n\u001B[0m",
                "\n\u001B[92m* What goes up and down but does not move? *\n\u001B[0m",
                "\n\u001B[92m* What has one eye, but cannot see? *\n\u001B[0m",
                "\n\u001B[92m* What building has the most stories? *\n\u001B[0m",
                "\n\u001B[92m* I am the beginning of everything, the end of everywhere. I'm the beginning of eternity, the end of time and space. What am I? *\n\u001B[0m",
                "\n\u001B[92m* What can fill a room but takes up no space? *\n\u001B[0m",
                "\n\u001B[92m* What kind of tree can you carry in your hand? *\n\u001B[0m",
                "\n\u001B[92m* They come out at night without being called, and are lost in the day without being stolen. What are they? *\n\u001B[0m",
                "\n\u001B[92m* What goes through cities and fields, but never moves? *\n\u001B[0m",
                "\n\u001B[92m* When it is alive we sing, when it is dead we clap ourhands. What is it? *\n\u001B[0m",
                "\n\u001B[92m* I have no life, but I can die. What am I? *\n\u001B[0m",
                "\n\u001B[92m* What kind of room has no walls, door or windows? *\n\u001B[0m",
                "\n\u001B[92m* I make a loud sound when I am changing. When I do change, I get bigger but weigh less. What am I? *\n\u001B[0m",
                "\n\u001B[92m* It has keys, but no locks. It has space, but no room. You can enter, but cannot go inside. What is it? *\n\u001B[0m",
                "\n\u001B[92m* I am orange, I wear a green hat and I sound like a parrot. What am I? *\n\u001B[0m",
                "\n\u001B[92m* What thrives when you feed it but dies when you water it? *\n\u001B[0m",
                "\n\u001B[92m* What has 13 hearts but no other organs? *\n\u001B[0m",
                "\n\u001B[92m* What kind of ship has two mates but no captain? *\n\u001B[0m",
                "\n\u001B[92m* Which word in the dictionary is spelled incorrectly? *\n\u001B[0m",
                "\n\u001B[92m* What begins with letter e and only contains one letter? *\n\u001B[0m",
                "\n\u001B[92m* Which fish costs the most? *\n\u001B[0m",
                "\n\u001B[92m* What five-letter word becomes shorter when you add two letters to it? *\n\u001B[0m",
                "\n\u001B[92m* What has a face and two hands but no arms or legs? *\n\u001B[0m",
                "\n\u001B[92m* What has many keys but cannot open a single lock? *\n\u001B[0m",
                "\n\u001B[92m* What is always found on the ground but never gets dirty? *\n\u001B[0m",
                "\n\u001B[92m* What gets wet while drying? *\n\u001B[0m",
                "\n\u001B[92m* What has a head and a tail but no body? *\n\u001B[0m",
                "\n\u001B[92m* What is full of holes but still holds water? *\n\u001B[0m",
                "\n\u001B[92m* What has many teeth but cannot bite? *\n\u001B[0m",
                "\n\u001B[92m* What has one head, one foot, and four legs? *\n\u001B[0m",
                "\n\u001B[92m* What is always running but never gets hot? *\n\u001B[0m",
        };

        String[] defaultAnswers = { "PARIS", "WILLIAM SHAKESPEARE", "100", "JAPAN", "MARS", "CONSTELLATION",
                "ANTARCTICA", "SNOW WHITE", "ALBERT EINSTEIN", "LEONARDO DA VINCI", "ARIEL", "GIRAFFE", "AUTUMN",
                "CHAMELEON", "CINDERELLA", "BLUE", "OLD MACDONALD", "PARROT", "WEB BROWSERS", "NEUTRON", "K", "WEATHER",
                "VENUS", "EARTHQUAKES", "OYSTERS", "JUPITER", "LEONARDO DICAPRIO", "SPONGEBOB SQUAREPANTS", "COCA-COLA",
                "STAIRCASE", "NEEDLE", "LIBRARY", "E", "LIGHT", "PALM", "STARS", "ROAD", "BIRTHDAY CANDLE", "BATTERY",
                "MUSHROOM", "POPCORN", "KEYBOARD", "CARROT", "FIRE", "DECK OF CARDS", "RELATIONSHIP", "INCORRECTLY",
                "ENVELOPE", "GOLDFISH", "SHORT", "CLOCK", "PIANO", "SHADOW", "TOWEL", "COIN", "SPONGE", "COMB", "BED",
                "REFRIGERATOR",
        };

        this.scan = new Scanner(System.in);
        this.random = new Random();
        this.questions = defaultQuestions;
        this.answers = defaultAnswers;

    }

    public String getRandomQuestion() {
        int index = random.nextInt(questions.length);
        return questions[index];
    }

    public boolean checkAnswer(String userAnswer, int questionIndex) {
        return userAnswer.equals(answers[questionIndex]);
    }

    public void startTimer(int seconds) {
        timerThread = new Thread(() -> {
            for (int i = seconds; i >= 0; i--) {
                System.out.print("\r\u001B[31m" + i + " seconds \u001B[0m");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("\n");
                    return;
                }
            }
            System.out.println("\r\u001B[31mTime's up!\u001B[0m");
            // System.exit(0);
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

public class GuardianOfArchipelago {
    static Random random = new Random();
    static Scanner scan = new Scanner(System.in);
    private static final int METERS_PER_MINUTE = 1;
    private static final int MINUTES_PER_HOUR = 60;
    private static ShownRoutes ShownRoutes = new ShownRoutes();
    private static int chosenRoutes;
    private static int chosenRoutes2A;
    private static int chosenRoutes2B;
    private static int chosenRoutes2C;
    private static int chosenRoutes2D;
    private static int chosenRoutes2E;
    private static int chosenRoutes2F;
    private static int chosenRoutes2G;
    private static int chosenRoutes2I;
    private static int chosenRoutes3A;
    private static int chosenRoutes3B;
    private static int chosenRoutes3C;
    private static int chosenRoutes3D;
    private static int chosenRoutes3E;
    private static int chosenRoutes3F;
    private static int chosenRoutes3G;
    private static int chosenRoutes3H;
    private static int chosenRoutes4A;
    private static int chosenRoutes4B;
    private static int chosenRoutes4C;
    private static int chosenRoutes4D;
    private static int chosenRoutes4E;
    private static int chosenRoutes4F;
    private static int chosenRoutes4G;
    private static int chosenRoutes5A;
    private static int chosenRoutes5B;
    private static int chosenRoutes5C;
    private static int chosenRoutes5D;
    private static int chosenRoutes5E;
    private static int chosenRoutes5F;

    // private static boolean continueProgram2;
    // private static Routes ShownRoutes = new Routes();

    public static void main(String[] args) {
        banner.generateMAPBanner();
        Introduction();

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.print("\n\u001B[92mDo you want to continue?\u001B[0m\n(1) Yes\n(2) No \n");
            System.out.print("\nEnter your choice: ");

            if (scan.hasNextInt()) {
                int YN = scan.nextInt();
                switch (YN) {
                    case 1:
                        continueProgram = false;
                        mapwithlegend.map();
                        MainMap.map();
                        checkList();
                        Islands();
                        updatedMap.CelestialShores();

                        break;
                    case 2:
                        System.out.print(
                                "\n\u001B[92mAre you sure you want to end the game?\u001B[0m\n(1) Yes\n(2) No\nEnter your choice: ");
                        if (scan.hasNextInt()) {
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
                                    System.out.println(
                                            "Invalid input. Enter the numbers that are listed in the option only.");
                            }
                        } else {
                            System.out.println("Invalid input. Enter a valid integer.");
                            scan.next(); // Consume the invalid input
                        }
                        break;
                    default:
                        System.out.println("Invalid input. Enter the numbers that are listed in the option only.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Enter 1 or 2 only.");
                scan.next(); // Consume the invalid input
            }
        }
        scan.close();
    }

    public static int displayRoutes(int islandIndex1) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesImberCove(islandIndex1);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes = scan.nextInt();

                // Validate user input
                if (chosenRoutes < 1 || chosenRoutes > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes < 1 || chosenRoutes > numRoutes);

        System.out.println(
                "\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes + ") " + distances[chosenRoutes - 1]
                        + " meters - " + routesArray[chosenRoutes - 1]);
        calculateTimeTravel(distances[chosenRoutes - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes;
    }

    public static int displayRoutes2A(int islandIndex2) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAutumnvale(islandIndex2);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes2A;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes2A = scan.nextInt();

                // Validate user input
                if (chosenRoutes2A < 1 || chosenRoutes2A > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes2A = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes2A < 1 || chosenRoutes2A > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m (" + chosenRoutes2A + ") "
                + distances[chosenRoutes2A - 1]
                + " meters - " + routesArray[chosenRoutes2A - 1]);
        calculateTimeTravel(distances[chosenRoutes2A - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes2A;
    }

    public static int displayRoutes2B(int islandIndex3) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesFrostpeak(islandIndex3);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes2B;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes2B = scan.nextInt();

                // Validate user input
                if (chosenRoutes2B < 1 || chosenRoutes2B > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes2B = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes2B < 1 || chosenRoutes2B > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes2B + ") "
                + distances[chosenRoutes2B - 1]
                + " meters - " + routesArray[chosenRoutes2B - 1]);
        calculateTimeTravel(distances[chosenRoutes2B - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes2B;
    }

    public static int displayRoutes2C(int islandIndex3) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesFrostpeak(islandIndex3);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes2C;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes2C = scan.nextInt();

                // Validate user input
                if (chosenRoutes2C < 1 || chosenRoutes2C > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes2C = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes2C < 1 || chosenRoutes2C > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes2C + ") "
                + distances[chosenRoutes2C - 1]
                + " meters - " + routesArray[chosenRoutes2C - 1]);
        calculateTimeTravel(distances[chosenRoutes2C - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes2C;
    }

    public static int displayRoutes2D(int islandIndex3) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesKindlewood(islandIndex3);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes2D;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes2D = scan.nextInt();

                // Validate user input
                if (chosenRoutes2D < 1 || chosenRoutes2D > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes2D = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes2D < 1 || chosenRoutes2D > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes2D + ") "
                + distances[chosenRoutes2D - 1]
                + " meters - " + routesArray[chosenRoutes2D - 1]);
        calculateTimeTravel(distances[chosenRoutes2D - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes2D;
    }

    public static int displayRoutes2E(int islandIndex4) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesKindlewood(islandIndex4);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes2E;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes2E = scan.nextInt();

                // Validate user input
                if (chosenRoutes2E < 1 || chosenRoutes2E > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes2E = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes2E < 1 || chosenRoutes2E > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes2E + ") "
                + distances[chosenRoutes2E - 1]
                + " meters - " + routesArray[chosenRoutes2E - 1]);
        calculateTimeTravel(distances[chosenRoutes2E - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes2E;
    }

    public static int displayRoutes2F(int islandIndex4) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAquaville(islandIndex4);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes2F;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes2F = scan.nextInt();

                // Validate user input
                if (chosenRoutes2F < 1 || chosenRoutes2F > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes2F = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes2F < 1 || chosenRoutes2F > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes2F + ") "
                + distances[chosenRoutes2F - 1]
                + " meters - " + routesArray[chosenRoutes2F - 1]);
        calculateTimeTravel(distances[chosenRoutes2F - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes2F;
    }

    public static int displayRoutes2G(int islandIndex4) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAquaville(islandIndex4);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes2G;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes2G = scan.nextInt();

                // Validate user input
                if (chosenRoutes2G < 1 || chosenRoutes2G > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes2G = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes2G < 1 || chosenRoutes2G > numRoutes);

        System.out.println("\n\u001B[32m\"The route you choose is:\u001B[0m (" + chosenRoutes2G + ") "
                + distances[chosenRoutes2G - 1]
                + " meters - " + routesArray[chosenRoutes2G - 1]);
        calculateTimeTravel(distances[chosenRoutes2G - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes2G;
    }

    public static int displayRoutes2I(int islandIndex4) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAquaville(islandIndex4);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes2I;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes2I = scan.nextInt();

                // Validate user input
                if (chosenRoutes2I < 1 || chosenRoutes2I > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes2I = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes2I < 1 || chosenRoutes2I > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes2I + ") "
                + distances[chosenRoutes2I - 1]
                + " meters - " + routesArray[chosenRoutes2I - 1]);
        calculateTimeTravel(distances[chosenRoutes2I - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes2I;
    }

    public static int displayRoutes3A(int islandIndex3) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesFrostpeak(islandIndex3);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes3A;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes3A = scan.nextInt();

                // Validate user input
                if (chosenRoutes3A < 1 || chosenRoutes3A > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes3A = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes3A < 1 || chosenRoutes3A > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes3A + ") "
                + distances[chosenRoutes3A - 1]
                + " meters - " + routesArray[chosenRoutes3A - 1]);
        calculateTimeTravel(distances[chosenRoutes3A - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes3A;
    }

    public static int displayRoutes3B(int islandIndex2) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAutumnvale(islandIndex2);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes3B;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes3B = scan.nextInt();

                // Validate user input
                if (chosenRoutes3B < 1 || chosenRoutes3B > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes3B = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes3B < 1 || chosenRoutes3B > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes3B + ") "
                + distances[chosenRoutes3B - 1]
                + " meters - " + routesArray[chosenRoutes3B - 1]);
        calculateTimeTravel(distances[chosenRoutes3B - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes3B;
    }

    public static int displayRoutes3C(int islandIndex4) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesKindlewood(islandIndex4);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out.println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                + distances[shortestRouteIndex]
                + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes3C;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes3C = scan.nextInt();

                // Validate user input
                if (chosenRoutes3C < 1 || chosenRoutes3C > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes3C = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes3C < 1 || chosenRoutes3C > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes3C + ") "
                + distances[chosenRoutes3C - 1]
                + " meters - " + routesArray[chosenRoutes3C - 1]);
        calculateTimeTravel(distances[chosenRoutes3C - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes3C;
    }

    public static int displayRoutes3D(int islandIndex4) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesKindlewood(islandIndex4);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes3D;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes3D = scan.nextInt();

                // Validate user input
                if (chosenRoutes3D < 1 || chosenRoutes3B > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes3D = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes3D < 1 || chosenRoutes3D > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes3D + ") "
                + distances[chosenRoutes3D - 1]
                + " meters - " + routesArray[chosenRoutes3D - 1]);
        calculateTimeTravel(distances[chosenRoutes3D - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes3D;
    }

    public static int displayRoutes3E(int islandIndex5) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAquaville(islandIndex5);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes3E;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes3E = scan.nextInt();

                // Validate user input
                if (chosenRoutes3E < 1 || chosenRoutes3D > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes3E = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes3E < 1 || chosenRoutes3E > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes3E + ") "
                + distances[chosenRoutes3E - 1]
                + " meters - " + routesArray[chosenRoutes3E - 1]);
        calculateTimeTravel(distances[chosenRoutes3E - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes3E;
    }

    public static int displayRoutes3F(int islandIndex5) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAquaville(islandIndex5);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes3F;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes3F = scan.nextInt();

                // Validate user input
                if (chosenRoutes3F < 1 || chosenRoutes3F > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes3F = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes3F < 1 || chosenRoutes3F > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes3F + ") "
                + distances[chosenRoutes3F - 1]
                + " meters - " + routesArray[chosenRoutes3F - 1]);
        calculateTimeTravel(distances[chosenRoutes3F - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes3F;
    }

    public static int displayRoutes3G(int islandIndex2) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAutumnvale(islandIndex2);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out.println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                + distances[shortestRouteIndex]
                + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes3G;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes3G = scan.nextInt();

                // Validate user input
                if (chosenRoutes3G < 1 || chosenRoutes3G > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes3G = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes3G < 1 || chosenRoutes3G > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes3G + ") "
                + distances[chosenRoutes3G - 1]
                + " meters - " + routesArray[chosenRoutes3G - 1]);
        calculateTimeTravel(distances[chosenRoutes3G - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes3G;
    }

    public static int displayRoutes3H(int islandIndex2) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAutumnvale(islandIndex2);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out.println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                + distances[shortestRouteIndex]
                + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes3H;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes3H = scan.nextInt();

                // Validate user input
                if (chosenRoutes3H < 1 || chosenRoutes3H > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes3H = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes3H < 1 || chosenRoutes3H > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes3H + ") "
                + distances[chosenRoutes3H - 1]
                + " meters - " + routesArray[chosenRoutes3H - 1]);
        calculateTimeTravel(distances[chosenRoutes3H - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes3H;
    }

    public static int displayRoutes4A(int islandIndex4) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesKindlewood(islandIndex4);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes4A;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes4A = scan.nextInt();

                // Validate user input
                if (chosenRoutes4A < 1 || chosenRoutes4A > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes4A = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes4A < 1 || chosenRoutes4A > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes4A + ") "
                + distances[chosenRoutes4A - 1]
                + " meters - " + routesArray[chosenRoutes4A - 1]);
        calculateTimeTravel(distances[chosenRoutes4A - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes4A;
    }

    public static int displayRoutes4B(int islandIndex2) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAutumnvale(islandIndex2);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes4B;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes4B = scan.nextInt();

                // Validate user input
                if (chosenRoutes4B < 1 || chosenRoutes4B > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes4B = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes4B < 1 || chosenRoutes4B > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes4B + ") "
                + distances[chosenRoutes4B - 1]
                + " meters - " + routesArray[chosenRoutes4B - 1]);
        calculateTimeTravel(distances[chosenRoutes4B - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes4B;
    }

    public static int displayRoutes4C(int islandIndex3) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesFrostpeak(islandIndex3);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex] + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");
        // Get the user's choice of route
        int chosenRoutes4C;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes4C = scan.nextInt();

                // Validate user input
                if (chosenRoutes4C < 1 || chosenRoutes4C > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes4C = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes4C < 1 || chosenRoutes4C > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes4C + ") "
                + distances[chosenRoutes4C - 1]
                + " meters - " + routesArray[chosenRoutes4C - 1]);
        calculateTimeTravel(distances[chosenRoutes4C - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes4C;
    }

    public static int displayRoutes4D(int islandIndex3) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesFrostpeak(islandIndex3);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes4D;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes4D = scan.nextInt();

                // Validate user input
                if (chosenRoutes4D < 1 || chosenRoutes4D > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes4D = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes4D < 1 || chosenRoutes4D > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes4D + ") "
                + distances[chosenRoutes4D - 1]
                + " meters - " + routesArray[chosenRoutes4D - 1]);
        calculateTimeTravel(distances[chosenRoutes4D - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes4D;
    }

    public static int displayRoutes4E(int islandIndex3) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAquaville(islandIndex3);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes4E;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes4E = scan.nextInt();

                // Validate user input
                if (chosenRoutes4E < 1 || chosenRoutes4E > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes4E = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes4E < 1 || chosenRoutes4E > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes4E + ") "
                + distances[chosenRoutes4E - 1]
                + " meters - " + routesArray[chosenRoutes4E - 1]);
        calculateTimeTravel(distances[chosenRoutes4E - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes4E;
    }

    public static int displayRoutes4F(int islandIndex2) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAutumnvale(islandIndex2);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes4F;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes4F = scan.nextInt();

                // Validate user input
                if (chosenRoutes4F < 1 || chosenRoutes4F > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes4F = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes4F < 1 || chosenRoutes4F > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes4F + ") "
                + distances[chosenRoutes4F - 1]
                + " meters - " + routesArray[chosenRoutes4F - 1]);
        calculateTimeTravel(distances[chosenRoutes4F - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes4F;
    }

    public static int displayRoutes4G(int islandIndex3) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesFrostpeak(islandIndex3);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes4G;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes4G = scan.nextInt();

                // Validate user input
                if (chosenRoutes4G < 1 || chosenRoutes4G > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes4G = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes4G < 1 || chosenRoutes4G > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes4G + ") "
                + distances[chosenRoutes4G - 1]
                + " meters - " + routesArray[chosenRoutes4G - 1]);
        calculateTimeTravel(distances[chosenRoutes4G - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes4G;
    }

    public static int displayRoutes5A(int islandIndex5) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAquaville(islandIndex5);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes5A;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes5A = scan.nextInt();

                // Validate user input
                if (chosenRoutes5A < 1 || chosenRoutes5A > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes5A = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes5A < 1 || chosenRoutes5A > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes5A + ") "
                + distances[chosenRoutes5A - 1]
                + " meters - " + routesArray[chosenRoutes5A - 1]);
        calculateTimeTravel(distances[chosenRoutes5A - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes5A;
    }

    public static int displayRoutes5B(int islandIndex2) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesAutumnvale(islandIndex2);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes5B;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes5B = scan.nextInt();

                // Validate user input
                if (chosenRoutes5B < 1 || chosenRoutes5B > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes5B = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes5B < 1 || chosenRoutes5B > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is: \u001B[0m(" + chosenRoutes5B + ") "
                + distances[chosenRoutes5B - 1]
                + " meters - " + routesArray[chosenRoutes5B - 1]);
        calculateTimeTravel(distances[chosenRoutes5B - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes5B;
    }

    public static int displayRoutes5C(int islandIndex3) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesFrostpeak(islandIndex3);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out
                .println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                        + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");
        // Get the user's choice of route
        int chosenRoutes5C;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes5C = scan.nextInt();

                // Validate user input
                if (chosenRoutes5C < 1 || chosenRoutes5C > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes5C = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes5C < 1 || chosenRoutes5C > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes5C + ") "
                + distances[chosenRoutes5C - 1]
                + " meters - " + routesArray[chosenRoutes5C - 1]);
        calculateTimeTravel(distances[chosenRoutes5C - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes5C;
    }

    public static int displayRoutes5D(int islandIndex4) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesKindlewood(islandIndex4);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out.println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                + distances[shortestRouteIndex]
                + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes5D;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes5D = scan.nextInt();

                // Validate user input
                if (chosenRoutes5D < 1 || chosenRoutes5D > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes5D = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes5D < 1 || chosenRoutes5D > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes5D + ") "
                + distances[chosenRoutes5D - 1]
                + " meters - " + routesArray[chosenRoutes5D - 1]);
        calculateTimeTravel(distances[chosenRoutes5D - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes5D;
    }

    public static int displayRoutes5E(int islandIndex3) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesFrostpeak(islandIndex3);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out.println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                + distances[shortestRouteIndex]
                + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes5E;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes5E = scan.nextInt();

                // Validate user input
                if (chosenRoutes5E < 1 || chosenRoutes5E > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes5E = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes5E < 1 || chosenRoutes5E > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes5E + ") "
                + distances[chosenRoutes5E - 1]
                + " meters - " + routesArray[chosenRoutes5E - 1]);
        calculateTimeTravel(distances[chosenRoutes5E - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes5E;
    }

    public static int displayRoutes5F(int islandIndex4) {
        Routes Routes = new Routes();

        System.out.println("\n\u001B[33mPossible routes from your current location:\u001B[0m");
        String[] routesArray = Routes.routesKindlewood(islandIndex4);
        int numRoutes = routesArray.length;

        int[] distances = new int[numRoutes];

        // Generate distances based on index with increasing values
        for (int i = 0; i < numRoutes; i++) {
            distances[i] = random.nextInt(81) + 10; // Distance range: 10-90 km, increasing with index
        }

        // Sort distances array to ensure increasing order
        Arrays.sort(distances);

        // Display routes with corresponding distances
        for (int i = 0; i < numRoutes; i++) {
            System.out.println("(" + (i + 1) + ") " + distances[i] + " meters - " + routesArray[i]);
        }

        // Find the shortest route index
        int shortestRouteIndex = 0;
        for (int i = 1; i < numRoutes; i++) {
            if (distances[i] < distances[shortestRouteIndex]) {
                shortestRouteIndex = i;
            }
        }

        // Display the shortest route
        System.out.println("\u001B[36mShortest Route: (" + (shortestRouteIndex + 1) + ") Distance: "
                + distances[shortestRouteIndex]
                + " meters - " + routesArray[shortestRouteIndex] + "\u001B[0m");

        // Get the user's choice of route
        int chosenRoutes5F;
        do {
            System.out.print("\nEnter the number of the route you want to take from the options: ");

            if (scan.hasNextInt()) {
                chosenRoutes5F = scan.nextInt();

                // Validate user input
                if (chosenRoutes5F < 1 || chosenRoutes5F > numRoutes) {
                    System.out.println("Invalid input.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input
                chosenRoutes5F = -1; // Set chosenRoute to an invalid value to continue the loop
            }
        } while (chosenRoutes5F < 1 || chosenRoutes5F > numRoutes);

        System.out.println("\n\u001B[32mThe route you choose is:\u001B[0m (" + chosenRoutes5F + ") "
                + distances[chosenRoutes5F - 1]
                + " meters - " + routesArray[chosenRoutes5F - 1]);
        calculateTimeTravel(distances[chosenRoutes5F - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes5F;
    }

    private static void calculateTimeTravel(int distance) {
        int totalMinutes = distance / METERS_PER_MINUTE;
        int hour = totalMinutes / MINUTES_PER_HOUR;
        int minutes = totalMinutes % MINUTES_PER_HOUR;

        System.out
                .println("\u001B[32mTime of travel: \u001B[0m " + formatTime(hour) + " " + formatPlural(hour, "hour") +
                        " " + formatTime(minutes) + " " + formatPlural(minutes, "minutes"));
    }

    private static String formatTime(int time) {
        return time < 10 ? "0" + time : String.valueOf(time);
    }

    private static String formatPlural(int value, String unit) {
        return value == 1 ? unit : unit;
    }

    public boolean onBoat() {
        System.out.println("\nThe boat where you are started sailing...");
        System.out.println("\n\u001B[31mWARNING: You will encounter an obstacle!\u001B[0m");

        QuizGame quizGame = new QuizGame();
        scan.nextLine();

        String question = quizGame.getRandomQuestion();
        System.out.println("\nYou have 30 seconds to answer the question.");

        for (int live = 1; live <= 3; live++) {
            quizGame.startTimer(30);

            System.out.println(question);
            int questionIndex = Arrays.asList(quizGame.getQuestions()).indexOf(question);
            String userAnswer = scan.nextLine().toUpperCase();

            // Stop the timer thread when the user enters an answer
            quizGame.stopTimer();

            if (questionIndex >= 0 && questionIndex < quizGame.getAnswers().length) {
                if (quizGame.checkAnswer(userAnswer, questionIndex)) {
                    System.out.println("Correct answer is: " + quizGame.getAnswers()[questionIndex]);
                    System.out.println("\u001B[32mYour answer is : \u001B[0m" + userAnswer);
                    System.out.println("\u001B[36mCORRECT!\u001B[0m");
                    break; // Exit the method if the answer is correct
                } else {

                    if (live == 3) {
                        System.out.print("Your answer is : " + userAnswer);
                        System.out.println("\n\n\u001B[31mMission Failed! Your adventure ends here.\u001B[0m\n");
                        System.exit(0);
                    } else {
                        System.out.println("Correct answer is: " + quizGame.getAnswers()[questionIndex]);
                        System.out.println("\u001B[31mTry again!\u001B[0m\n");
                        System.out.print("You have " + (3 - live) + " live/s left. ");
                    }
                }
            } else {
                System.out.println("Invalid question index.");
            }
        }
        return false;
    }

    public static void Introduction() {
        System.out.println("\u001B[33mMISSIONS TO ACCOMPLISH:\u001B[0m");
        System.out.println(" * Save all the stranded tourists who scattered in different islands");
        System.out.println(" * Overcome the obstacles by answering the random general questions and riddles");
        System.out.println(" * Bring the tourists back home (Celestial Shores)");
    }

    public static void checkList() {
        System.out.println("\n\n");
        System.out.println(
                "\u001B[33mCHECKLIST:\u001B[0m\n( ) Autumnvale\n( ) Frostpeak\n( ) Kindlewood\n( ) Aquaville");
    }

    public static void Islands() {
        String[] location = { "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville" };
        Destination(location);
    }

    public static void Destination(String[] locations) {
        int choice = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mISLANDS:\u001B[0m\n(1) Autumnvale\n(2) Frostpeak\n(3) Kindlewood\n(4) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice = scan.nextInt();

                if (choice >= 1 && choice <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);

        if (choice >= 1 && choice <= locations.length) {
            switch (choice) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice - 1] + ".\u001B[0m"); // autumnvale
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
                    chosenRoutes = displayRoutes(1);
                    switch (chosenRoutes) {
                        case 1:
                            ShownRoutes.ImberCovetoAutumnvale(1);
                            break;
                        case 2:

                            ShownRoutes.ImberCovetoAutumnvale(2);
                            break;
                        case 3:
                            ShownRoutes.ImberCovetoAutumnvale(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n( ) Kindlewood\n( ) Aquaville");
                    Destination2A(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice - 1] + ".\u001B[0m"); // frostpeak
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m An island of ice and snow. Frostpeak is the territory of wolves which has a keen sense of smell, hearing, and vision.\n");
                    chosenRoutes = displayRoutes(2);
                    switch (chosenRoutes) {
                        case 1:
                            ShownRoutes.ImberCovetoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.ImberCovetoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.ImberCovetoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n( ) Aquaville");
                    Destination3A(locations);
                    // continueProgram2 = false;
                    break;
                case 3:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice - 1] + ".\u001B[0m"); // kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes = displayRoutes(3);
                    switch (chosenRoutes) {
                        case 1:
                            ShownRoutes.ImberCovetoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.ImberCovetoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.ImberCovetoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                    Destination4A(locations);
                    // continueProgram2 = false;

                    break;
                case 4:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice - 1] + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes = displayRoutes(4);
                    switch (chosenRoutes) {
                        case 1:
                            ShownRoutes.ImberCovetoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.ImberCovetoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.ImberCovetoAquaville(3);
                            break;
                        default:
                            // continueProgram2 = true;
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n( ) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                    Destination5A(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination2A(String[] locations) {
        int choice2A = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Frostpeak\n(2) Kindlewood\n(3) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice2A = scan.nextInt();

                if (choice2A >= 1 && choice2A <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice2A >= 1 && choice2A <= locations.length) {
            switch (choice2A) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2A] + ".\u001B[0m"); // frostpeak
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m An island of ice and snow. Frostpeak is the territory of wolves which has a keen sense of smell, hearing, and vision.\n");

                    chosenRoutes2A = displayRoutes2A(1);
                    switch (chosenRoutes2A) {
                        case 1:
                            ShownRoutes.AutumnvaletoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n( ) Aquaville");
                    Destination2B(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2A] + ".\u001B[0m"); // kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes2A = displayRoutes2A(2);
                    switch (chosenRoutes2A) {
                        case 1:
                            ShownRoutes.AutumnvaletoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                    Destination2D(locations);
                    // continueProgram2 = false;
                    break;
                case 3:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2A] + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes2A = displayRoutes2A(3);
                    switch (chosenRoutes2A) {
                        case 1:
                            ShownRoutes.AutumnvaletoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                    Destination2G(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination2B(String[] locations) {
        int choice2B = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Kindlewood\n(2) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice2B = scan.nextInt();

                if (choice2B >= 1 && choice2B <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice2B >= 1 && choice2B <= locations.length) {
            switch (choice2B) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2B + 1]
                            + ".\u001B[0m"); // Kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes2B = displayRoutes2B(2);
                    switch (chosenRoutes2B) {
                        case 1:
                            ShownRoutes.FrostpeaktoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                    Destination2E(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2B + 1]
                            + ".\u001B[0m"); // Aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes2B = displayRoutes2B(3);
                    switch (chosenRoutes2B) {
                        case 1:
                            ShownRoutes.FrostpeaktoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                    Destination2F(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination2C(String[] locations) {
        int choice2C = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice2C = scan.nextInt();

                if (choice2C >= 1 && choice2C <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice2C >= 1 && choice2C <= locations.length) {
            switch (choice2C) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2C + 2]
                            + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes2C = displayRoutes2C(3);
                    switch (chosenRoutes2C) {
                        case 1:
                            ShownRoutes.FrostpeaktoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\n\u001B[32mMission Completed! You saved all the tourists!\u001B[0m\n");
                    // continueProgram2 = false
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }
    
    public static void Destination2E(String[] locations) {
        int choice2E = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice2E = scan.nextInt();

                if (choice2E >= 1 && choice2E <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice2E >= 1 && choice2E <= locations.length) {
            switch (choice2E) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2E + 2]
                            + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes2E = displayRoutes2E(3);
                    switch (chosenRoutes2E) {
                        case 1:
                            ShownRoutes.KindlewoodtoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.KindlewoodtoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.KindlewoodtoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\n\u001B[32mMission Completed! You saved all the tourists!\u001B[0m\n");
                    // continueProgram2 = false
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }    

    public static void Destination2D(String[] locations) {
        int choice2D = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Frostpeak\n(2) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice2D = scan.nextInt();

                if (choice2D >= 1 && choice2D <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice2D >= 1 && choice2D <= locations.length) {
            switch (choice2D) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2D] + ".\u001B[0m"); // Kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes2D = displayRoutes2D(2);
                    switch (chosenRoutes2D) {
                        case 1:
                            ShownRoutes.KindlewoodtoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.KindlewoodtoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.KindlewoodtoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                    Destination2C(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2D + 1]
                            + ".\u001B[0m"); // Aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes2D = displayRoutes2D(3);
                    switch (chosenRoutes2D) {
                        case 1:
                            ShownRoutes.KindlewoodtoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.KindlewoodtoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.KindlewoodtoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination2I(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination2F(String[] locations) {
        int choice2F = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Kindlewood\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice2F = scan.nextInt();

                if (choice2F >= 1 && choice2F <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice2F >= 1 && choice2F <= locations.length) {
            switch (choice2F) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2F + 1]
                            + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes2F = displayRoutes2F(3);
                    switch (chosenRoutes2F) {
                        case 1:
                            ShownRoutes.FrostpeaktoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\n\u001B[32mMission Completed! You saved all the tourists!\u001B[0m\n");
                    // continueProgram2 = false
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination2G(String[] locations) {
        int choice2G = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Frostpeak\n(2) Kindlewood\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice2G = scan.nextInt();

                if (choice2G >= 1 && choice2G <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice2G >= 1 && choice2G <= locations.length) {
            switch (choice2G) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2G] + ".\u001B[0m"); // Kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes2G = displayRoutes2G(2);
                    switch (chosenRoutes2G) {
                        case 1:
                            ShownRoutes.FrostpeaktoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                    Destination5C(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2G] + ".\u001B[0m"); // Aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes2G = displayRoutes2G(3);
                    switch (chosenRoutes2G) {
                        case 1:
                            ShownRoutes.FrostpeaktoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination5D(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination2I(String[] locations) {
        int choice2I = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Frostpeak\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice2I = scan.nextInt();

                if (choice2I >= 1 && choice2I <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice2I >= 1 && choice2I <= locations.length) {
            switch (choice2I) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice2I] + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes2I = displayRoutes2I(2);
                    switch (chosenRoutes2I) {
                        case 1:
                            ShownRoutes.AquavilletoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.AquavilletoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.AquavilletoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\n\u001B[32mMission Completed! You saved all the tourists!\u001B[0m\n");
                    // continueProgram2 = false
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination3A(String[] locations) {
        int choice3A = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumnvale\n(2) Kindlewood\n(3) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice3A = scan.nextInt();

                if (choice3A >= 1 && choice3A <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice3A >= 1 && choice3A <= locations.length) {
            switch (choice3A) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3A - 1]
                            + ".\u001B[0m"); // autumnvale
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
                    chosenRoutes3A = displayRoutes3A(1);
                    switch (chosenRoutes3A) {
                        case 1:
                            ShownRoutes.FrostpeaktoAutumnvale(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoAutumnvale(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoAutumnvale(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n( ) Aquaville");
                    Destination3B(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3A] + ".\u001B[0m"); // Kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes3A = displayRoutes3A(2);
                    switch (chosenRoutes3A) {
                        case 1:
                            ShownRoutes.FrostpeaktoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                    Destination3D(locations);
                    // continueProgram2 = false;
                    break;
                case 3:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3A] + ".\u001B[0m"); // Aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes3A = displayRoutes3A(3);
                    switch (chosenRoutes3A) {
                        case 1:
                            ShownRoutes.FrostpeaktoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                    Destination3F(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination3B(String[] locations) {
        int choice3B = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Kindlewood\n(2) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice3B = scan.nextInt();

                if (choice3B >= 1 && choice3B <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice3B >= 1 && choice3B <= locations.length) {
            switch (choice3B) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3B + 1]
                            + ".\u001B[0m"); // kindlewood
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes3B = displayRoutes3B(2);
                    switch (chosenRoutes3B) {
                        case 1:
                            ShownRoutes.AutumnvaletoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                    Destination2E(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3B + 1]
                            + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes3B = displayRoutes3B(3);
                    switch (chosenRoutes3B) {
                        case 1:
                            ShownRoutes.AutumnvaletoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                    // continueProgram2 = false;
                    Destination2F(locations);
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination3C(String[] locations) {
        int choice3C = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumnvale\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice3C = scan.nextInt();

                if (choice3C >= 1 && choice3C <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice3C >= 1 && choice3C <= locations.length) {
            switch (choice3C) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3C - 1]
                            + ".\u001B[0m"); // autumnvale
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m\" Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
                    chosenRoutes3C = displayRoutes3C(1);
                    switch (chosenRoutes3C) {
                        case 1:
                            ShownRoutes.KindlewoodtoAutumnvale(1);
                            break;
                        case 2:
                            ShownRoutes.KindlewoodtoAutumnvale(2);
                            break;
                        case 3:
                            ShownRoutes.KindlewoodtoAutumnvale(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\u001B[32m\"Mission Completed! You save all the tourists!\u001B[0m");
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination3D(String[] locations) {
        int choice3D = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumnvale\n(2) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice3D = scan.nextInt();

                if (choice3D >= 1 && choice3D <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice3D >= 1 && choice3D <= locations.length) {
            switch (choice3D) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3D - 1]
                            + ".\u001B[0m"); // kindlewood
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes3D = displayRoutes3D(1);
                    switch (chosenRoutes3D) {
                        case 1:
                            ShownRoutes.KindlewoodtoAutumnvale(1);
                            break;
                        case 2:
                            ShownRoutes.KindlewoodtoAutumnvale(2);
                            break;
                        case 3:
                            ShownRoutes.KindlewoodtoAutumnvale(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                    Destination3G(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3D + 1]
                            + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes3D = displayRoutes3D(3);
                    switch (chosenRoutes3D) {
                        case 1:
                            ShownRoutes.AutumnvaletoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination3E(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination3E(String[] locations) {
        int choice3E = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumnvale\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice3E = scan.nextInt();

                if (choice3E >= 1 && choice3E <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice3E >= 1 && choice3E <= locations.length) {
            switch (choice3E) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3E - 1]
                            + ".\u001B[0m"); // kindlewood
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes3E = displayRoutes3E(1);
                    switch (chosenRoutes3E) {
                        case 1:
                            ShownRoutes.AutumnvaletoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\u001B[32mMission Completed! You save all the tourists!\u001B[0m");
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination3F(String[] locations) {
        int choice3F = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumnvale\n(2) Kindlewood\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice3F = scan.nextInt();

                if (choice3F >= 1 && choice3F <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice3F >= 1 && choice3F <= locations.length) {
            switch (choice3F) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3F - 1]
                            + ".\u001B[0m"); // kindlewood
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION: One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes3F = displayRoutes3F(1);
                    switch (chosenRoutes3F) {
                        case 1:
                            ShownRoutes.AquavilletoAutumnvale(1);
                            break;
                        case 2:
                            ShownRoutes.AquavilletoAutumnvale(2);
                            break;
                        case 3:
                            ShownRoutes.AquavilletoAutumnvale(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                    Destination3H(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3F]
                            + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes3F = displayRoutes3F(3);
                    switch (chosenRoutes3F) {
                        case 1:
                            ShownRoutes.AquavilletoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.AquavilletoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.AquavilletoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination3C(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination3G(String[] locations) {
        int choice3G = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice3G = scan.nextInt();

                if (choice3G >= 1 && choice3G <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice3G >= 1 && choice3G <= locations.length) {
            switch (choice3G) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3G + 2]
                            + ".\u001B[0m"); // aquaville
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes3G = displayRoutes3G(3);
                    switch (chosenRoutes3G) {
                        case 1:
                            ShownRoutes.AutumnvaletoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\u001B[32mMission Completed! You save all the tourists!\u001B[0m");
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination3H(String[] locations) {
        int choice3H = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Kindlewood\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice3H = scan.nextInt();

                if (choice3H >= 1 && choice3H <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice3H >= 1 && choice3H <= locations.length) {
            switch (choice3H) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice3H + 1]
                            + ".\u001B[0m"); // aquaville
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes3H = displayRoutes3H(2);
                    switch (chosenRoutes3H) {
                        case 1:
                            ShownRoutes.AutumnvaletoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\u001B[32mMission Completed! You save all the tourists!\u001B[0m");
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination4A(String[] locations) {
        int choice4A = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumnvale\n(2) Frostpeak\n(3) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice4A = scan.nextInt();

                if (choice4A >= 1 && choice4A <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice4A >= 1 && choice4A <= locations.length) {
            switch (choice4A) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4A - 1]
                            + ".\u001B[0m"); // autumnvale
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
                    chosenRoutes4A = displayRoutes4A(1);
                    switch (chosenRoutes4A) {
                        case 1:
                            ShownRoutes.KindlewoodtoAutumnvale(1);
                            break;
                        case 2:
                            ShownRoutes.KindlewoodtoAutumnvale(2);
                            break;
                        case 3:
                            ShownRoutes.KindlewoodtoAutumnvale(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                    Destination4B(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4A - 1] + ".\u001B[0m"); // Kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes4A = displayRoutes4A(2);
                    switch (chosenRoutes4A) {
                        case 1:
                            ShownRoutes.KindlewoodtoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.KindlewoodtoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.KindlewoodtoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                     Destination4C(locations);
                    // continueProgram2 = false;
                    break;
                case 3:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4A] + ".\u001B[0m"); // Aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes4A = displayRoutes4A(3);
                    switch (chosenRoutes4A) {
                        case 1:
                            ShownRoutes.KindlewoodtoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.KindlewoodtoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.KindlewoodtoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                     Destination4E(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination4B(String[] locations) {
        int choice4B = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Frostpeak\n(2) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice4B = scan.nextInt();

                if (choice4B >= 1 && choice4B <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice4B >= 1 && choice4B <= locations.length) {
            switch (choice4B) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4B]
                            + ".\u001B[0m"); // kindlewood
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes4B = displayRoutes4B(1);
                    switch (chosenRoutes4B) {
                        case 1:
                            ShownRoutes.AutumnvaletoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                     Destination4D(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4B + 1]
                            + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes4B = displayRoutes4B(3);
                    switch (chosenRoutes4B) {
                        case 1:
                            ShownRoutes.AutumnvaletoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                     Destination2I(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination4C(String[] locations) {
        int choice4C = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumnvale\n(2) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice4C = scan.nextInt();

                if (choice4C >= 1 && choice4C <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice4C >= 1 && choice4C <= locations.length) {
            switch (choice4C) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4C - 1]
                            + ".\u001B[0m"); // autumnvale
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
                    chosenRoutes4C = displayRoutes4C(1);
                    switch (chosenRoutes4C) {
                        case 1:
                            ShownRoutes.FrostpeaktoAutumnvale(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoAutumnvale(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoAutumnvale(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n( ) Aquaville");
                    Destination3G(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4C + 1]
                            + ".\u001B[0m"); // aquaville
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes4C = displayRoutes4C(3);
                    switch (chosenRoutes4C) {
                        case 1:
                            ShownRoutes.FrostpeaktoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination3E(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination4D(String[] locations) {
        int choice4D = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Aquaville\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice4D = scan.nextInt();

                if (choice4D >= 1 && choice4D <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice4D >= 1 && choice4D <= locations.length) {
            switch (choice4D) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4D + 2]
                            + ".\u001B[0m"); // aquaville
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
                    chosenRoutes4D = displayRoutes4D(3);
                    switch (chosenRoutes4D) {
                        case 1:
                            ShownRoutes.FrostpeaktoAquaville(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoAquaville(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoAquaville(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\u001B[32mMission Completed! You save all the tourists!\u001B[0m");
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination4E(String[] locations) {
        int choice4E = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumnvale\n(2) Frostpeak\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice4E = scan.nextInt();

                if (choice4E >= 1 && choice4E <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice4E >= 1 && choice4E <= locations.length) {
            switch (choice4E) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4E - 1]
                            + ".\u001B[0m"); // autumnvale
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
                    chosenRoutes4E = displayRoutes4E(1);
                    switch (chosenRoutes4E) {
                        case 1:
                            ShownRoutes.AquavilletoAutumnvale(1);
                            break;
                        case 2:
                            ShownRoutes.AquavilletoAutumnvale(2);
                            break;
                        case 3:
                            ShownRoutes.AquavilletoAutumnvale(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination4F(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4E - 1]
                            + ".\u001B[0m"); // frostpeak
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m An island of ice and snow. Frostpeak is the territory of wolves which has a keen sense of smell, hearing, and vision.\n");
                    chosenRoutes4E = displayRoutes4E(2);
                    switch (chosenRoutes4E) {
                        case 1:
                            ShownRoutes.AquavilletoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.AquavilletoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.AquavilletoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination4G(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination4F(String[] locations) {
        int choice4F = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Frostpeak\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice4F = scan.nextInt();

                if (choice4F >= 1 && choice4F <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice4F >= 1 && choice4F <= locations.length) {
            switch (choice4F) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4F] + ".\u001B[0m"); // frostpeak
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m An island of ice and snow. Frostpeak is the territory of wolves which has a keen sense of smell, hearing, and vision.\n");
                    chosenRoutes4F = displayRoutes4F(1);
                    switch (chosenRoutes4F) {
                        case 1:
                            ShownRoutes.AutumnvaletoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\u001B[32mMission Completed! You save all the tourists!\u001B[0m");
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination4G(String[] locations) {
        int choice4G = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumnvale\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice4G = scan.nextInt();

                if (choice4G >= 1 && choice4G <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice4G >= 1 && choice4G <= locations.length) {
            switch (choice4G) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice4G - 1]
                            + ".\u001B[0m"); // autumnvale
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
                    chosenRoutes4G = displayRoutes4G(1);
                    switch (chosenRoutes4G) {
                        case 1:
                            ShownRoutes.FrostpeaktoAutumnvale(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoAutumnvale(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoAutumnvale(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\u001B[32mMission Completed! You save all the tourists!\u001B[0m");
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination5A(String[] locations) {
        int choice5A = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumnvale\n(2) Frostpeak\n(3) Kindlewood\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice5A = scan.nextInt();

                if (choice5A >= 1 && choice5A <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice5A >= 1 && choice5A <= locations.length) {
            switch (choice5A) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5A - 1]
                            + ".\u001B[0m"); // autumnvale
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
                    chosenRoutes5A = displayRoutes5A(1);
                    switch (chosenRoutes5A) {
                        case 1:
                            ShownRoutes.AquavilletoAutumnvale(1);
                            break;
                        case 2:
                            ShownRoutes.AquavilletoAutumnvale(2);
                            break;
                        case 3:
                            ShownRoutes.AquavilletoAutumnvale(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                    Destination5B(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5A - 1]
                            + ".\u001B[0m"); // frostpeak
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m An island of ice and snow. Frostpeak is the territory of wolves which has a keen sense of smell, hearing, and vision.\n");
                    chosenRoutes5A = displayRoutes5A(2);
                    switch (chosenRoutes5A) {
                        case 1:
                            ShownRoutes.AquavilletoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.AquavilletoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.AquavilletoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                     Destination5E(locations);
                    // continueProgram2 = false;
                    break;
                case 3:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5A - 1]
                            + ".\u001B[0m"); // kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes5A = displayRoutes5A(3);
                    switch (chosenRoutes5A) {
                        case 1:
                            ShownRoutes.AquavilletoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.AquavilletoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.AquavilletoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination5F(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination5B(String[] locations) {
        int choice5B = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Frostpeak\n(2) Kindlewood\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice5B = scan.nextInt();

                if (choice5B >= 1 && choice5B <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice5B >= 1 && choice5B <= locations.length) {
            switch (choice5B) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5B] + ".\u001B[0m"); // frostpeak
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m An island of ice and snow. Frostpeak is the territory of wolves which has a keen sense of smell, hearing, and vision.\n");
                    chosenRoutes5B = displayRoutes5B(1);
                    switch (chosenRoutes5B) {
                        case 1:
                            ShownRoutes.AutumnvaletoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                     Destination5C(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5B]
                            + ".\u001B[0m"); // kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes5B = displayRoutes5B(2);
                    switch (chosenRoutes5B) {
                        case 1:
                            ShownRoutes.AutumnvaletoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                     Destination5D(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination5C(String[] locations) {
        int choice5C = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Kindlewood\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice5C = scan.nextInt();

                if (choice5C >= 1 && choice5C <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice5C >= 1 && choice5C <= locations.length) {
            switch (choice5C) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5C + 1]
                            + ".\u001B[0m"); // kindlewood
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes5C = displayRoutes5C(2);
                    switch (chosenRoutes5C) {
                        case 1:
                            ShownRoutes.FrostpeaktoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\u001B[32mMission Completed! You save all the tourists!\u001B[0m");
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination5D(String[] locations) {
        int choice5D = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Frostpeak\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice5D = scan.nextInt();

                if (choice5D >= 1 && choice5D <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice5D >= 1 && choice5D <= locations.length) {
            switch (choice5D) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5D] + ".\u001B[0m"); // frostpeak
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m An island of ice and snow. Frostpeak is the territory of wolves which has a keen sense of smell, hearing, and vision.\n");
                    chosenRoutes5D = displayRoutes5D(2);
                    switch (chosenRoutes5D) {
                        case 1:
                            ShownRoutes.KindlewoodtoFrostpeak(1);
                            break;
                        case 2:
                            ShownRoutes.KindlewoodtoFrostpeak(2);
                            break;
                        case 3:
                            ShownRoutes.KindlewoodtoFrostpeak(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    System.out.println("\u001B[32mMission Completed! You save all the tourists!\u001B[0m");
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination5E(String[] locations) {
        int choice5E = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumvalle\n(2) Kindlewood\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice5E = scan.nextInt();

                if (choice5E >= 1 && choice5E <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice5E >= 1 && choice5E <= locations.length) {
            switch (choice5E) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5E - 1]
                            + ".\u001B[0m"); // kindlewood
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes5E = displayRoutes5E(1);
                    switch (chosenRoutes5E) {
                        case 1:
                            ShownRoutes.AutumnvaletoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n(/) Frostpeak\n( ) Kindlewood\n(/) Aquaville");
                    Destination3H(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5E] + ".\u001B[0m"); // kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes5E = displayRoutes5E(2);
                    switch (chosenRoutes5E) {
                        case 1:
                            ShownRoutes.FrostpeaktoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination3C(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }

    public static void Destination5F(String[] locations) {
        int choice5F = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\n\u001B[33mIslands\u001B[0m\n(1) Autumvalle\n(2) Frostpeak\n\nEnter the island you want to go: ");

            if (scan.hasNextInt()) {
                choice5F = scan.nextInt();

                if (choice5F >= 1 && choice5F <= locations.length) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Enter a number within the provided range.");
                }
            } else {
                System.out.println("Invalid input. Enter a valid integer.");
                scan.next(); // Consume the invalid input
            }
        } while (!validInput);
        if (choice5F >= 1 && choice5F <= locations.length) {
            switch (choice5F) {
                case 1:
                    // choice = input sa island
                    // chosenRoutes = input sa routes
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5F - 1]
                            + ".\u001B[0m"); // kindlewood
                    System.out.print(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes5F = displayRoutes5F(1);
                    switch (chosenRoutes5F) {
                        case 1:
                            ShownRoutes.AutumnvaletoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.AutumnvaletoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.AutumnvaletoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n(/) Autumnvale\n( ) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination4F(locations);
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\n\u001B[38;2;255;165;0mYou choose the island of " + locations[choice5F - 1]
                            + ".\u001B[0m"); // kindlewood
                    System.out.println(
                            "\n\u001B[38;2;255;165;0mDESCRIPTION:\u001B[0m One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
                    chosenRoutes5F = displayRoutes5F(2);
                    switch (chosenRoutes5F) {
                        case 1:
                            ShownRoutes.FrostpeaktoKindlewood(1);
                            break;
                        case 2:
                            ShownRoutes.FrostpeaktoKindlewood(2);
                            break;
                        case 3:
                            ShownRoutes.FrostpeaktoKindlewood(3);
                            break;
                        default:
                            System.out.println("Invalid input.");
                    }
                    System.out.println(
                            "\n\n\u001B[33mChecklist:\u001B[0m\n( ) Autumnvale\n(/) Frostpeak\n(/) Kindlewood\n(/) Aquaville");
                    Destination4G(locations);
                    // continueProgram2 = false;
                    break;
                default:
                    // continueProgram2 = true;
                    System.out.println("Invalid input. Enter the number that are listed in the option only.");
            }
        } else {
            // continueProgram2 = true;
            System.out.println("Invalid input. Enter the number that are listed in the option only.");
        }
    }
}

class ShownRoutes {
    private static GuardianOfArchipelago GuardianOfArchipelago = new GuardianOfArchipelago();

    public void ImberCovetoAutumnvale(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");

                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 3:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void ImberCovetoFrostpeak(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 3:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void ImberCovetoKindlewood(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 3:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void ImberCovetoAquaville(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");

                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 3:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void AutumnvaletoFrostpeak(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void AutumnvaletoKindlewood(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void AutumnvaletoAquaville(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void FrostpeaktoAutumnvale(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void FrostpeaktoKindlewood(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void FrostpeaktoAquaville(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public static void KindlewoodtoAutumnvale(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public static void KindlewoodtoFrostpeak(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void KindlewoodtoAquaville(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void AquavilletoAutumnvale(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void AquavilletoFrostpeak(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }

    public void AquavilletoKindlewood(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();

                System.out.println("\n\n\n");
                nextadven.adventure();
                System.out.println("\n\n\n");
                break;
            default:
                break;
        }
    }
}
