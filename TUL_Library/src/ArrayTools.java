import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * ArrayTools
 */
public class ArrayTools {

    /**
     * Prints array
     * 
     * 
     * @param array
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Fills array from input by number from input
     * 
     * @param array
     * @param number
     */
    public static void fillWith(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

    /**
     * Creates array by n and fills with number from input
     * 
     * @param n
     * @param number
     * @return
     */
    public static int[] fillWith(int n, int number) {
        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = number;
        }
        return b;
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int multiplyArray(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        return product;
    }

    public static int[] kumSum(int[] array) {
        int[] b = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            b[i] = sum;
        }
        return b;
    }

    public static int maxInArray(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int minInArray(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;

    }

    public static int posOfFirstMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) { // <= for last pos
                max = array[i];
                pos = i + 1;
            }
        }
        return pos;
    }

    public static int posOfFirstMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) { // >= for last pos
                min = array[i];
                pos = i + 1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        //int[] a = { 1, 2, 3, 5, -1, -1, -1, -1, -1, -1, -1 };
        //printArray(a);
        int[] c = { 200, -50, 30 };
        printArray(kumSum(c));
    }
}