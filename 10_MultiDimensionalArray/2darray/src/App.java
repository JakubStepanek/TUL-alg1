import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean end = false;
        int choice;
        do {
            displayMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sum();
                    break;
                case 2:
                    multiply();
                    break;
                case 3:
                    //();
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    System.out.println("Illegal input!");
                    break;
            }
        } while (!end);
    }

    public static void displayMenu() {
        System.out.println("1. Součet matic");
        System.out.println("2. Součin matic");
        System.out.println("3. Znormování matice");
        System.out.println("0. Konec");
    }

    public static void sum() {
        double[][] a = loadMatrix();
        print(a);
        double[][] b = loadMatrix();
        print(b);
        double[][] c = MatrixTools.sum(a, b);
        print(c);
    }

    public static void multiply() {
        double[][] a = loadMatrix();
        print(a);
        double[][] b = loadMatrix();
        print(b);

    }

    public static double[][] loadMatrix() {
        System.out.println("zadej rozmery matice");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double[][] res = new double[m][n];
        System.out.println("zadej prvky matice");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = sc.nextDouble();
            }
        }
        return res;
    }

    public static void print(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%6.2f ", a[i][j]);
            }
            System.out.println();
        }
    }
}
