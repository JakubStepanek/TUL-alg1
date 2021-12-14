
import java.util.Scanner;

public class App {
    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        showMenu();
        drawFish(findDate());

        // test();
    }

    private static void test() {
        // int N = 7;
        // drawFish(N);
        // drawDeadFish();
        // printText();
        // System.out.println(findDate());

    }

    private static void showMenu() {
        System.out.println("Pick one: ");
        System.out.println("1. Christmass event");
        System.out.println("Push ENTER for exit");
        String input = sc.nextLine();
        switch (input) {
            case "1":
                christmasEvent();
            case "2":
                // ToDo
                break;

            default:
                break;
        }

    }

    public static boolean christmasEvent() {
        System.out.println("Christmas time began.");
        int size;
        boolean eatsFish = false;
        boolean end = false;

        do {
            System.out.println("I would like to ask you, do you like FISH for Christmas Eve");
            String answer = sc.nextLine().toLowerCase();
            switch (answer) {
                case "yes":
                    eatsFish = true;
                    System.out.println("nice");
                    end = true;
                    break;
                case "no":
                    eatsFish = false;
                    System.out.println("lucky you");
                    end = true;
                    break;
                default:
                    System.out.println("Wrong choice, try it again.");
                    break;
            }
        } while (!end);

        return (eatsFish);
    }

    public static int findDate() {
        int size = 0;
        boolean end = false;
        do {
            System.out.println("Thank You for answering. Now I would like to ask you what date is today?");
            int date = sc.nextInt();
            switch (date) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    size = 4;
                    end = true;
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    size = 8;
                    end = true;
                    break;
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    size = 12;
                    end = true;
                    break;
                default:
                    System.out.println("Wrong choice, try it again.");
                    end = true;
                    break;
            }
        } while (!end);

        return (size);
    }

    public static void drawFish(int size) {

        String spacesOUT = "", spacesIN = "", spacesINtemp = "", spacesTailLOVER = "", stars1 = "*", stars2 = "*";
        int tailSize = size - 1;

        for (int i = 0; i < size; ++i) {
            spacesOUT += " ";
        }

        for (int i = 0; i < 2 * size + 1; ++i) {

            // For upper part
            if (i < size) {
                if (i == size / 2 + 1) {
                    spacesINtemp = spacesIN;
                    spacesIN = spacesIN.substring(0, 2) + "O" + spacesIN.substring(3);
                    System.out.print(spacesOUT + stars1 + spacesIN + stars1 + spacesOUT
                            + spacesOUT.substring(0, spacesOUT.length() - 1) + stars1.repeat(i));
                    System.out.println();
                    spacesOUT = spacesOUT.substring(0, spacesOUT.length() - 1);
                    spacesIN += "  ";
                    spacesIN = spacesINtemp += "  ";

                } else {

                    System.out.print(spacesOUT + stars1 + spacesIN + stars1 + spacesOUT
                            + spacesOUT.substring(0, spacesOUT.length() - 1) + stars1.repeat(i));
                    System.out.println();
                    spacesOUT = spacesOUT.substring(0, spacesOUT.length() - 1);
                    spacesIN += "  ";
                }
            }

            // For middle part
            if (i == size) {
                System.out.println(spacesOUT + spacesIN.substring(0, 1) + "==" + spacesIN.substring(2)
                        + stars2.repeat(size));
                spacesOUT += " ";
            }

            // For lower part

            if (i > size) {
                spacesTailLOVER += " ";
                spacesIN = spacesIN.substring(0, spacesIN.length() - 2);
                System.out.println(spacesOUT + stars1 + spacesIN + stars1
                        + spacesOUT.substring(0, spacesOUT.length() - 1) + spacesTailLOVER
                        + stars1.repeat((tailSize)));
                spacesOUT += " ";
                tailSize--;

            }
        }
        printText();
    }

    public static void drawDeadFish() {
        System.out.println();
        System.out.println("|\\    \\ \\ \\ \\ \\ \\ \\   ");
        System.out.println("|  \\    \\ \\ \\ \\ \\ \\ \\   | O~-_");
        System.out.println("|   >----|-|-|-|-|-|-|--|  __/");
        System.out.println("|   >----|-|-|-|-|-|-|--|  __/");
        System.out.println("|  /    / / / / / / /   |__\\");
        System.out.println("|/     / / / / / / /");
        System.out.println();
    }

    public static void printText() {
        System.out.println();
        System.out.println(ConsoleColors.RED_BOLD + ConsoleColors.GREEN_BACKGROUND
                + "Merry Christmas & Happy New Year. \nSending wishes your way for a great holiday season and a super fabulous year ahead!"
                + ConsoleColors.RESET);
        System.out.println();
    }

}
