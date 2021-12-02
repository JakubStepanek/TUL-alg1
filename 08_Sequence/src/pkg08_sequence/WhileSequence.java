package pkg08_sequence;

import java.util.Scanner;

public class WhileSequence {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Zadavej čísla, ukonči 0 nebo záporným: ");
        int number;
        int previousNumber = 0;
        boolean sorted = true;
        while ((number = sc.nextInt()) > 0) {
            if (sorted) {
                if (number < previousNumber) {
                    sorted = false;
                }
                previousNumber = number;
            }
        }
        System.out.println("Posloupnost " + (sorted ? "je " : "není ") + "setříděná!");
    }

}
