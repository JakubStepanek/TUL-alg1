import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void test() {
        // printArray(loadSequence());
        // int index = findSequence(loadSequence(), loadSequence());
        // if (index >= 0) {
        // System.out.format("Sekvence nalezena na pozici %d", index);
        // } else {
        // System.out.println("Sekvence nenalezena");
        // }
    }

    public static void main(String[] args) {
        // test();
        boolean end = false;
        String answer;
        do {
            System.out.println("Pokracovat ve zpracovani? (a/n):");
            answer = sc.nextLine().toLowerCase();
            switch (answer) {
                case "a":
                    System.out.println("Zadej posloupnost:");
                    Integer[] source = loadSequence();
                    System.out.println("Hledana sekvence:");
                    Integer[] pattern = loadSequence();
                    int pozition = findSequence(source, pattern);
                    if (pozition >= 0) {
                        System.out.format("Sekvence nalezena na pozici %d\n", pozition);
                        System.out.println();
                    } else {
                        System.out.println("Sekvence nenalezena\n");
                    }
                    // clear scanner buffer
                    sc.nextLine();
                    break;
                case "n":
                    end = true;
                    break;
                default:
                    System.out.println("Zadejte pouze (a/n):");
                    break;
            }
        } while (!end);
    }

    private static int findSequence(Integer[] source, Integer[] pattern) {
        if (source.length < pattern.length) {
            // "-1" stands for no sequence
            return -1;
        }
        return Collections.indexOfSubList(Arrays.asList(source), Arrays.asList(pattern));
    }

    public static Integer[] loadSequence() {
        // ArrayList do not need to have size parameter on create
        ArrayList<Integer> orderList = new ArrayList<>();
        int number = 0;

        do {
            // validation when user input is not a number
            while (!sc.hasNextInt()) {
                System.out.println(ConsoleColors.RED + "Zadavejte pouze cela cisla!" + ConsoleColors.RESET);
                sc.next();
            }
            // fill ArrayList with input numbers
            number = sc.nextInt();
            orderList.add(number);
        } while (number > -1);

        int lastPos = orderList.size() - 1;
        orderList.remove(lastPos);
        // create new Array of integers with size of ArrayList
        Integer[] order = new Integer[orderList.size()];
        // copy values of ArrayList to the Array via toArray method
        order = orderList.toArray(order);

        return order;
    }
/**
 * 
 * @JakubStepanek
 * @param array
 */
    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
