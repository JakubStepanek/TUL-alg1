package domaci_ulohy;

import java.math.BigInteger;
import java.util.Scanner;

public class DelitelNasobek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = 1, lcm = 1;
        int a, b, aLCM, bLCM;

        while (sc.hasNextInt()) {
            a = sc.nextInt();
            if (a > 0) {
                b = sc.nextInt();
                lcm = (a > b) ? a : b;
                aLCM = a;
                bLCM = b;
                for (int i = 1; i <= a && i <= b; i++) {
                    if (a % i == 0 && b % i == 0)
                        divisor = i;
                }
            } else {
                break;
            }
            System.out.print(divisor + " ");
            while (true) {
                if (lcm % a == 0 && lcm % b == 0) {
                    break;
                } else {
                    lcm++;
                }
            }
            System.out.println(lcm);

        }
    }
}