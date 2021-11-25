package domaci_ulohy;
import java.util.Scanner;
public class EchoText {
    public static void main(String[] args) {
        System.out.print("Zadejte text: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(input);
        }
}
