import java.util.Scanner;

/**
 * 3. Program finds given pattern in given sequence
 * 
 * @author JakubStepanek
 * @version 1.5.2 01/14/21
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
    }

    public static void main(String[] args) {
        // test();
        startMenu();
    }

    /**
     * Start menu for the program calls methods for loading array from user
     * 
     * @JakubStepanek
     */
    public static void startMenu() {
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
     * From input paramaters checks if pattern is subarray of source
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
        int limit = source.length - pattern.length;
        if (limit == source.length - 1) {
            return source.length - 1;
        }
        if (limit <= 1) {
            if (pattern[0] == source[0]) {
                return 0;
            }
        }
        for (int i = 0; i <= limit; i++) {
            if (pattern[0] == source[i]) {
                boolean subArrayFound = true;
                for (int j = 1; j <= pattern.length; j++) {
                    if (pattern[j] != source[i + j]) {
                        subArrayFound = false;
                        break;
                    }
                    if (subArrayFound) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /**
     * Method prints if there is pattern in sequence or not
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
     * Loads and storage all numbers from Scanner
     * 
     * @JakubStepanek
     * @return
     */
    public static int[] loadSequence() {
        int[] sequence = new int[5];
        int number, i = 0;
        do {
            do {
                // input validation
                while (!sc.hasNextInt()) {
                    System.out.println(ConsoleColors.RED + "Zadavejte pouze cela cisla!" + ConsoleColors.RESET);
                    System.out.println("Zatim nactena sekvence: ");
                    printArray(sequence);
                    sc.nextLine();
                }
                // resizeable array
                if (i == sequence.length - 2) {
                    sequence = realocateArray(sequence);
                }
                number = sc.nextInt();
                // eliminate last element of array
                if (number > -1) {
                    sequence[i] = number;
                }
                i++;
            } while (number > -1);
        } while (sequence.length == 0);
        // create new array of user input size and copy elements from method array into
        int[] outputSequence = new int[i - 1];
        for (int j = 0; j < outputSequence.length; j++) {
            outputSequence[j] = sequence[j];
        }
        return outputSequence;
    }

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
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print(array[j] + " ");
                }
                break;
            }
        }
    }
}
