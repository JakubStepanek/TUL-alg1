package domaci_ulohy;

import java.util.Scanner;

public class Maxima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt(), number, max1, max2, max3, max4, max1Counter, max2Counter, max3Counter,
                max4Counter;
        for (int i = 0; i < counter; i++) {
            max1Counter = 0;
            max2Counter = 0;
            max3Counter = 0;
            max4Counter = 0;
            max1 = Integer.MIN_VALUE;
            max2 = Integer.MIN_VALUE;
            max3 = Integer.MIN_VALUE;
            max4 = Integer.MIN_VALUE;

            do {
                number = sc.nextInt();
                if (number >= max1) {
                    if (number == max1) {
                        max1Counter++;
                    } else {
                        max4 = max3;
                        max4Counter = max3Counter;
                        max3 = max2;
                        max3Counter = max2Counter;
                        max2 = max1;
                        max2Counter = max1Counter;
                        max1 = number;
                        max1Counter = 1;
                    }
                } else if (number >= max2) {
                    if (number == max2) {
                        max2Counter++;
                    } else {
                        max4 = max3;
                        max4Counter = max3Counter;
                        max3 = max2;
                        max3Counter = max2Counter;
                        max2 = number;
                        max2Counter = 1;
                    }
                } else if (number >= max3) {
                    if (number == max3) {
                        max3Counter++;
                    } else {
                        max4 = max3;
                        max4Counter = max3Counter;
                        max3 = number;
                        max3Counter = 1;
                    }
                } else if (number >= max4) {
                    if (number == max4) {
                        max4Counter++;
                    } else {
                        max4Counter = 1;
                    }
                    max4 = number;
                }
            } while (number > 0);
            System.out.printf("%d %d\n", max1, max1Counter);
            System.out.printf("%d %d\n", max2, max2Counter);
            System.out.printf("%d %d\n", max3, max3Counter);
            System.out.printf("%d %d\n", max4, max4Counter);

        }

    }
}// 8 12 4 16 9 17 16 15 8 8 16 12 18 1 16 3 5 17 6 13 3 5 6 18 12 6 13 10 9 3 1
 // 9 9 1 13 16 8 2 4 1 5 11 13 -2