package day_01;
public class C01_Variables {
    public static void main(String[] args) {
        //Bir variable olustur, yazdır
        int yas = 36;
        //syntax : variable data turu + variable isim +atama operatoru + variable deger
        int sayi = 50;
        System.out.println(yas);//ctrl d ile satırı alt alta cogaltabılırız
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);
        //sayi = 50 seklinde yazdır
        System.out.println("sayi = " + sayi);
        //sayi variable ini etiketiyle birlikte yazdırma
        //ctrl alt L -> kodlarımızı duzenlemeye yarar
        //bir variable ı etiketiyle birlikte yazdırmanın kısa yolu = soutv
        System.out.println("sayi = " + sayi);
        System.out.println(sayi);
        System.out.println("yas = " + yas);
        //String bir variable olusturalım ->non primitive bir data turu, "" icinde yazılır, buyuk harfle baslar
        String isim = "Ali";
        //isim variable ını etıketıyle yazdır
        System.out.println("isim = " + isim);
        //Olusturdugun variable'ı farkli bir variable'a kopyala
        //yeni bir variable olusturacagım :benimYasim ve bu variable ın degeri yas variablenın degerine esıt olsun
        int benimYasim = yas;
        String onunIsmi = isim;
        System.out.println("onunismi:"+ isim);
        //camelCase
        //PascalCase
        //snake_case
        //kebab-case
        //Aynı satırda coklu variable deklare et

        int yıl=2023, gün=04, ay=01;
        System.out.println("tarih: "+yıl+"."+ay+"."+gün);
        //Bir variable degerini guncelle

        //Degişkenleri(variable) yazdır

        //Bir variable deklere et : x

       double x  ;
        //Bir variable baslat : y

        double y= 12.5;
        //Başka bir variable başlat : z
        double z = 33 ;
        //x degişkenini y degişkeni ile başlat
         x = y;
        //Variable y'i guncelle
        y = 13.48;
        //Degişkenleri yazdır
        System.out.println("x = " + x);


    }


}