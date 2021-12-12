import java.util.Scanner;

public class App {
    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        showMenu();
        drawFish();
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

    private static void drawFish(int size) {

    }

}
