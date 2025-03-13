package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 13;

        /*
        Array'ler diger collection'lardan cok daha hizlidir (superfast).
        Array'ler diger collection'lardan daha az memory kullanirlar.
         NOT :
            1- Bu yapinin icinde sadece bir tane data depolanabilir.
            2- ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz.
            3-Bir yapinin icinde coklu data depolayabilmek icin Java Array yapisini olustururuz.
         */
        // Array naıl oluşturulur
        String stdName [] = new String[5]; // kaç yer tutacağınını parantez içinde belirtmelisim
        // tostring methodu kullanılmazsa adresini yazdırır
        System.out.println(stdName);
        // arrayler konsola nasıl yazdırılır
        System.out.println(Arrays.toString(stdName));

        // Arraylere eleman ekleme nasııl yapılır
        stdName[0]="şenay";
        stdName[1]="mustafa";
        stdName[2]= "özlem";
        stdName[3]= "sedat";
        stdName[4]= "emre";

        System.out.println(Arrays.toString(stdName));
        // arraydne spesifik bir elemanı nasıl alırız

        System.out.println("stdName[0] = " + stdName[0]);

        // Arayydeki her elmanın sonuna ünlem koyup yazdırınız
        // lenght Stirnglerde method parantezli Arraylerde parantezsiz yazılır
        for (int i=0 ;i< stdName.length; i++){
            System.out.println(stdName[i]+"!");
        }
    }
}
