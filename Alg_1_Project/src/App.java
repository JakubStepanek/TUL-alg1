import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class App {
    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // showMenu();
        // drawFish();

        test();
    }

    private static void test() {
        int N = 7;
        drawFish(N);
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

    private static void christmasEvent() {
        System.out.println("Christmas time began.");

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
    }

    public static void drawFish(int size) {

        String spacesOUT = "", spacesIN = "", stars1 = "*", stars2 = "*";

        for (int i = 0; i < size; ++i) {
            spacesOUT += " ";
        }

        for (int i = 0; i < 2 * size + 1; ++i) {

            // For upper part
            if (i < size) {
                System.out.print(spacesOUT + stars1 + spacesIN + stars1 + spacesOUT
                        + spacesOUT.substring(0, spacesOUT.length() - 1) + stars1.repeat(i));
                System.out.println();
                spacesOUT = spacesOUT.substring(0, spacesOUT.length() - 1);
                spacesIN += "  ";

            }

            // For middle part
            if (i == size) {
                System.out.println(spacesOUT + stars1 + spacesIN + stars2.repeat(size));
            }

            // For lower part

            if (i > size) {
                spacesOUT += " ";
                spacesIN = spacesIN.substring(0, spacesIN.length() - 2);
                System.out.println(spacesOUT + stars1 + spacesIN + stars1);

            }
        }

    }

}
