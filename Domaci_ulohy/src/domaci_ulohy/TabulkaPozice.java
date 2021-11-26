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
        double xCount = 4;// sc.nextInt();
        double yCount = 6;// sc.nextInt();
        double index = 5;// sc.nextInt();

        int row = (int) Math.ceil(index / yCount);
        int column = (int) Math.ceil(index % yCount);

        System.out.println(row);
        System.out.println(column);
    }
}
