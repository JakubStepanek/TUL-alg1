package domaci_ulohy;

import java.util.Scanner;

public class PrevodSekund {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sekundy = 3786;// sc.nextInt();
        int h, m, s;
        h = sekundy / 3600;
        m = (sekundy % 3600) / 60;
        s = (sekundy % 3600) % 60;
        System.out.format("%02d:%02d:%02d", h, m, s);

    }

}