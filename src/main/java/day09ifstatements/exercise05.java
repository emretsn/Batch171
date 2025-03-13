package day09ifstatements;

import java.util.Scanner;

public class exercise05 {/*Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter side lengths of triangle");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean isTriangle = a+b>c && b+c>a && a+c>b &&a>0 && b>0 && c>0;
        if (isTriangle== true){
            if(b==c && b==a){
                System.out.println("equilateral Triangle");
            } else if (a==b && a!=c || b==c && c!=a || c==a && c!=b ) {
                System.out.println("isosceles Triangle");
            }else{
                System.out.println("Scalene Triangle");
            }
        }else {
            System.out.println("this is not a Triangle");
        }
    }
}
