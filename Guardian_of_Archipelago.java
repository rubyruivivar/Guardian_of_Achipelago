import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Map;

class banner {
    public static void generateMAPBanner() {
        System.out.println(
                "\n                                                                                                                                                                                   ");
        System.out.println(
                "     █████   ███   █████          ████                                                 █████                  █████████                                     █████  ███ ");
        System.out.println(
                "     ░░███   ░███  ░░███          ░░███                                                ░░███                  ███░░░░░███                                   ░░███  ░░░ ");
        System.out.println(
                "      ░███   ░███   ░███   ██████  ░███   ██████   ██████  █████████████    ██████     ███████    ██████     ███     ░░░  █████ ████  ██████   ████████   ███████  ████   ██████   ████████  ");
        System.out.println(
                "      ░███   ░███   ░███  ███░░███ ░███  ███░░███ ███░░███░░███░░███░░███  ███░░███   ░░░███░    ███░░███   ░███         ░░███ ░███  ░░░░░███ ░░███░░███ ███░░███ ░░███  ░░░░░███ ░░███░░███  ");
        System.out.println(
                "      ░░███  █████  ███  ░███████  ░███ ░███ ░░░ ░███ ░███ ░███ ░███ ░███ ░███████      ░███    ░███ ░███   ░███    █████ ░███ ░███   ███████  ░███ ░░░ ░███ ░███  ░███   ███████  ░███ ░███ ");
        System.out.println(
                "       ░░░█████░█████░   ░███░░░   ░███ ░███  ███░███ ░███ ░███ ░███ ░███ ░███░░░       ░███ ███░███ ░███   ░░███  ░░███  ░███ ░███  ███░░███  ░███     ░███ ░███  ░███  ███░░███  ░███ ░███  ");
        System.out.println(
                "         ░░███ ░░███     ░░██████  █████░░██████ ░░██████  █████░███ █████░░██████      ░░█████ ░░██████     ░░█████████  ░░████████░░████████ █████    ░░████████ █████░░████████ ████ █████  ");
        System.out.println(
                "          ░░░   ░░░       ░░░░░░  ░░░░░  ░░░░░░   ░░░░░░  ░░░░░ ░░░ ░░░░░  ░░░░░░        ░░░░░   ░░░░░░       ░░░░░░░░░    ░░░░░░░░  ░░░░░░░░ ░░░░░      ░░░░░░░░ ░░░░░  ░░░░░░░░ ░░░░ ░░░░░  ");
        System.out.println(
                "                                                                                                                                                                                                           ");
        System.out.println(
                "                                                                                                                                                                                                         ");
        System.out.println(
                "                                                                                                                                                                                                 ");
        System.out.println(
                "                                                         ██████       █████████                      █████       ███                     ████                                 ███");
        System.out.println(
                "                                                         ███░░███     ███░░░░░███                    ░░███       ░░░                     ░░███                                ░███");
        System.out.println(
                "                                               ██████   ░███ ░░░     ░███    ░███  ████████   ██████  ░███████   ████  ████████   ██████  ░███   ██████    ███████  ██████    ░███ ");
        System.out.println(
                "                                              ███░░███ ███████       ░███████████ ░░███░░███ ███░░███ ░███░░███ ░░███ ░░███░░███ ███░░███ ░███  ░░░░░███  ███░░███ ███░░███   ░███  ");
        System.out.println(
                "                                             ░███ ░███░░░███░        ░███░░░░░███  ░███ ░░░ ░███ ░░░  ░███ ░███  ░███  ░███ ░███░███████  ░███   ███████ ░███ ░███░███ ░███   ░███");
        System.out.println(
                "                                             ░███ ░███  ░███         ░███    ░███  ░███     ░███  ███ ░███ ░███  ░███  ░███ ░███░███░░░   ░███  ███░░███ ░███ ░███░███ ░███   ░░░ ");
        System.out.println(
                "                                             ░░██████   █████        █████   █████ █████    ░░██████  ████ █████ █████ ░███████ ░░██████  █████░░████████░░███████░░██████     ███ ");
        System.out.println(
                "                                              ░░░░░░   ░░░░░        ░░░░░   ░░░░░ ░░░░░      ░░░░░░  ░░░░ ░░░░░ ░░░░░  ░███░░░   ░░░░░░  ░░░░░  ░░░░░░░░  ░░░░░███ ░░░░░░     ░░░ ");
        System.out.println(
                "                                                                                                                       ░███                               ███ ░███ ");
        System.out.println(
                "                                                                                                                       █████                             ░░██████ ");
        System.out.println(
                "                                                                                                                     ░░░░░                               ░░░░░░");
    }
}

