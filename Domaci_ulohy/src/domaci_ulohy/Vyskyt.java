package domaci_ulohy;

import java.util.Scanner;

public class Vyskyt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        boolean hasSequence;
        for (int i = 0; i < counter; i++) {
            hasSequence = false;
            int[] pattern = new int[2];
            for (int j = 0; j < pattern.length; j++) {
                pattern[j] = sc.nextInt();
            }
            int sourceSize = sc.nextInt();
            int[] source = new int[sourceSize];
            for (int j = 0; j < source.length; j++) {
                source[j] = sc.nextInt();
            }
            if (pattern.length <= source.length) {
                for (int j = 0; j < source.length - 1; j++) {
                    if (source[j] != source.length - 1) {
                        if (source[j] == pattern[0]) {
                            if (source[j + 1] == pattern[1]) {
                                hasSequence = true;
                            }
                        }
                    }
                }
            }
            System.out.println(hasSequence);
        }
    }
}
