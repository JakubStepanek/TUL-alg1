/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mylibraby;

/**
 *
 * @author kubin
 */
public class NumberTools {
    public static void main(String[] args) {
        System.out.println(cos(0.45, 0.0001));

    }

    /**
     * Tests if number is Prime
     * 
     * @param number positive int number
     * @return true if given number is prime
     * @throws IllegalArgumentException if the given number is lower than 0
     */
    public static boolean isPrime(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Pro nekladná čísla nelze určit prvočíselnost");
        }
        if (number == 1) {
            return false;
        }
        int a = 2;
        int limit = (int) Math.sqrt(number);
        while (a <= limit) {
            if (number % a == 0) {
                return false;
            }
            a++;
        }
        return true;
    }

    public static double cos(double x, double eps) {
        double clen = 1;
        double cos = 1;
        int first = 1;
        while (Math.abs(clen) > eps) {
            clen = clen * (-(Math.pow(x, 2)) / (first * first + 1));
            cos += clen;
            first += 2;
        }

        return cos;

    }

}
