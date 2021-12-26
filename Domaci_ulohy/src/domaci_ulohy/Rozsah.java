package domaci_ulohy;

import java.util.Arrays;
import java.util.Scanner;

public class Rozsah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min, count;

        while (sc.hasNextInt()) {
            count = sc.nextInt();
            if (count >= 0) {
                int[] numbers = new int[count];
                for (int i = 0; i < count; i++) {
                    numbers[i] = sc.nextInt();
                }
                Arrays.sort(numbers);
                min = numbers[0];
                max = numbers[count - 1];
                System.out.printf("%d %d\n", min, max);
            } else {
                break;
            }
        }
    }

}
