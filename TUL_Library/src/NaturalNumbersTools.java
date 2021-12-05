
public class NaturalNumbersTools {
    /**
     * Tests if number is Prime
     * 
     * @param number positive int number
     * @return true if given number is prime
     * @throws IllegalArgumentException if the given number is lower than 0
     */
    public static boolean isPrime(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Pro nekladná čísla nelze určit prvočíselnost");
        }
        if (number == 1) {
            return false;
        }
        int a = 2;
        int limit = (int) Math.sqrt(number);
        while (a <= limit) {
            if (number % a == 0) {
                return false;
            }
            a++;
        }
        return true;
    }

    public static String factors(int number) {
        String factor = "1";
        int i = 2;
        while (i <= (number / 2)) {

            if ((number % i) == 0) {
                factor = String.format("%s, %d", factor, i);
            }
            i++;
        }
        factor = String.format("%s, %d", factor, number);

        return factor;
    }
}
