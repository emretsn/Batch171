package day09ifstatements;

import java.util.Scanner;

public class Exersize02 {
    public static void main(String[] args) {
        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"

         */

        Scanner in = new Scanner(System.in);
        System.out.println("please enter a passoword");
        String psv = in.next();
        int length = psv.length();
        boolean isSpace = psv.contains(" ");
        boolean x = psv.contains("1");
        int index = psv.indexOf(' ');
        boolean y = index!=-1;
        System.out.println(y);
        System.out.println(x);
        System.out.println(isSpace);
if (length>7 && isSpace== false){
    System.out.println("geçerli şifre");
} else if (isSpace== true) {
    System.out.println("please dont use space");

}else {
    System.out.println("geçersiz şifre");
}
    } // boşlığu kontorl edemiyor oçlar
}


