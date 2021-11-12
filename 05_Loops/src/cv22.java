import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kubin
 */
public class cv22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IN
        Scanner sc = new Scanner(System.in);
        char answer = 'a';
        do {
            System.out.print("Zadejte číslo: ");
            int number = sc.nextInt();
            boolean prime;
            int factor = 0;
            // CODE
            if (number <= 1) {
                prime = false;

            } else {
                int i = 2;
                while (i <= (number / 2)) {

                    if ((number % i) == 0) {
                        factor += i;
                    }
                    i++;

                }
                prime = (factor == 0);
            }
            // OUT
            String result = prime ? "je" : "není";
            System.out.format("Číslo %d %s prvočíslo. \n", number, result);

            System.out.println("Přejete si pokračovat? a/n A/N");
            answer = sc.next().toLowerCase().charAt(0);

        } while (answer == 'a');

    }

}
