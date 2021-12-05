/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package pkg08_sequence;
import java.util.Scanner;

import mylibraby.NumberTools;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Zadej počet čísel: ");
        int n = sc.nextInt();
        int number;
        double sum = 0;
        double max = -Double.MAX_VALUE;
        int maxPosition = 1;
        int countOfMax = 0;
        int nPrime = 0;
        System.out.print("Zadej čísla: ");
        for (int i = 1; i <= n; i++) {
            number = sc.nextInt();
            sum += number;
            // sum += sc.nextDouble();
            if (number == max) {
                countOfMax++;
            } else if (number > max) {
                max = number;
                maxPosition = i;
                countOfMax = 1;
            }
            if (NumberTools.isPrime(number)) {
                nPrime++;
            }
        }

        double average =  sum / n;
        System.out.format("Průměr čísel je: %.2f. \n", average);
        System.out.format("Největší číslo je: %.2f a stojí na %d. pozici.\n", max, maxPosition);
        System.out.format("Počet výskytů maxima je %d.\n", countOfMax);
        System.out.println("Počet prvočísel je: " + nPrime);
    }

}
