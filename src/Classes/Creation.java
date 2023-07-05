package Classes;

import java.util.Scanner;

public class Creation {
    private static Scanner scanner = new Scanner(System.in);
    private static String playerName = "";
    private static String characterName = "";
    private static String cosm = "";
    //66 attribute points
    //pick a template, either Adrenalin, Willpower, or Presence
        //Adrenalin:        Willpower:          Presence:
            /*
            * DEX 11 min        DEX 11 max          DEX 10 max
            * STR 11 min        STR 11 max          STR 10 max
            * TOU 11 min        TOU 11 max          TOU 10 max
            * PER 10 max        PER 11 mim          PER 11 max
            * MIN 11 max        MIN 10 max          MIN 11 min
            * SPI 11 max        SPI 10 max          SPI 11 min
            * */

    //no one skill may be above 13

    //16 skill adds, no more than 3 skill adds to any one skill

    public static void generateName() {
        System.out.println("Enter your name");
        playerName = scanner.nextLine();
        System.out.println("Enter a name for your character:");
        characterName = scanner.nextLine();
    }

    private static void chooseCosm() {
        System.out.println("Choose your cosm:");
        System.out.println("--------------------");
        System.out.println("|    Core Earth    |");
        System.out.println("|       Aysle      |");
        System.out.println("|    Cyberpapacy   |");
        System.out.println("|    Nile Empire   |");
        System.out.println("|      Orrorsh     |");
        System.out.println("|    Nippon Tech   |");
        System.out.println("|    Living Land   |");
        System.out.println("--------------------");
        System.out.println("Enter 1 - 7 as a choice");

        String cosmChoice = scanner.nextLine();
        int parsedCosmChoice = 0;

        try {
            parsedCosmChoice = Integer.parseInt(cosmChoice);
        } catch (Exception e) {
            System.out.println("Invalid Choice, try again");
            chooseCosm();
        }

        switch (parsedCosmChoice) {
            case 1:
                    cosm = "Core Earth";
                    break;
            case 2:
                    cosm = "Aysle";
                    break;
            case 3:
                    cosm = "Cyberpapacy";
                    break;
            case 4:
                    cosm = "Nile Empire";
                    break;
            case 5:
                    cosm = "Orrorsh";
                    break;
            case 6:
                    cosm = "Nippon Tech";
                    break;
            case 7:
                    cosm = "Living Land";
                    break;
            default:
                    System.out.println("Invalid Entry: Try Again.");
                    chooseCosm();

        }
    }
}
