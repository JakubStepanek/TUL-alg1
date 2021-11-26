/*
 *
 * @author kubin
 */

package domaci_ulohy;

import java.util.Locale;
import java.util.Scanner;

public class VypisRealneCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.GERMAN);
        System.out.println("zadejčíslo");
        float inputNumber = sc.nextFloat();
        System.out.format(Locale.GERMAN, "%10.3f", inputNumber);
    }
}
