package day09ifstatements;

import java.util.Scanner;

public class exercise07 { /*Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter number");
        float num = in.nextInt();
        System.out.println("Choose one of the these operators: miltokm, kmtomil, sectohour, hourtosec, fhtocel, celtofh ");
        String opr = in.next();

        if (opr.equalsIgnoreCase("miltokm")){System.out.println("km = " + num * 1.6);}
        else if (opr.equalsIgnoreCase("kmtomil")) {System.out.println("mil= " + num * 10 / 16);}
        else if (opr.equalsIgnoreCase("sectohour")) {System.out.println("hour: "+num/3600);}
        else if (opr.equalsIgnoreCase("hourtosec")) {System.out.println("second: "+num*3600);}
        else if (opr.equalsIgnoreCase("fhtocel")) {System.out.println("celcius: "+(num-32)/1.8);}
        else if (opr.equalsIgnoreCase("celtofh")) {System.out.println("fahrenayt: "+ num*1.8+32);}
        else {System.out.println("please enter valid operator");}


    }

}
