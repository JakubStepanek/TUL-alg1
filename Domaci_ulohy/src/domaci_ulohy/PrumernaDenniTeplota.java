package domaci_ulohy;

import java.util.Scanner;
import java.util.Locale;

public class PrumernaDenniTeplota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        float firstMeassure = sc.nextFloat();
        float secondMeassure = sc.nextFloat();
        float thirdMeassure = sc.nextFloat();

        float prumernaTeplota = (firstMeassure + secondMeassure + thirdMeassure + thirdMeassure) / 4;

        System.out.format(Locale.US, "%1.2f", prumernaTeplota);
    }
}
