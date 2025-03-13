package day10ifstatements;

import java.util.Scanner;

public class Ifstatements04 {
    public static void main(String[] args) {
                /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz         */

        Scanner input = new Scanner(System.in);
        // tavsiye edilmeyen yol çok fazla kod var sistemi daha fazla yorabilir
        // ve sade değil && ifadesi olmadan sadece büyük küçükle yazılabilir
        System.out.println("please enter age");
        int age = input.nextInt();
        if (age<=4 && age>=0){
            System.out.println("baby");
        }else if (age<=12 && age>=5){
            System.out.println("child");
        }else if (age<=20 && age>=13){
            System.out.println("teen");
        }else if (age<=30 && age>=21){
            System.out.println("adult");
        }else if (age>30){
            System.out.println("undefined");
        }else{
            System.out.println("please enter valid number");
        }
        /*
        DAHA DOĞRU OLAN YÖNTEM
        if(age<0){
            System.out.println("Gecerli bir yas giriniz.");
        } else if (age<5) {
            System.out.println("Bebek");
        } else if (age<13) {
            System.out.println("Cocuk");
        } else if (age<21) {
            System.out.println("Genc");
        } else if (age<31) {
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanimlanmamis yas...");
        }
         */

    }
}