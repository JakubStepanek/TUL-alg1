
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
        // Input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Chcete-li zjistit, zda je rok přestupný?");
        System.out.print("Zadejte rok: ");
        int yearByUser = sc.nextInt();
        // const for current year to decide whether year by user was/is/will be
        final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        boolean leap = false;
        String verb = "";

        // CODE
        // is year leap ?
        leap = (yearByUser % 4 == 0) ? (yearByUser % 400 == 0) ? true : (yearByUser % 100 != 0) : false;
        // verb was/is/will be leap
        
        
        
        
        
        
        
        
        
        
        verb = leap ? (yearByUser == currentYear) ? "je" : (yearByUser > currentYear) ? "bude" : "byl"
                : (yearByUser == currentYear) ? "není" : (yearByUser > currentYear) ? "nebude" : "nebyl";

        // OUT
        System.out.println(String.format("Rok %d %s přestupný!", yearByUser, verb));

    }
}