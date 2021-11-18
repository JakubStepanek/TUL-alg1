/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forLoops;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;
import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 *
 * @author kubin
 */
public class BinarySearch {
    static Scanner sc = new Scanner(System.in);
    static int min = 1;
    static int max = 100;

    public static void main(String[] args) {
        boolean end = false;
        do {
            displayMenu();
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                GuessingNumberVariants.userGuesses();
                break;
            case 2:
                GuessingNumberVariants.computerGuesses();
                break;
            case 0:
                System.out.println("Konec");
                end = true;
                break;
            default:
                System.out.println("Neplatná volba!");
                break;
            }
        } while (!end);
    }

    private static void displayMenu() {
        System.out.println("Vyber: ");
        System.out.println("1. Hádá uživatel");
        System.out.println("2. Hádaá počítač");
        System.out.println("0. Konec");
    }

}
