/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kubin
 */
public class cv15 {

    /**
     * @param args the command line arguments
     */
    
    
    
    // Function to concatenate
    // two integers into one
    static int concat(int a, int b)
    {
         // Convert both the integers to string
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
 
        // Concatenate both strings
        String s = s1 + s2;
 
        // Convert the concatenated string
        // to integer
        int c = Integer.parseInt(s);
 
        // return the formed integer
        return c;
    }
 
    public static void main(String[] args) {
        //IN
        int first = 020723;
        int second = 2443;
        boolean valid;
        System.out.println(concat(first, second));
        
          
        
    }
    
}
