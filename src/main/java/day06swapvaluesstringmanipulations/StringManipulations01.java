package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str = "Java is easy";
        // str stringindeki tüm karakterleri büyük harf yapınız.
        String STR = str.toUpperCase();
        System.out.println("str = " + STR);// JAVA İS EASY
        // ornek 2 tüm karakterler lüçük harf

        String str2 = str.toLowerCase();
        System.out.println("str2 = " + str2);
        System.out.println("str.toLowerCase() = " + str.toLowerCase());
        //ornek3 ilk karakteri alınınz

        System.out.println("str.charAt(0) = " + str.charAt(0));
        // ornek 4 str içindeki ikiknci ve sondan ikinci karakteri yazdır
        System.out.println("str.charAt(1) = " + str.charAt(1));
        System.out.println("str.charAt(10) = " + str.charAt(10));

        //ornek 5 str de kullanılan toplam karakter sayısını bulunuz
        System.out.println("str.length() = " + str.length());

        //ornek6 str stringindeki ilk 4 karakteri yazdırınız
        System.out.println("str.substring(0,4) = " + str.substring(0, 4));

        //ornek7 is kelimesini yazdır
        System.out.println("str.substring(6,7) = " + str.substring(5, 7));

        //ornek8 easy kelimesini yazdır
        System.out.println("str.substring(8,11) = " + str.substring(8, 12));
        // ornek8 2. yol
        // bir kARAKTERDEN sonuna kadar almak için
        // son sub değerini yazmaya gerek yok
        String sub4 = str.substring(8);// easy
        System.out.println(sub4);

        // ornek9 str stringinde money kelimesinin olup olmadığını kontrol ediniz
        System.out.println("str.contains(\"money\") = " + str.contains("Java "));

        //ornek 10 str stringinin belli bir harfle
        // başlayıp başlamadığını kontrol edininz
        System.out.println("str.startsWith(\"java\") = " + str.startsWith("Java"));

        // ornek11 "str" stringinin
        System.out.println("str.substring(5).startsWith(\"i\") = " + str.substring(5).startsWith("i"));
        boolean startwith = str.startsWith("i",5);
        System.out.println("startwith = " + startwith);
    }
}
