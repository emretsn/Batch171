package day04scannerwrapper;


import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Ornek : Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniz

        //1. adim Scanner Classtan bir object olustur
        Scanner input = new Scanner(System.in);

        //2. adim : Kullaniciya ne istedigimize dair mesaj veriniz
        System.out.println("Ilk isminizi giriniz..");

        //3. adim : Uygun method'u kullanarak kullanicinin verdigi datayi memory'e yerlestiriniz
        String firstName = input.next();

        System.out.println("Soy isiminizi giriniz..");
        String lastName = input.next();

        System.out.println(firstName+lastName);



    }
}