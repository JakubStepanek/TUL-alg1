import java.util.Arrays;

/**
 * ArrayTools
 */
public class ArrayTools {

    /**
     * Prints array
     * @param array
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



    /**
     * Fills array from input by number from input
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

    public static void main(String[] args) {
        int[] a = { 10, 12, 13, 15, 99 };
        printArray(a);

        fillWith(a, 2);
        printArray(a);
        System.out.println("");
        printArray(fillWith(10, 5));

    }
}