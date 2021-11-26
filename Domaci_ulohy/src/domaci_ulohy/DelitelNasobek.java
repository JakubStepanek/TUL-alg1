package domaci_ulohy;

public class DelitelNasobek {
    
    public static void main (String[] args) {
       
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