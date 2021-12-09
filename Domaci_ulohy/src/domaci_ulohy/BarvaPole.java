
package domaci_ulohy;

import java.util.Scanner;

import org.w3c.dom.xpath.XPathNSResolver;

public class BarvaPole {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int xPos, yPos;
        while (((xPos = sc.nextInt()) >= 0) || (yPos = sc.nextInt()) >= 0) {
            xPos = sc.nextInt();
            yPos = sc.nextInt();
            String answer = ((xPos % 2 == 0) ? ((yPos % 2 == 0) ? "BILA" : "CERNA")
                    : (yPos % 2 == 0) ? "CERNA" : "BILA");
            System.out.println(answer);
        }
    }

}