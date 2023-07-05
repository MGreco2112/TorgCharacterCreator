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
    private static Map<String, Integer> skills = new HashMap<>();
    private static int adds = 16;
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

    private static void generateName() {
        System.out.println("Enter your name:");
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

    private static void chooseArchetype() {
        System.out.println("Choose an archetype:");
        System.out.println("--------------------");
        System.out.println("|    Adrenaline    |");
        System.out.println("|     Willpower    |");
        System.out.println("|     Presence     |");
        System.out.println("--------------------");
        System.out.println("Enter 1 - 3 for your choice:");

        String choice = scanner.nextLine();

        int parsedChoice = 0;

        try {
            parsedChoice = Integer.parseInt(choice);

            if (parsedChoice > 3 || parsedChoice < 0) {
                System.out.println("Invalid Entry, try again");
                chooseArchetype();
            }
        } catch (Exception e) {
            System.out.println("Invalid Entry, try again");
            chooseArchetype();
        }

        switch (parsedChoice) {
            case 1:
                    buyAdrenalineAttributes();
                    break;
            case 2:
                    buyWillpowerAttributes();
                    break;
            case 3:
                    buyPresenceAttributes();
                    break;
            default:
                System.out.println("Invalid Selection, try again.");
                chooseArchetype();
        }
    }



    //Adrenalin:        Willpower:          Presence:
    /*
     * DEX 11 min        DEX 11 max          DEX 10 max
     * STR 11 min        STR 11 max          STR 10 max
     * TOU 11 min        TOU 11 max          TOU 10 max
     * PER 10 max        PER 11 min          PER 11 max
     * MIN 11 max        MIN 10 max          MIN 11 min
     * CHA 11 max        CHA 10 max          CHA 11 min
     * SPI 11 max        SPI 10 max          SPI 11 min
     * */

    private static void buyAdrenalineAttributes() {
        int points = 66;
        System.out.println("The Adrenaline Archetype favors DEX, STR, TOU and limits PER, MIN, and SPI.");
        System.out.println("The Minimum Points for DEX, STR, and TOU is 11 each.");
        System.out.println("The Maximum Points for PER is 10, for MIN, CHA, and SPI it is 11.");

        String[] attributesArray = new String[] {"DEX", "STR", "TOU", "PER", "MIN", "CHA", "SPI"};

        for (int i = 0; i < attributesArray.length; i++) {
            System.out.println("Points Remaining: " + points);
            System.out.println("Enter your desired value for " + attributesArray[i]);
            String choice = scanner.nextLine();

            int parsedChoice = 0;

            try {
                parsedChoice = Integer.parseInt(choice);

                if (i < 3 && parsedChoice < 11) {
                    System.out.println("Entered Value below minimum for Attribute. Try again.");
                    i--;
                    continue;
                } else if (i == 3 && parsedChoice > 10 || i < 3 && parsedChoice > 11) {
                    System.out.println("Entered Value above maximum for this Attribute. Try again.");
                    i--;
                    continue;
                }

                attributes.put(attributesArray[i], parsedChoice);
                points -= parsedChoice;

            } catch (Exception e) {
                System.out.println("Invalid Entry, valid numbers are 1 - attribute max");
                i--;
            }
        }

        if (points != 0) {
            System.out.println("Invalid Point Distribution. Try again");
            buyAdrenalineAttributes();
        }
    }


    //Adrenalin:        Willpower:          Presence:
    /*
     * DEX 11 min        DEX 11 max          DEX 10 max
     * STR 11 min        STR 11 max          STR 10 max
     * TOU 11 min        TOU 11 max          TOU 10 max
     * PER 10 max        PER 11 min          PER 11 max
     * MIN 11 max        MIN 10 min          MIN 11 min
     * CHA 11 max        CHA 10 max          CHA 11 min
     * SPI 11 max        SPI 10 max          SPI 11 min
     * */


    private static void buyWillpowerAttributes() {
        int points = 66;
        System.out.println("The Willpower Archetype favors PER and MIN while limiting all other Attributes.");
        System.out.println("The Minimum Points for PER is 11 and for MIN is 10");
        System.out.println("The Maximum Points for DEX, STR, TOU, CHA, and SPI is 11.");

        String[] attributesArray = new String[] {"DEX", "STR", "TOU", "PER", "MIN", "CHA", "SPI"};

        for (int i = 0; i < attributesArray.length; i++) {
            System.out.println("Points Remaining: " + points);
            System.out.println("Enter your desired value for " + attributesArray[i]);
            String choice = scanner.nextLine();

            int parsedChoice = 0;

            try {
                parsedChoice = Integer.parseInt(choice);

                if (i == 3 && parsedChoice < 11 || i == 4 && parsedChoice < 10) {
                    System.out.println("Entered Value below minimum for Attribute. Try again.");
                    i--;
                    continue;
                } else if (i != 3 && i != 4 && parsedChoice > 11) {
                    System.out.println("Entered Value above maximum for this Attribute. Try again.");
                    i--;
                    continue;
                }

                attributes.put(attributesArray[i], parsedChoice);
                points -= parsedChoice;

            } catch (Exception e) {
                System.out.println("Invalid Entry, valid numbers are 1 - attribute max");
                i--;
            }
        }

        if (points != 0) {
            System.out.println("Invalid Point Distribution. Try again");
            buyAdrenalineAttributes();
        }
    }



    //Adrenalin:        Willpower:          Presence:
    /*
     * DEX 11 min        DEX 11 max          DEX 10 max
     * STR 11 min        STR 11 max          STR 10 max
     * TOU 11 min        TOU 11 max          TOU 10 max
     * PER 10 max        PER 11 min          PER 11 max
     * MIN 11 max        MIN 10 min          MIN 11 min
     * CHA 11 max        CHA 10 max          CHA 11 min
     * SPI 11 max        SPI 10 max          SPI 11 min
     * */


    private static void buyPresenceAttributes() {
        int points = 66;
        System.out.println("The Presence Archetype favors MIN, CHA, and SPI while it limits DEX, STR, TOU, and PER.");
        System.out.println("The Minimum Points for MIN, CHA, and SPI is 11.");
        System.out.println("The Maximum Points for DEX STR, and TOU is 10, and for PER it is 11.");

        String[] attributesArray = new String[] {"DEX", "STR", "TOU", "PER", "MIN", "CHA", "SPI"};

        for (int i = 0; i < attributesArray.length; i++) {
            System.out.println("Points Remaining: " + points);
            System.out.println("Enter your desired value for " + attributesArray[i]);
            String choice = scanner.nextLine();

            int parsedChoice = 0;

            try {
                parsedChoice = Integer.parseInt(choice);

                if (i < 2 && parsedChoice > 10 || i == 3 && parsedChoice > 11) {
                    System.out.println("Entered Value above maximum for Attribute. Try again.");
                    i--;
                    continue;
                } else if (i >= 4 && parsedChoice < 11) {
                    System.out.println("Entered Value below minimum for this Attribute. Try again.");
                    i--;
                    continue;
                }

                attributes.put(attributesArray[i], parsedChoice);
                points -= parsedChoice;

            } catch (Exception e) {
                System.out.println("Invalid Entry, valid numbers are 1 - attribute max");
                i--;
                continue;
            }
        }

        if (points != 0) {
            System.out.println("Invalid Point Distribution. Try again");
            buyAdrenalineAttributes();
        }
    }

    private static void buySkillAdds() {
        System.out.println("You have " + adds + " Skill Adds to assign to different skills.\nThe Reality Skill gets the first Adds.");
        System.out.println("After that, enter the name of the skill and the number of adds given to it.");
        System.out.println("No one skill can have more than 3 Adds given to it.");

        int realityAdds = realitySkillAdds();
        skills.put("Reality", realityAdds);

        int numberOfSkills = numberOfSkills();

        for (int i = 0; i < numberOfSkills || adds > 0; i++) {
            System.out.println("Adds remaining: " + adds);
            System.out.println("Enter the name of the Skill:");
            String skillName = scanner.nextLine();
            System.out.println("Enter the number of Adds, 1 min and 3 max");
            String assignedAdds = scanner.nextLine();

            int parsedAssignedAdds = 0;

            try {
                parsedAssignedAdds = Integer.parseInt(assignedAdds);

                if (adds - parsedAssignedAdds < 0) {
                    System.out.println("Invalid Entry, not enough Points. Try again");
                    i--;
                    continue;
                }

                if (parsedAssignedAdds < 1 || parsedAssignedAdds > 3) {
                    System.out.println("Invalid Entry, Adds must be between 1 and 3 Inclusive. Try again.");
                    i--;
                    continue;
                }

                skills.put(skillName, parsedAssignedAdds);
                adds -= parsedAssignedAdds;
            } catch (Exception e) {
                System.out.println("Invalid Entry, try again");
                i--;
                continue;
            }
        }
    }

    private static int realitySkillAdds() {
        System.out.println("Total Adds Left: " + adds);
        System.out.println("Enter the number of Adds given to the Reality Skill:");

        String realityAdds = scanner.nextLine();
        int parsedRealityAdds = 0;

        try {
            parsedRealityAdds = Integer.parseInt(realityAdds);

            if (parsedRealityAdds > 3 || parsedRealityAdds < 0) {
                System.out.println("Invalid Entry, at least one Add must be assigned to Reality with a max of 3 Adds.");
                realitySkillAdds();
            }
        } catch (Exception e) {
            System.out.println("Invalid Entry, please try again");
            realitySkillAdds();
        }

        return parsedRealityAdds;
    }

    private static int numberOfSkills() {
        System.out.println("How many Skills will you give your character?");
        String skillCount = scanner.nextLine();

        int parsedSkillCount = 0;

        try {
            parsedSkillCount = Integer.parseInt(skillCount);

            if (parsedSkillCount < 1) {
                System.out.println("Skills must be at least 1.");
                numberOfSkills();
            }

        } catch (Exception e) {
            System.out.println("Invalid Entry, please try again.");
            numberOfSkills();
        }

        return parsedSkillCount;
    }

    public static void creationControlFlow() {
        generateName();
        chooseCosm();
        chooseArchetype();
        buySkillAdds();
    }
}
