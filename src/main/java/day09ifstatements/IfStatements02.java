package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //Ornek: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu konsola yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz...");
        int num =input.nextInt();

        //1.Yol
        if(num%2==0){
            System.out.println("Cift sayi...");
        }

        if(num%2!=0){
            System.out.println("Tek sayi");
        }

        //2. Yol ==> kontrol edilen condition sayisi az oldugundan dolayi tavsiye edilir
        if(num%2==0){
            System.out.println("Cift sayi");
        }else{//aksi halde
            System.out.println("Tek sayidir");
        }


    }
}
