import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadej n");
        int n = sc.nextInt();
        int[] result = generatePermutation(n);
        System.out.println("Zde je náhodná permutace");
        print(result);
    }

    private static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] generatePermutation(int n) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        Random r = new Random();
        int temp;
        for (int i = a.length - 1; i > 0; i--) {
            temp = a[r.nextInt(i)];
            int x = a[i];
            a[i]= a[temp];
            a[temp] = x;
        }
        return a;
    }
}
