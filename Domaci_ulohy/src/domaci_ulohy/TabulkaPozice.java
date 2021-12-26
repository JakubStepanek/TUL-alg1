/*
 *
 * @author kubin
 */

package domaci_ulohy;

import java.util.Scanner;

public class TabulkaPozice {
    public static void main(String[] args) {
        // System.out.println("zadej velikost a číslo");
        Scanner sc = new Scanner(System.in);
        double xCount = sc.nextInt();
        double yCount = sc.nextInt();
        double index = sc.nextInt();

        int row = (int) Math.ceil(index / yCount);
        int column = (int) (index % yCount);
        if (column == 0) {
            column = (int) yCount;
        }
        // System.out.println(row);
        // System.out.println(column);
        System.out.format("%d %d", row, column);
    }
}
