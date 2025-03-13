package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    // iki sayıya dört işlem yapan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two number");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println(num1+num2 );
        System.out.println(num1-num2 );
        System.out.println(num1*num2 );
        System.out.println(num1/num2 );
    }
}
