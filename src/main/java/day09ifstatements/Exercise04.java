package day09ifstatements;

import java.util.Scanner;

public class Exercise04 {
    /*
    Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number");
       int num = in.nextInt();
        if (num%10 > 4 ){
            System.out.println("bir üst ondalığa yuvarlandı " + (num + (10 - num % 10)));
        }else{
            System.out.println("bir alt ondalığa yuvarlandı " + (num - num % 10));
        }


    }

}
