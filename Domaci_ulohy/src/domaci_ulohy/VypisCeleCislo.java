/*
 *
 * @author kubin
 */

package domaci_ulohy;
import java.util.Scanner;
public class VypisCeleCislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        System.out.println((inputNumber >= 0 ? (String.format("+%03d", inputNumber)) : (String.format("%04d", inputNumber))));
        }
}
