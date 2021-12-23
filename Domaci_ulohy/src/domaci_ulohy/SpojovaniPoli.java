package domaci_ulohy;

import java.util.Arrays;
import java.util.Scanner;

public class SpojovaniPoli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aSize, bSize;
        do {
            aSize = sc.nextInt();
            if (aSize > 0) {
                int[] a = new int[aSize];
                for (int i = 0; i < a.length; i++) {
                    a[i] = sc.nextInt();
                }
                bSize = sc.nextInt();
                int[] b = new int[bSize];
                for (int i = 0; i < b.length; i++) {
                    b[i] = sc.nextInt();
                }
                int[] c = new int[(aSize + bSize)];
                for (int i = 0; i < a.length; i++) {
                    c[i] = a[i];
                }
                for (int i = 0; i < b.length; i++) {
                    c[i + aSize] = b[i];
                }
                Arrays.sort(c);
                for (int i = 0; i < c.length; i++) {
                    System.out.print(c[i] + " ");
                }
                System.out.println();
            }
        } while (aSize > 0);
    }
}