/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author kubin
 */
public class cv28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IN
        Scanner sc = new Scanner(System.in);
        char answer = 'a';
        while(answer == 'a'){
        System.out.print("Zadej kladné číslo: ");
        int number = sc.nextInt();
        boolean perfect;
        int factor = 0;

        //CODE
        int i = 1;
        while (i <= (number/2)) {
            
            if ((number % i) == 0) {
                factor += i;
            }
            i++;
        }
        perfect = (factor == number);
        //OUT
        System.out.format("Číslo %d %s dokonalé číslo. \n", number, perfect ? "je" :" není");
        System.out.println("Přejete si pokračovat? a/n, A/N");
        answer = sc.next().toLowerCase().charAt(0);
    }
    }    
}
