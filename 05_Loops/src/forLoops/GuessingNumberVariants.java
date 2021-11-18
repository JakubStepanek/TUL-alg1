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
        System.out.println(generateRandom(10, 20));

    }
}
