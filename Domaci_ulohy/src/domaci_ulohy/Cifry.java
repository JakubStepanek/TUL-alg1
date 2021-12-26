package domaci_ulohy;

import java.util.Scanner;

public class Cifry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number;

        while (sc.hasNextLong()) {
            number = sc.nextLong();
            if (number > 0) {
                long sum = 0;
                long product = 1;
                long n = number;
                while (n != 0) {
                    product = product * (n % 10);
                    n = n / 10;
                }
                for (sum = 0; number != 0; number = number / 10) {
                    sum = sum + number % 10;
                }
                System.out.print(sum + " ");
                System.out.println(product);
            } else {
                break;
            }
        }
    }

}
