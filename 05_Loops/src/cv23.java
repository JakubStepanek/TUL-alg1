import java.util.Scanner;

/**
 *
 * @author kubin
 */
public class cv23 {
public static void main(String[] args){
    //IN
    Scanner sc = new Scanner(System.in);
    char answer = 'a';
   do{
    System.out.print("Zadej číslo a koukej: ");
    int number = sc.nextInt();
    int numberOut = number;
    String factor = "";
   //CODE
   int i = 2;
   while(i<=number){
       while(number%i == 0){
        factor = String.format("%s %d *", factor, i);
        number /= i; // number = number / i;
       }
       i++;
   }

   //OUT as string
   String result = (numberOut + " ="+ factor);
   result = result.substring(0, result.length() - 1);
   System.out.println(result);
   System.out.println("Přejetesi pokračovat? a/n");
   answer = sc.next().toLowerCase().charAt(0);
}while(answer == 'a');
}
}
