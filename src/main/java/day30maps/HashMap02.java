package day30maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("suat", 36);
        studentAges.put("emre", 35);
        studentAges.put("ahmet", 19);
        studentAges.put("cemil", 23);
        studentAges.put("cemil", 25);
        // key i tekrararsız kullandığımızda hata vermez ama en son verilen değeri kabul eder
        // bu yöntem value güncellmede kullanılabilir. buna Overwrite denir

        System.out.println("studentAges = " + studentAges);

        studentAges.replace("suat", 45); // replace methodu keyleri kullanarak valueleri update etmeye yarar
        System.out.println("studentAges = " + studentAges);

        studentAges.replace("emre", 35, 22); // eski value i de girerek iki aşamalı bir kontrol yapılmış oldu
        System.out.println("studentAges = " + studentAges);

        studentAges.putIfAbsent("suat", 30); // yoksa ekle , vardı eklenmedi
        System.out.println("studentAges = " + studentAges);

        System.out.println(studentAges.get("emre"));// key bulunuyorsa valuesini bulunmuyorsa null
        System.out.println(studentAges.get("fatih"));// null
        System.out.println(studentAges.getOrDefault("fatih", 35));// 35 verir eğer eleman yoksa girilen değeri çıktı ver görevi yapar

        System.out.println(studentAges.containsKey("emre"));// bu keyi içerir mi
        System.out.println(studentAges.containsValue(33));// bu value yi içerir mi

        studentAges.remove("suat");
        System.out.println(studentAges);//{ahmet=19, emre=22, cemil=25} suat silindi
        // iki aşamalı kontrol yapan overload edilmiş method da bulunur




    }
}
