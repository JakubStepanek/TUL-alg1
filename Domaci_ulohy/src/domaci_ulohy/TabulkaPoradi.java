/*
*
*
* @author kubin
*/
package domaci_ulohy;

import java.util.Scanner;

public class TabulkaPoradi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xPos = sc.nextInt();
        int yPos = sc.nextInt();
        int rowIndex = sc.nextInt();
        int columnIndex = sc.nextInt();
        int indexOfTable = 1 + ((rowIndex - 1) * yPos + (columnIndex - 1));
        System.out.println(indexOfTable);
    }

}