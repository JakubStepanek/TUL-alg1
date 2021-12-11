package domaci_ulohy;

import java.util.Scanner;

public class BarvaPole {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String color;
            while (sc.hasNextInt()) {
            int x = sc.nextInt();
                if (x < 0) {
                    break;
                } else {
            int y = sc.nextInt();
                   if ((x % 2 == 0)) {
                        if (y % 2 == 0) {
                            color = "BILA";
                        } else {
                            color = "CERNA";
                        }
                    } else {
                        if (y % 2 == 0) {
                            color = "CERNA";
                        } else {
                            color = "BILA";
                        }

                    }
                    System.out.println(color);
                }
            }
        }
    }

}