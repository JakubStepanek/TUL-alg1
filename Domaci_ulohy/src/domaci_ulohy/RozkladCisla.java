package domaci_ulohy;
//package domaci_ulohy;

import java.util.Scanner;

public class RozkladCisla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (sc.hasNextInt()) {
            number = sc.nextInt();
            if (number > 0) {
                String factor = "";
                int i = 2;
                while (i <= number) {
                    while (number % i == 0) {
                        factor = String.format("%s%d ", factor, i);
                        number /= i;
                    }
                    i++;
                }
                System.out.println(factor);
            } else {
                break;
            }

        }

    }
}