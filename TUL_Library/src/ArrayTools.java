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
        int i;
        for (i = 0; i < array.length; i++) {
            if (min > array[i]) { // >= for last pos
                return i;
            }
        }
        return i + 1;
    }

    public static int lastValue(int[] array, int number) {
        for (int i = array.length - 1; i >= 0; i--) {
            return i;
        }
        return -1;
    }

    public static void reverse(int[] array) {
        int n;
        for (int i = 0; i < array.length / 2; i++) {
            n = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = n;
        }
    }

    public static int[] reverseArray(int[] array) {
        int[] n = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            n[i] = array[array.length - 1 - i];
        }
        return n;
    }

    public static void main(String[] args) {
        // int[] a = { 1, 2, 3, 5, -1, -1, -1, -1, -1, -1, -1 };

        // int[] c = { 200, -50, 30 };
        // printArray(kumSum(c));
        // System.out.println(posOfFirstMin(c));

        // int[] x = { 1, 2, 3, 4 };
        // reverse(x);
        // printArray(x);
        // System.out.println();
        // printArray(reverseArray(x));
    }
}