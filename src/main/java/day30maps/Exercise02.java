package day30maps;

import java.util.HashMap;

public class Exercise02 {
    public static void main(String[] args) {
        // Stringdeki kelimelerin kaç defa kullanıldığını gösteren kodu yazınız
        // I like you, like like! I=1 , like=3, you==1 ;
        String sentence = "I like you, like like!";
        String words[] =  sentence.replaceAll("[^a-zA-Z ]","").split(" ");

        HashMap<String,Integer> map = new HashMap<>();
        for (String w:words) {
           if (map.containsKey(w)){
               map.replace(w, map.get(w)+1);
           }else {
               map.put(w, 1);
           }


        }
        System.out.println(map);
    }
}
