package day23datetimevarargs;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise01 {
    public static void main(String[] args) {
        //1) Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        //Ali'nin doğum tarihi 12 Mayıs 2002'dir.

        LocalDate nowdate = LocalDate.now();
        LocalDate birtday = LocalDate.of(2002,01,04);


        long gunsayısı = ChronoUnit.DAYS.between(nowdate,birtday);
        System.out.println(gunsayısı);


    }
}
