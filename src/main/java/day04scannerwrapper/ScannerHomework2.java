package day04scannerwrapper;

import java.util.Scanner;

public class ScannerHomework2 {
    public static void main(String[] args) {
        // üç basamaklı sayının rakamaları toplamını bulan kod
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three digit number");
        int num = input.nextInt();
        int a = num%10;
        num = num/10;
        int b= num%10;
        num = num/10;
        int c = num%10;
        System.out.println("Sam of digits = " + (a + b + c));
    }
}
