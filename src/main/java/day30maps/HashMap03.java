package day30maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {
    public static void main(String[] args) {
        // exp01 verilen cümledeki kelimelerin görünüm sayılarını veren kodu yazınız
        // I like you, like like! I=1 , like=3, you==1 ;

        String sentence = "I like you, like like!";

       sentence =  sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);

       String words[] =  sentence.split(" "); // kelimlere ayırıp araye koyduk
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> map = new HashMap<>();


        for (String w : words) {
           if (map.containsKey(w)){
               map.replace(w, map.get(w)+1);
           }else {
               map.put(w, 1);
           }

        }
        System.out.println("map = " + map);
    }
}
