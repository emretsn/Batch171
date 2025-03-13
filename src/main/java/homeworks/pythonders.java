package homeworks;

import java.util.Scanner;

public class pythonders {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int num = scan.nextInt();

        int karesi = num*num;
        System.out.println("2. sayıyı giriniz");
        double num2 = scan.nextDouble();

        double karekök = Math.sqrt(num2);

        if (karesi<=5 ){
            System.out.println(" 1. sayının  karesi 5 ten küçük veya eşittir " );
        } else if (karesi <=20) {
            System.out.println("karesi 5 ile 20 arasındadır ");
        } else  {
            System.out.println("20 den büyüktür");

        }
        if (karekök<=5 ){
            System.out.println(" 2. sayının  karekökü 5 ten küçük veya eşittir " );
        } else if (karekök <=20) {
            System.out.println("2. sayının karekökü 5 ile 20 arasındadır ");
        } else  {
            System.out.println("2. sayının karekökü  20 den büyüktür");}

    }
}
