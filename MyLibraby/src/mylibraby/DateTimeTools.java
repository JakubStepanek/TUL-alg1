package mylibraby;


public class DateTimeTools {
    
    public static boolean leapYear(int year){
        boolean leap = false;
        try{
        leap = (year % 4 == 0) ? (year % 400 == 0) ? true : (year % 100 != 0) : false;        
        }
        catch(NumberFormatException e)
        {
            System.out.println("Zadejte číslo");
        }
        return leap;
    }
    
}
