/*
 *
 * @author kubin
 */

package domaci_ulohy;

import java.util.Scanner;

public class TabulkaPozice {
    public static void main(String[] args) {
        System.out.println("zadej velikost a číslo");
        Scanner sc = new Scanner(System.in);
        int xNumber = 4;// sc.nextInt();
        int yNumber = 6;// sc.nextInt();
        int inputNumber = 17;// sc.nextInt();

        int xPos = (inputNumber / yNumber) + 1;
        int yPos = inputNumber / xNumber + 1;

        System.out.println(xPos);
        System.out.println(yPos);
    }
}
