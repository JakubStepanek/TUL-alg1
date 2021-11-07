
import java.util.Calendar;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

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
        System.out.println("Chcete-li zjistit, zda byl rok přestupný?");
        System.out.print("Zadejte rok: ");
        int yearByUser = sc.nextInt();
        // const for current year to decide wether year by user was/is/will
        final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        boolean leap = false;
        String verb = "";

        // CODE
        // is year leap ?
        leap = (yearByUser % 4 != 0) ? false : (yearByUser % 400 == 0) ? true : (yearByUser % 100 != 0);
        // verb was/is/will be leap
        verb = leap ? (yearByUser == currentYear) ? "je" : (yearByUser > currentYear) ? "bude" : "byl"
                : (yearByUser == currentYear) ? "není" : (yearByUser > currentYear) ? "nebude" : "nebyl";

        // OUT
        System.out.println(String.format("Rok %d %s přestupný!", yearByUser, verb));

    }

}

/*
 * if (yearByUser % 4 != 0) { leap = false; } else if (yearByUser % 400 == 0) {
 * leap = true; } else if (yearByUser % 100 == 0) { leap = false; } else { leap
 * = true; }
 * 
 * if (leap) { // year was/is/will be leap if (yearByUser == currentYear) { verb
 * = "je"; } else { if (yearByUser > currentYear) { verb = "bude"; } else { verb
 * = "byl"; } } } else { if (yearByUser == currentYear) { verb = "není"; } else
 * { if (yearByUser > currentYear) { verb = "nebude"; } else { verb = "nebyl"; }
 * } }
 * 
 * 
 * 
 */