class MainMap {
    public static void map() {
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t███╗   ███╗ █████╗ ██████╗ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t████╗ ████║██╔══██╗██╔══██╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██╔████╔██║███████║██████╔╝");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║╚██╔╝██║██╔══██║██╔═══╝ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║ ╚═╝ ██║██║  ██║██║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t╚═╝     ╚═╝╚═╝  ╚═╝╚═╝\n");
        String[] islands = { "Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t       You're here!     \t\t\t\n");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
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
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
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
                                                                                                // Shores
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out
                        .println("\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i]
                                + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");

            }
        }
    }
}

class updatedMap {
    public static void Autumnvale() { // AUTUMNVALE
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t███╗   ███╗ █████╗ ██████╗ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t████╗ ████║██╔══██╗██╔══██╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██╔████╔██║███████║██████╔╝");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║╚██╔╝██║██╔══██║██╔═══╝ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║ ╚═╝ ██║██║  ██║██║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t╚═╝     ╚═╝╚═╝  ╚═╝╚═╝\n");
        String[] islands = { "Imber Cove", "Autumnvale", "Frostpeak", "Kindlewood", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
                                + "      * -----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|");
                System.out.print("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\tv\t\t\t\t\t\t\t\t\t|\n");

            } else if (i == 1) {
                System.out.println("\t\t\t\t\t\t\t     ***********************\t\t\t\t\t\t\t\t|"); // Autumvale
                System.out.println("\t\t\t\t\t\t\t     *                     *\t\t\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t    You're here!     *     " + islands[i] + "     * ------\t\t\t\t\t\t\t|");
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
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
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
                                                                                                // Shores
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out
                        .println("\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i]
                                + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");

            }
        }
    }

    public static void Frostpeak() {
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t███╗   ███╗ █████╗ ██████╗ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t████╗ ████║██╔══██╗██╔══██╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██╔████╔██║███████║██████╔╝");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║╚██╔╝██║██╔══██║██╔═══╝ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║ ╚═╝ ██║██║  ██║██║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t╚═╝     ╚═╝╚═╝  ╚═╝╚═╝\n");
        String[] islands = { "Imber Cove", "Autumnvale", "Frostpeak", "Kindlewood", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
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
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i]
                                    + "      *    You're here!");
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
                                                                                                // Shores
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out
                        .println("\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i]
                                + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");

            }
        }
    }

    public static void Kindlewood() {
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t███╗   ███╗ █████╗ ██████╗ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t████╗ ████║██╔══██╗██╔══██╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██╔████╔██║███████║██████╔╝");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║╚██╔╝██║██╔══██║██╔═══╝ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║ ╚═╝ ██║██║  ██║██║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t╚═╝     ╚═╝╚═╝  ╚═╝╚═╝\n");
        String[] islands = { "Imber Cove", "Autumnvale", "Frostpeak", "Kindlewood", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
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
                System.out.println(
                        "\t\t\t\t\t    You're here!     *     " + islands[i] + "      * ------\t\t\t\t\t\t\t|");
                System.out.println("\t\t\t\t\t\t\t     *                     *      -------\t\t\t\t\t\t|");
                System.out.println(
                        "\t\t\t\t\t\t\t     ***********************\t\t-------\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t      ------\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t    ------\t\t\t\t|");

            } else if (i % 2 == 0) {
                if (i == 2) {
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t  -------\t     ***********************"); // Frostpeak
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t        -------      *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
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
                                                                                                // Shores
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out
                        .println("\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i]
                                + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");

            }
        }
    }

    public static void Aquaville() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t███╗   ███╗ █████╗ ██████╗ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t████╗ ████║██╔══██╗██╔══██╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██╔████╔██║███████║██████╔╝");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║╚██╔╝██║██╔══██║██╔═══╝ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║ ╚═╝ ██║██║  ██║██║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t╚═╝     ╚═╝╚═╝  ╚═╝╚═╝\n");
        String[] islands = { "Imber Cove", "Autumnvale", "Frostpeak", "Kindlewood", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
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
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i]
                                    + "      *    You're here!");
                    System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t             *                     *");
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t     ***********************\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|\n\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t\t\t|");
                }
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t ***********************\t\t\t|"); // Celestial
                                                                                                // Shores
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out
                        .println("\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i]
                                + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");

            }
        }
    }

    public static void CelestialShores() {
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t███╗   ███╗ █████╗ ██████╗ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t████╗ ████║██╔══██╗██╔══██╗");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██╔████╔██║███████║██████╔╝");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║╚██╔╝██║██╔══██║██╔═══╝ ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t██║ ╚═╝ ██║██║  ██║██║");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t╚═╝     ╚═╝╚═╝  ╚═╝╚═╝\n");
        String[] islands = { "Imber Cove", "Autumnvale ", "Frostpeak", "Kindlewood ", "Aquaville", "Celestial Shores" };
        for (int i = 0; i < islands.length; i++) {
            if (i == 0) {
                System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t ***********************"); // Imber Cove
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println(
                        "\t\t\t\t\t\t\t\t\t ------------------------*     " + islands[i]
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
                    System.out.println(
                            "\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t      ------ *      " + islands[i] + "      *");
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
                                                                                                // Shores
                System.out.println("\t\t\t\t\t\t\t\t\t|\t\t\t *                     *\t\t\t|");
                System.out
                        .println("\t\t\t\t\t\t\t\t\t ----------------------> *   " + islands[i]
                                + "  * <----------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t *                     *");
                System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ***********************");
                System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t       You're here!     \t\t\t\n");

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
                "\n* What is the capital of France? *\n",
                "\n* Who wrote Romeo and Juliet? *\n",
                "\n* What is the boiling point of water in Celsius? *\n",
                "\n* Which country is known as the Land of the Rising Sun? *\n",
                "\n* Which planet is known as the Red Planet? *\n",
                "\n* What do we call the pattern of stars that people imagine in the sky? *\n",
                "\n* On what continent would you find the worlds largest desert? *\n",
                "\n* Who was the first Disney princess? *\n",
                "\n* Who is known as the Father of Modern Physics? *\n",
                "\n* Who painted the famous artwork The Last Supper? *\n",
                "\n* What is the name of the little mermaid in the Disney movie? *\n",
                "\n* What animal is known for its long neck and spots on its body? *\n",
                "\n* In what season do leaves fall off the trees? *\n",
                "\n* What animal is known for its ability to change color to match its surroundings? *\n",
                "\n* In what fairy tale does a pumpkin turn into a carriage? *\n",
                "\n* What is the main color of the Smurfs? *\n",
                "\n* In the nursery rhyme, who had a farm with a dog named BINGO? *\n",
                "\n* Which bird can repeat words and phrases that it hears, often kept as a pet? *\n",
                "\n* Google Chrome, Safari, Firefox, and Explorer are different types of what? *\n",
                "\n* What part of the atom has no electric charge? *\n",
                "\n* What is the symbol for potassium? *\n",
                "\n* What is meteorology the study of? *\n",
                "\n* Which planet is the hottest in the solar system? *\n",
                "\n* Which natural disaster is measured with a Richter scale? *\n",
                "\n* What animals are pearls found in? *\n",
                "\n* Which planet has the most gravity? *\n",
                "\n* What was the name of the actor who played Jack Dawson in Titanic? *\n",
                "\n* Which cartoon character lives in a pineapple under the sea? *\n",
                "\n* Which popular soft drink was originally created as a medicine in the 19th century? *\n",
                "\n* What goes up and down but does not move? *\n",
                "\n* What has one eye, but cannot see? *\n",
                "\n* What building has the most stories? *\n",
                "\n* I am the beginning of everything, the end of everywhere. I'm the beginning of eternity, the end of time and space. What am I? *\n",
                "\n* What can fill a room but takes up no space? *\n",
                "\n* What kind of tree can you carry in your hand? *\n",
                "\n* They come out at night without being called, and are lost in the day without being stolen. What are they? *\n",
                "\n* What goes through cities and fields, but never moves? *\n",
                "\n* When it is alive we sing, when it is dead we clap ourhands. What is it? *\n",
                "\n* I have no life, but I can die. What am I? *\n",
                "\n* What kind of room has no walls, door or windows? *\n",
                "\n* I make a loud sound when I am changing. When I do change, I get bigger but weigh less. What am I? *\n",
                "\n* It has keys, but no locks. It has space, but no room. You can enter, but cannot go inside. What is it? *\n",
                "\n* I am orange, I wear a green hat and I sound like a parrot. What am I? *\n",
                "\n* What thrives when you feed it but dies when you water it? *\n",
                "\n* What has 13 hearts but no other organs? *\n",
                "\n* What kind of ship has two mates but no captain? *\n",
                "\n* Which word in the dictionary is spelled incorrectly? *\n",
                "\n* What begins with letter e and only contains one letter? *\n",
                "\n* Which fish costs the most? *\n",
                "\n* What five-letter word becomes shorter when you add two letters to it? *\n",
                "\n* What has a face and two hands but no arms or legs? *\n",
                "\n* What has many keys but cannot open a single lock? *\n",
                "\n* What is always found on the ground but never gets dirty? *\n",
                "\n* What gets wet while drying? *\n",
                "\n* What has a head and a tail but no body? *\n",
                "\n* What is full of holes but still holds water? *\n",
                "\n* What has many teeth but cannot bite? *\n",
                "\n* What has one head, one foot, and four legs? *\n",
                "\n* What is always running but never gets hot? *\n",
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
                System.out.print("\r" + i + " seconds ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("\n");
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

public class GuardianOfArchipelago {
    static Random random = new Random();
    static Scanner scan = new Scanner(System.in);
    private static final int METERS_PER_MINUTE = 1;
    private static final int MINUTES_PER_HOUR = 60;
    private static ShownRoutes ShownRoutes = new ShownRoutes();
    private static int chosenRoutes;
    // private static boolean continueProgram2;
    // private static Routes ShownRoutes = new Routes();

    public static void main(String[] args) {
        banner.generateMAPBanner();
        Introduction();

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.print("\nDo you want to continue?\n(1) Yes\n(2) No \n");
            System.out.print("\nEnter your choice: ");

            if (scan.hasNextInt()) {
                int YN = scan.nextInt();
                switch (YN) {
                    case 1:
                        continueProgram = false;
                        MainMap.map();
                        checkList();
                        Islands();

                        break;
                    case 2:
                        System.out.print(
                                "\nAre you sure you want to end the game?\n(1) Yes\n(2) No\nEnter your choice: ");
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

        System.out.println("\nPossible routes from your current location:");
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
                .println("Shortest Route: (" + (shortestRouteIndex + 1) + ") Distance: " + distances[shortestRouteIndex]
                        + " meters - " + routesArray[shortestRouteIndex]);

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

        System.out.println("\nThe route you choose is: (" + chosenRoutes + ") " + distances[chosenRoutes - 1]
                + " meters - " + routesArray[chosenRoutes - 1]);
        calculateTimeTravel(distances[chosenRoutes - 1]); // Calculate time travel and convert to meters per hour

        return chosenRoutes;
    }

    private static void calculateTimeTravel(int distance) {
        int totalMinutes = distance / METERS_PER_MINUTE;
        int hour = totalMinutes / MINUTES_PER_HOUR;
        int minutes = totalMinutes % MINUTES_PER_HOUR;

        System.out.println("Time travel: " + formatTime(hour) + " " + formatPlural(hour, "hour") +
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
        System.out.println("\nWARNING: You will encounter an obstacle!");

        QuizGame quizGame = new QuizGame();
        scan.nextLine();

        String question = quizGame.getRandomQuestion();
        System.out.println("\nYou have 60 seconds to answer the question.");

        for (int live = 1; live <= 3; live++) {
            quizGame.startTimer(60);

            System.out.println(question);
            int questionIndex = Arrays.asList(quizGame.getQuestions()).indexOf(question);
            String userAnswer = scan.nextLine().toUpperCase();

            // Stop the timer thread when the user enters an answer
            quizGame.stopTimer();

            if (questionIndex >= 0 && questionIndex < quizGame.getAnswers().length) {
                if (quizGame.checkAnswer(userAnswer, questionIndex)) {
                    System.out.println("Your answer is: " + userAnswer);
                    System.out.println("Correct!");
                    break; // Exit the method if the answer is correct
                } else {
                    System.out.println("Your answer is: " + userAnswer);
                    System.out.println("Correct answer is: " + quizGame.getAnswers()[questionIndex]);
                    System.out.print("You have " + (3 - live) + " live/s left. ");
                    if (live == 3) {
                        System.out.println("\n\nMission Failed! Your adventure ends here.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!\n");
                    }
                }
            } else {
                System.out.println("Invalid question index.");
            }
            System.out.println("Your current live/s: " + (3 - live));
        }
        return false;
    }

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
        int choice = 0;
        boolean validInput = false;

        do {
            System.out.print(
                    "\nIslands\n(1) Autumnvale\n(2) Frostpeak\n(3) Kindlewood\n(4) Aquaville\n\nEnter the island you want to go: ");

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
                //choice = input sa island
                //chosenRoutes = input sa routes
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // autumnvale
                    System.out.print(
                            "\nDESCRIPTION: Autumn or Fall is the season on this island. In contrast to its beautiful season, strong to violent winds are what covers the entire island.\n");
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
                    // continueProgram2 = false;
                    break;
                case 2:
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // frostpeak
                    System.out.println(
                            "\nDESCRIPTION: An island of ice and snow. Frostpeak is the territory of wolves which has a keen sense of smell, hearing, and vision.\n");
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
                    // continueProgram2 = false;
                    break;
                case 3:
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // kindlewood
                    System.out.println(
                            "\nDESCRIPTION: One of the Forbidden Islands known for its earthquake phenomenon and is best described for its weather condition - summer.\n");
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
                    // continueProgram2 = false;
                    break;
                case 4:
                    System.out.println("\nYou choose the island of " + locations[choice - 1] + "."); // aquaville
                    System.out.println(
                            "\nDESCRIPTION: Aquaville is an island that frequently rains. The said island is known to be a home of sea monsters. Be careful with your encounters with them.\n");
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

    public static void ImberCovetoAutumnvale(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();

                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
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
                break;
            default:
                break;
        }
    }

    public static void ImberCovetoFrostpeak(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                break;
            case 3:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();

                break;
            default:
                break;
        }
    }

    public static void ImberCovetoKindlewood(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                break;
            case 3:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                break;
            default:
                break;
        }
    }

    public static void ImberCovetoAquaville(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                break;
            case 3:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                break;
            default:
                break;
        }
    }

    public static void AutumnvaletoFrostpeak(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                break;
            default:
                break;
        }
    }

    public static void AutumnvaletoKindlewood(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                break;
            default:
                break;
        }
    }

    public static void AutumnvaletoAquaville(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                break;
            default:
                break;
        }
    }

    public static void FrostpeaktoAutumnvale(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                updatedMap.Autumnvale();
                break;
            default:
                break;
        }
    }

    public static void FrostpeaktoKindlewood(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                break;
            default:
                break;
        }
    }

    public static void FrostpeaktoAquaville(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
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
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
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
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                break;
            default:
                break;
        }
    }

    public static void KindlewoodtoAquaville(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                break;
            default:
                break;
        }
    }

    public static void AquavilletoAutumnvale(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Aquaville();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                break;
            default:
                break;
        }
    }

    public static void AquavilletoFrostpeak(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                break;
            default:
                break;
        }
    }

    public static void AquavilletoKindlewood(int chosenRoutes) {
        switch (chosenRoutes) {
            case 1:
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                break;
            case 2:
                GuardianOfArchipelago.onBoat();
                updatedMap.Frostpeak();
                GuardianOfArchipelago.onBoat();
                updatedMap.Autumnvale();
                GuardianOfArchipelago.onBoat();
                updatedMap.Kindlewood();
                break;
            default:
                break;
        }
    }
}
