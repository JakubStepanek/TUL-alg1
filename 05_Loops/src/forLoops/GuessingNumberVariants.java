/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forLoops;

import java.util.concurrent.ThreadLocalRandom;

import com.sun.tools.javac.Main;

public class GuessingNumberVariants {
    static void computerGuesses() {
        System.out.println("tady hádá pc");
        // rozsah BinarySearch.min/max
        // mid = (min+max)/2
        // while (numberByUser != mid)
        // if numberByUser < mid
        // max = mid
        // else if numberByUser > mid
        // min = mid
        // else numberByUser = mid
        System.out.println("Mysli si číslo v rozsahu od " + BinarySearch.min + " do " + BinarySearch.max);
        boolean guessed = false;

        int max = BinarySearch.max;
        int min = BinarySearch.min;

        while (!guessed) {
            int mid = (max + min) / 2;
            System.out.format("Je tvoje číslo %d ? \n", mid);
            System.out.println("1. Moje číslo je VĚTŠÍ.");
            System.out.println("2. Moje číslo je MENŠÍ.");
            System.out.println("3. Je to moje číslo.");
            int choice = BinarySearch.sc.nextInt();
            switch (choice) {
            case 1:
                min = mid;
                break;
            case 2:
                max = mid;
                break;
            case 3:
                System.out.println("Tvoje číslo je: "+mid);
                guessed = true;
                break;

            default:
                System.out.println("Neplatná volba!");
                break;
            }
        }

    }

    static void userGuesses() {
        System.out.println("tady hádám já");
        // number = generate random number from interval
        // guess = load number
        // compare = guess <> number
        // res = >||<||=
        // while(guess!=number)
        int number = generateRandom(BinarySearch.min, BinarySearch.max);
        boolean win = false;
        int guess;
        System.out.println("Zadej číslo od " + BinarySearch.min + " do " + BinarySearch.max);
        while (!win) {
            guess = BinarySearch.sc.nextInt();
            if (number > guess) {
                System.out.println("Myšlené číslo je větší.");
            } else if (number < guess) {
                System.out.println("Myšlené číslo je menší.");

            } else {
                System.out.println("Gratuluji, uhodl jsi");
                win = true;
            }
        }
    }

    private static int generateRandom(int min, int max) {
        int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNumber;
    }

    public static void main(String[] args) {
        // System.out.println(generateRandom(10, 20));
        //computerGuesses();

    }
}
