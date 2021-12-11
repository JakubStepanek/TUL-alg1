package domaci_ulohy;

import java.util.Locale;
import java.util.Scanner;

public class PoctyBodu {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfVectors = sc.nextInt();
        int quadrant1 = 0, quadrant2 = 0, quadrant3 = 0, quadrant4 = 0;
        for (int i = 0; i < countOfVectors; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (x >= 0 && y >= 0) {
                quadrant1++;
            }
            if (x <0 && y >= 0) {
                quadrant2++;
            }
            if (x <= 0 && y < 0) {
                quadrant3++;
            }
            if (x > 0 && y < 0) {
                quadrant4++;
            }
        }
        System.out.println(String.format(Locale.US, "%d %d %d %d", quadrant1, quadrant2, quadrant3, quadrant4));
    }

}