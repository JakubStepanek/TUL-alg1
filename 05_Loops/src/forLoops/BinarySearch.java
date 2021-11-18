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

    public static void main(String[] args) {
        boolean end = false;
        do {
            displayMenu();
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                userGuesses();
                break;
            case 2:
                computerGuesses();
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
    private static void computerGuesses(){
        
    }

    private static void userGuesses() {
    }

    private static void displayMenu() {
    }

}
