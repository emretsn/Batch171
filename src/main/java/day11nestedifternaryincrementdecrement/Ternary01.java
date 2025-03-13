package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        // sayı 10 dan küçükse küçük değise küçük değil yazdıran kodu yazınınz


        // ornek 2 sayı çift ise konsola çif

        Scanner input = new Scanner(System.in);
        System.out.println("please enter two number");
        int num = input.nextInt();
        int num2 = input.nextInt();

        if (num%2 == 0 ){
            System.out.println("çift sayı");

        }else  {
            System.out.println("tek sayı");
        }
        // sayı tek ise tek sayı çift ise çift sayıyazdıran kodu yazınız
        String sonuc = num%2== 0 ?   "cift sayı"      :  "tek sayı";
        System.out.println(sonuc);
        // sayı pozitifse pozitif değilse negatif yazdıran kou yazınız
        String x =  num>0 ? "pozitif "    : "negatif";
        System.out.println(x);
// girilen iki numaradan küçük olanı yazdıran kodu yazınınz
        System.out.println(num<=num2 ? num : num2);
        // or double z = num<=num2 ? num : num2 ;
        // south(z);
    }
}
