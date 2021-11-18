/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forLoops;

import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author kubin
 */
public class PlayingWithFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = 5;
        System.out.println("Line ");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println("");

        System.out.println("Square");
        for (int row = 1; row <= n; row++) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Rectangle");
        int countOfRows = 10;
        for (int row = 1; row <= countOfRows; row++) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
        }
        System.out.println();
        System.out.println("Triangle");
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Better Triangle");
        for (int row = 1; row <= n; row++) {
            // Spaces
            for (int i = 1; i <= n - row; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= row; i++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
