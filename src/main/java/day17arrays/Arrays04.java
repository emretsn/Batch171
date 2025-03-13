package day17arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        // verilen String ifadede kaç kelime olduğununu bulan kodu yazınız
        String s = "java is easy. learn java eran money";

      String words[] =  s.split(" ");

        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        // ornek 2 size verilen Stringtelki kaç harf olduğunu gösteren kodu yazınız
        String letters [] = s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);
    }
}
