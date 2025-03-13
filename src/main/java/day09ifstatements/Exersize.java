package day09ifstatements;

import java.util.Scanner;

public class Exersize {
    /*
    Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Aralık, Ocak, Şubat için "Kış"
b) Mart, Nisan, Mayıs için "İlkbahar"
c) Haziran, Temmuz, Ağustos için "Yaz"
d) Eylül, Ekim, Kasım için "Sonbahar"
e) Diğerleri için "Geçersiz ay adı"

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter month name");
        String monthName = input.next();

        if (monthName.equalsIgnoreCase("december"))
        {System.out.println("winter");}

     else if   (monthName.equalsIgnoreCase("january")){
            System.out.println("winter");}
        else if   (monthName.equalsIgnoreCase("february")){
            System.out.println("winter");}
        else if   (monthName.equalsIgnoreCase("march")){
            System.out.println("spring");}
        else if   (monthName.equalsIgnoreCase("april")){
            System.out.println("spring");}
        else if   (monthName.equalsIgnoreCase("may")){
            System.out.println("spring");}
        else if   (monthName.equalsIgnoreCase("july")){
            System.out.println("summar");}
        else if   (monthName.equalsIgnoreCase("junny")){
            System.out.println("summar");}
        else if   (monthName.equalsIgnoreCase("augustus")){
            System.out.println("summar");}
        else if   (monthName.equalsIgnoreCase("september")){
            System.out.println("fall");}
        else if   (monthName.equalsIgnoreCase("october")){
            System.out.println("fall");}
        else if   (monthName.equalsIgnoreCase("november")){
            System.out.println("fall");}
        else {System.out.println("this is not a month" );
        }


    }
}
