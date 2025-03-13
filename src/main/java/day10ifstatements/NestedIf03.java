package day10ifstatements;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {

        /*
                    Password'un ilk harfi buyuk harf ise
                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli

                    Passwordun ilk harfi kucuk harf ise
                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
         */

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your password");
        String pwd = input.next();
        char firstChar =pwd.charAt(0);
        if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){
            if (pwd.charAt(0)=='A'){
                System.out.println("valid password");
            }else {
                System.out.println("invalid password büyük harf ama A değil");
            }

        }else if (pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){
           if (pwd.charAt(0)=='z'){
               System.out.println("this is valid passoword");
           } else {
               System.out.println("invalid passoword küçük harf ama 'z' degil");
           }
        } else {
            System.out.println("you did enter invalid character");

            // eğer bir methodu tekrar tekrar kullanmak istiyorsanız
            // onu variablea atayarak kullamöak daha makuldür
        }
    }
}