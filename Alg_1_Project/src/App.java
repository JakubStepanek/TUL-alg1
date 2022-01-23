import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        showMenu();
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        String key;
        do {
        key = sc.nextLine().toLowerCase();
            switch (key) {
                case "1":
                    DrawFish.main(args);
                    showMenu();
                    break;
                case "2":
                    FindPatternInSequence.startProgram();
                    showMenu();
                    break;
                case "0":
                    System.out.println("Program se ukoncuje...");
                    end = true;
                    break;
                default:
                    System.out.println("Chybna volba, prosim, opakujte.");
                    break;
            }
        } while (!end);
    }

    public static void showMenu() {
        System.out.println("1. Vykresli rybu:");
        System.out.println("2  Obsahuje posloupnost druhou posloupnost:");
        System.out.println("0. Konec:");
        System.out.print("Vase volba: ");
    }
}
