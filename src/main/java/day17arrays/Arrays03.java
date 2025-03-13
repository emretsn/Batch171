package day17arrays;

import java.util.Arrays;

public class Arrays023 {
    public static void main(String[] args) {
        // spwsific bir elemanın arrayin içinde olup olmadığını bulan kodu yazınız

        String names[] = {"k","v","c", "f", "r"};
        String el = "x";
        // 1. ways
        int counter = 0 ;

        for (String w: names    ) {
 if(w.equalsIgnoreCase(el)){
     counter++ ;
     break;
 }
        }
        if (counter>0){
            System.out.println("array has "  + el);
        }else {
            System.out.println("array does not have " + el);
        }

        //2. yol binarySearch() ;

        /*
        binarysearch() methodunu sort() olmadan sıralı olmadan kullanamayız
        binarySearch size var olan bir elemanın indexini verir .
        buradan aldığınız index 0 yada 0 dan buyukse o eleman arrayde var demektir
        binarySearch methodu olmayan elemanlar için negatif bir tam sayı değeri verir
        "-" işaretinin anlamı o eleMAN YOK DEMEKTİR
        "sayı ise o elman olsaydı

         */

        Arrays.sort(names);
        int result = Arrays.binarySearch(names,el);
        System.out.println(result);
        if (result< 0 ){
            System.out.println("array does not have "+ el);

        }else {
            System.out.println("array have  " + el);
        }
    }
}
