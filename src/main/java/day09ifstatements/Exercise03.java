package day09ifstatements;

import java.util.Scanner;

public class Exercise03 {/*Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.
*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println( "please enter month number");
        int num = in.nextInt();
       if ( num == 1){
           System.out.println("january");

       } else if (num ==  2 ) {
           System.out.println("february");
       } else if (num ==  2 ) {
           System.out.println("march");
       } else if (num ==  3 ) {
           System.out.println("april");
       } else if (num ==  4 ) {
           System.out.println("may");
       } else if (num ==  5 ) {
           System.out.println("june");
       } else if (num ==  6 ) {
           System.out.println("july");
       } else if (num ==  7 ) {
           System.out.println("augutous");
       } else if (num ==  9 ) {
           System.out.println("september");
       } else if (num == 10 ) {
           System.out.println("october");
       } else if (num ==  11 ) {
           System.out.println("november");
       } else if (num ==  12 ) {
           System.out.println("december");
       }else {
           System.out.println("invalid number");
       }
    }
}
