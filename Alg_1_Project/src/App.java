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
                    } else {
                        System.out.println("Sekvence nenalezena");
                    }

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
            return -1;
        }
        return Collections.indexOfSubList(Arrays.asList(source), Arrays.asList(pattern));
    }

    public static Integer[] loadSequence() {
        ArrayList<Integer> orderList = new ArrayList<>();
        int number;
        do {
            number = sc.nextInt();
            orderList.add(number);
        } while (number > -1);
        int index = orderList.size() - 1;
        orderList.remove(index);
        Integer[] order = new Integer[orderList.size()];
        order = orderList.toArray(order);
        return order;
    }

    public static void printArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
