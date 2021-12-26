import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class AhojLoop {
    public static void main(String[] args) throws Exception {
      /*  int i = 0;
        while (i < 20){
            System.out.println("ahoj");
            System.out.println(i);
            i++;
        */
        Scanner sc = new Scanner(System.in);
        while(sc.nextInt() == 0){
            System.out.print("Ahoj");
        }
        int i = 0;
        while( i < 5){
            System.out.println((i+1) + " Ahoj");
            i++;
        }

        }
        }

