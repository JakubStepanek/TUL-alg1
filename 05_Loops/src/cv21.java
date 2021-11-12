/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kubin
 */
public class cv21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IN
        int number = 12;
        String factor = "1";

        // CODE
        int i = 2;
        while (i <= (number/2)) {
            
            if ((number % i) == 0) {
                factor = String.format("%s, %d", factor, i);
            }
            i++;
        }
        factor = String.format("%s, %d", factor, number);

        // OUT
        System.out.println(factor);
    }

}
