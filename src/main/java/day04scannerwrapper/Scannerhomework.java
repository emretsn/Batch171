package day04scannerwrapper;

import java.util.Scanner;

public class Scannerhomework {/*
    Homework
    1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
     ornegin => 3,5,7 icin ortalama (3+5+7)/3=5
    2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
     ornegin => 312 icin 3+1+2=6

 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter tree number.");
        float num1 = input.nextInt();
       float num2 = input.nextInt();
       float num3 = input.nextInt();
       float avarage = (num3+num2+num1)/3;
        System.out.println("avarage = " + avarage);


    }



}
