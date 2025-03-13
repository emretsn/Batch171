package day30maps;

import java.util.HashMap;

public class exersize {
    public static void main(String[] args) {
        /*
        verilen Stringde hangi harfin kaç defa kullanıldığını veren kod
        "Hello Cavus" ==> H=2 , e= 1 ....
         */

        String s =  "Hello Çavus!!" ;
        s = s.replaceAll("[^a-zA-Z ]", "");
        System.out.println("s = " + s);


        String harfler[] = s.split("");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w: harfler) {
            if (map.containsKey(w)){
                map.replace(w, map.get(w)+1);

            }else {
                map.put(w, 1);
            }
        }
        System.out.println(map);


    }
}
