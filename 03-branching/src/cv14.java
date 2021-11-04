
import java.util.Calendar;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author kubin
 */
public class cv14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IN
        //Input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Chcete-li zjistit, zda byl rok přestupný?");
        System.out.print("Zadejte rok: ");
        int yearByUser = sc.nextInt();
        //const for current year to decide wether year by user was/is/will
        final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        boolean leap = false;

        // CODE
        // is year leap ? 
        leap = (yearByUser % 4 != 0) ? false : (yearByUser % 400 == 0) ? true : (yearByUser % 100 != 0);
        

        // OUT
        System.out.println(String.format("Rok %d %s přestupný!", yearByUser , leap ? "je":"není"));


    }
}

/*
 * if (yearByUser % 4 != 0) { leap = false; } else if (yearByUser % 400 == 0) {
 * leap = true; } else if (yearByUser % 100 == 0) { leap = false; } else { leap
 * = true; }
 */
