package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız. negatiflikte sorgula


         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girin");
       int  num = scan.nextInt();
        String result = num<0 ? num%2 ==0 ? "negatif ve çift ": "negatif ve tek " : num%2 ==0  ? "pozitif ve çift ": "pozitif ve tek";
        System.out.println(result);
    }
}
