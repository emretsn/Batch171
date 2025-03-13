package day23datetimevarargs;

import java.awt.desktop.ScreenSleepEvent;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
    //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter year,month, and daynumber in the given order");
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();


        LocalDate givenDate = LocalDate.of(year,month,day);
        if( givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate+" invalid date");
        }else {
            System.out.println("you can enter ticket time");
        }
        // example2 kullanıcının girdiği tarihin gün ismin bulan kodu yazınız


        System.out.println("please enter your birthdate");
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();
        LocalDate birthDate = LocalDate.of(y,m,d);

        System.out.println(birthDate.getDayOfWeek());
    }
}
