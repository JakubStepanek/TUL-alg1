package domaci_ulohy;

import java.util.Arrays;
import java.util.Scanner;

public class StejnaData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt(), size, size2;
        for (int i = 0; i < counter; i++) {
            size = sc.nextInt();
            int[] a = new int [size];
            for (int j = 0; j < a.length; j++) {
                a[j]=sc.nextInt();
            }
            size2 = sc.nextInt();
            int[] b = new int [size2];
            for (int j = 0; j < b.length; j++) {
                b[j] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            System.out.println(Arrays.equals(a, b)? 1 : 0);
        }
    }

}