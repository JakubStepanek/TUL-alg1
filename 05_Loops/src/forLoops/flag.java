/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forLoops;

import java.util.Scanner;

import javax.swing.event.AncestorEvent;

/**
 *
 * @author kubin
 */
public class flag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer = 'a';
        do {
            System.out.println("Vykresli si nádhernou vlajku: ");
            System.out.print("Zadej rozměr v poměru 2:3 ");

            int countOfRows = sc.nextInt();
            int countOfColumns = sc.nextInt();
            for (int i = 1; i <= countOfRows / 2; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                for (int k = 1; k <= countOfColumns - i; k++) {
                    System.out.print("@ ");
                }
                System.out.println();
            }
            for (int i = 1; i <= countOfColumns; i++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int i = countOfRows / 2; i <= countOfRows - 1; i++) {
                for (int j = i + 1; j <= countOfRows; j++) {
                    System.out.print("* ");
                }
                for (int k = countOfColumns / 2; k < countOfColumns + i - (countOfRows / 4); k++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
            System.out.println("Přejete si pokračovat? a/n");
            answer = sc.next().toLowerCase().charAt(0);

        } while (answer == 'a');
    }

}
