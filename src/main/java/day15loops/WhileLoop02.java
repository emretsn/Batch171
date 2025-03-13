package day15loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter num ");
        int num = in.nextInt();

       int k = 1;
       while ( k<11) {
           System.out.println("num*"+k+"= " + (num * k));
           k++;
       }
       // girilen kelimenin her harfinin yanına * koyup yazdıran kodu yazınız
       System.out.println("enter String");
       String str = in.next();
       int s = str.length();
       int c = 0;
       while (c<s){
           System.out.print(str.charAt(c)  +"*");
           c++;  }
        //Example 3: Bir string deki tekrarsiz karakterleri console a yazdiriniz
        // kertenkelle  ==> rtn
        // indexOf("k") ==> 0  farkli, tekrarli
        // lastIndexOf("k") ==> 6

        // indexOf("r") ==> 2  ayni ise tekrarsiz
        // lastIndexOf("r") ==> 2

        String v = "kertenkelle";
        String sonuc = "";
        int b = 0;
        while (b < v.length()) {
            char ch = v.charAt(b);
            if (v.indexOf(ch) ==v.lastIndexOf(ch)) {
                sonuc = sonuc + ch;
            }
            b++;
        }
        System.out.println(sonuc);

    }
}
