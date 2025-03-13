package day06arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a = 13;
        // bir yapının içinde çoklu data depolama için kullanılan yapıdır
        // code yazarken çoklu data depolama ihtiyacı hissedilir
        // çoklu data tipi tutabilirler
        // Array nasıl oşuşturulur

        /*
        Array'ler diger collection'lardan cok daha hizlidir (superfast).
        Array'ler diger collection'lardan daha az memory kullanirlar.
         */
        
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
        stdName[4]= "çavuş";

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
