import java.rmi.ConnectIOException;
import java.util.Scanner;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import javax.swing.JSpinner.NumberEditor;

public class Pocet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt(), firstNumber, firstNumberDivisors, number, numberDivisors, allDivisors;
        for (int i = 0; i < counter; i++) {
            firstNumber = sc.nextInt();
            firstNumberDivisors = 0;
            allDivisors = 0;
            for (int j = 2; j < firstNumber; j++) {
                if (firstNumber % j == 0) {
                    firstNumberDivisors++;
                }
            }
            do {
                number = sc.nextInt();
                if (number > 0) {
                    numberDivisors = 0;
                    for (int j = 2; j < number; j++) {
                        if (number % j == 0) {
                            numberDivisors++;
                        }
                    }
                    if (numberDivisors == firstNumberDivisors) {
                        allDivisors++;
                    }
                }
            } while (number > 0);
            System.out.println(allDivisors);
        }
    }
}