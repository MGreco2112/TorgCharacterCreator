package Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Creation {
    private static Scanner scanner = new Scanner(System.in);
    private static String playerName = "";
    private static String characterName = "";
    private static String cosm = "";
    private static Map<String, Integer> axioms = new HashMap<>();
    private static Map<String, Integer> attributes = new HashMap<>();
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

            if (parsedCosmChoice > 7 || parsedCosmChoice < 1) {
                System.out.println("Invalid Choice, try again");
                chooseCosm();
            }
        } catch (Exception e) {
            System.out.println("Invalid Choice, try again");
            chooseCosm();
        }

        switch (parsedCosmChoice) {
            case 1:
                    cosm = "Core Earth";
                    axioms.put("Magic", 7);
                    axioms.put("Social", 21);
                    axioms.put("Spiritual", 9);
                    axioms.put("Tech", 23);
                    break;
            case 2:
                    cosm = "Aysle";
                    axioms.put("Magic", 18);
                    axioms.put("Social", 18);
                    axioms.put("Spiritual", 16);
                    axioms.put("Tech", 15);
                    break;
            case 3:
                    cosm = "Cyberpapacy";
                    axioms.put("Magic", 10);
                    axioms.put("Social", 18);
                    axioms.put("Spiritual", 14);
                    axioms.put("Tech", 26);
                    break;
            case 4:
                    cosm = "Nile Empire";
                    axioms.put("Magic", 12);
                    axioms.put("Social", 20);
                    axioms.put("Spiritual", 17);
                    axioms.put("Tech", 21);
                    break;
            case 5:
                    cosm = "Orrorsh";
                    axioms.put("Magic", 15);
                    axioms.put("Social", 20);
                    axioms.put("Spiritual", 17);
                    axioms.put("Tech", 19);
                    break;
            case 6:
                    cosm = "Nippon Tech";
                    axioms.put("Magic", 2);
                    axioms.put("Social", 22);
                    axioms.put("Spiritual", 8);
                    axioms.put("Tech", 24);
                    break;
            case 7:
                    cosm = "Living Land";
                    axioms.put("Magic", 0);
                    axioms.put("Social", 7);
                    axioms.put("Spiritual", 24);
                    axioms.put("Tech", 7);
                    break;
            default:
                    System.out.println("Invalid Entry: Try Again.");
                    chooseCosm();

        }
    }

    private static void buyAttributes() {
        System.out.println("Choose an archetype:");
        System.out.println("--------------------");
        System.out.println("|    Adrenaline    |");
        System.out.println("|     Willpower    |");
        System.out.println("|     Presence     |");
        System.out.println("--------------------");
        System.out.println("Enter 1 - 3 for your choice:");

        String choice = scanner.nextLine();

        try {
            int parsedChoice = Integer.parseInt(choice);

            if (parsedChoice > 3 || parsedChoice < 0) {
                System.out.println("Invalid Entry, try again");
                buyAttributes();
            }
        } catch (Exception e) {
            System.out.println("Invalid Entry, try again");
            buyAttributes();
        }

        //todo create scripting that understands choice and factors in min/max from table above
    }
}
