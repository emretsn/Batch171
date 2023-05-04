package day02datatypesmethodscreation;

public class MethodsCreation01 {

    /*
        Java da Method nasil olusturulur?

        1) Min method un icinde Class in disinda olusturulur.
        2) Access Modifier + Rreturn Type + Medhod Name + () + {}   adimlariyla olusur.

        Olusturulan Methodlar Nasil Kullanilir?

        1) Methodu olusturmak Methodu calistirmak icin yeterli degildir.
  Kullanilmak istenilen method MAin Method un icinden kullanilir.
        2) methodun ismi + () yazin,
        varsa islem yapacaginiz datalari parantezin icine koyun,
        bu islem method call(method cagirma) olarak adlandirilir.
        3) Method ismi + parametreler===> Method Signature
       */

    public static void main(String[] args) {
        int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(4,5);
        System.out.println(carpmaSonucu);

        int cikti = carpTopla(5, 6, 2);
        System.out.println(cikti);

    }
//Orenek 1: toplama islemi yapan bir Method olusturn ve kallanin

    public static int toplamaYap (int a, int b){  // Bu kisimda Method kapsaminda kullanilmasini ve islenmesini istedigimiz data lari deklare ederiz.
        return  a + b;
        // Return demek bu method un cagrildigi yere bu degeri "return" et (geri dondur) demek.
        // !NOTE: main method static oldugu icin main method icinde kullanacagimiz Method da static olmalidir.
    }

// Ornek 2: Iki syayiyi carpma islemi yapan bir method olusturun ve yazdirin


    protected static long multiply(int c, int d){
        return c*d;

    }

//Ornek 3: verilen uc sayidan ilk ikisini carpan ve ucuncu sayi ile sonucu toplayan methodu olusturunuz ve kullanin.


    private static int carpTopla(int x, int y, int z){
        return x*y+z;

    } }

/* Homework2
1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullanin
2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullanin.
 */

