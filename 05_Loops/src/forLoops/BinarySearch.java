/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package forLoops;

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
            case 3:
                System.out.print("Zadejte minimum: ");
                min = sc.nextInt();
                System.out.println("Minimum je nyní nastaveno na: " + min);
                break;
            case 4:
                System.out.print("Zadejte maximum: ");
                max = sc.nextInt();
                System.out.println("Maximum je nyní nastaveno na: " + max);
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
        System.out.format("Nyní je rozsah nastaven od %d do %d. \n", min, max);
        System.out.println("Vyber: ");
        System.out.println("1. Hádá uživatel.");
        System.out.println("2. Hádaá počítač.");
        System.out.println("3. Volba minima.");
        System.out.println("4. Volba maxima.");
        System.out.println("0. Konec.");
    }

}
