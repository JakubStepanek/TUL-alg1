package domaci_ulohy;

import java.util.Scanner;
/*
*
* @author kubin
*/

public class CtyriCisla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfInputs = sc.nextInt();
        for (int i = 0; i < countOfInputs; i++) {
            int firstInput = sc.nextInt();
            int secondInput = sc.nextInt();
            int thirdInput = sc.nextInt();
            int fourthInput = sc.nextInt();
            int low1, high1, low2, high2, lowest, middle1, middle2, highest;

            if (firstInput < secondInput) {
                low1 = firstInput;
                high1 = secondInput;
            } else {
                low1 = secondInput;
                high1 = firstInput;
            }
            if (thirdInput < fourthInput) {
                low2 = thirdInput;
                high2 = fourthInput;
            } else {
                low2 = fourthInput;
                high2 = thirdInput;
            }
            if (low1 < low2) {
                lowest = low1;
                middle1 = low2;
            } else {
                lowest = low2;
                middle1 = low1;
            }
            if (high1 > high2) {
                highest = high1;
                middle2 = high2;
            } else {
                highest = high2;
                middle2 = high1;
            }
            if (middle1 < middle2) {
                System.out.format("%d %d %d %d\n", lowest, middle1, middle2, highest);
            } else {

                System.out.format("%d %d %d %d\n", lowest, middle2, middle1, highest);
            }
        }
    }
}