import java.util.Scanner;

/**
 * 3. Program finds given pattern in given sequence
 *
 * @author JakubStepanek
 * @version 1.5.2 01/23/21
 */
public class FindPatternInSequence {
    public static Scanner sc = new Scanner(System.in);

    /**
     * Method just for testing
     */
    public static void test() {
        // printArray(loadSequence());
        // int index = findSequence(loadSequence(), loadSequence());
        // if (index >= 0) {
        // System.out.format("Sekvence nalezena na pozici %d", index);
        // } else {
        // System.out.println("Sekvence nenalezena");
        // }
        // printArray(loadSequence());
        // int[] source = { 1, 2, 3, 4, 5 };
        // int[] pattern = { 4 };
        // findSequence(source, pattern);
    }

    public static void main(String[] args) {
        // test();
        startProgram();
    }

    /**
     * Start menu for the program calls methods for loading array from user
     *
     * @JakubStepanek
     */
    public static void startProgram() {
        boolean end = false;
        String key = "a";
        do {
            switch (key) {
                case "a":
                    System.out.println("Zadejte posloupnost:");
                    int[] source = loadSequence();
                    System.out.println("Hledana sekvence:");
                    int[] pattern = loadSequence();
                    userOutput(source, pattern);
                    break;
                case "n":
                    end = true;
                    break;
                default:
                    System.out.println(ConsoleColors.RED + "Chybna volba" + ConsoleColors.RESET);
                    break;
            }
            if (!end) {
                System.out.println("Pokracovat ve zpracovani? (a/n):");
                key = sc.nextLine().toLowerCase();
            }
        } while (!end);
    }

    /**
     * Loads and storage all numbers from Scanner. This method returns the loaded
     * sequence as an array.
     *
     * @JakubStepanek
     * @return
     */
    public static int[] loadSequence() {
        // starting sequence is 5 size
        int[] sequence = new int[5];
        int number, countOfInerations = 0;
        do {
            do {
                // input validation
                while (!sc.hasNextInt()) {
                    System.out.println(ConsoleColors.RED + "Zadavejte pouze cela cisla!" + ConsoleColors.RESET);
                    System.out.println("Zatim nactena sekvence: ");
                    printArray(sequence, countOfInerations);
                    sc.nextLine();
                }
                // resizeable array
                if (countOfInerations == sequence.length - 2) {
                    sequence = realocateArray(sequence);
                }
                number = sc.nextInt();
                // eliminate last element of array
                if (number > -1) {
                    sequence[countOfInerations] = number;
                }
                countOfInerations++;
            } while (number > -1);
        } while (sequence.length == 0);
        // create new array of user input size and copy elements from method array into
        int[] outputSequence = new int[countOfInerations - 1];
        for (int j = 0; j < outputSequence.length; j++) {
            outputSequence[j] = sequence[j];
        }
        return outputSequence;
    }

    /**
     * Method checks two input array and finds if second (pattern) array is included
     * in first (source) array
     *
     * @JakubStepanek
     * @param source
     * @param pattern
     * @return index of poziton of first number in sequence or -1 if there is no
     *         number usible, also -10 if source is shorter than pattern
     */
    private static int findSequence(int[] source, int[] pattern) {
        if (source.length < pattern.length) {
            // "ERROR CODE -10" stands for pattern is longer than source
            return -10;
        }
        if (source.length == 0 && pattern.length == 0) {
            return 0;
        }
        int limit;
        if (source.length - pattern.length == 0) {
            limit = source.length;
        } else {
            limit = source.length - pattern.length;
        }

        // if user tries to find sequence of size 1
        if (limit == source.length - 1) {
            for (int i = 0; i < source.length; i++) {
                if (source[i] == pattern[0]) {
                    return i;
                }
            }
        }

        boolean subArrayFound = false;
        for (int i = 0; i < limit; i++) {
            if (pattern[0] == source[i]) {
                subArrayFound = true;
                for (int j = 1; j < pattern.length; j++) {
                    System.err.println(source[i + j]);
                    System.out.println(pattern[j]);
                    if (source[i + j] != pattern[j]) {
                        subArrayFound = false;
                        break;
                    }
                }
                if (subArrayFound) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Method prints output if there is pattern in sequence or not
     *
     * @author JakubStepanek
     * @param source
     * @param pattern
     */
    public static void userOutput(int[] source, int[] pattern) {
        int position = findSequence(source, pattern);
        if (position >= 0) {
            System.out.format("Sekvence nalezena na pozici %d%n", position + 1);
            // method.findSequence gives back index not position
            System.out.println();
        } else if (position == -10) {
            System.out.println("Hledana sekvence je delsi, nez vychozi\n");
            System.out.println();
        } else {
            System.out.println("Hledana sekvence nenalezena");
            System.out.println();
        }
        // clear scanner buffer
        sc.nextLine();
    }

    /**
     * Method gets array from input and creates new one which is given back
     *
     * @param array
     * @return
     */

    public static int[] realocateArray(int[] array) {
        int[] biggerArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            biggerArray[i] = array[i];
        }
        return biggerArray;
    }

    /**
     * Method for print array edited for not showing zeros on the end
     *
     * @param array
     * @param size
     */
    public static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
