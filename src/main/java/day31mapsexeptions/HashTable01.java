package day31mapsexeptions;

import java.util.Hashtable;

public class HashTable01 {
    /*
    HashMap ile HashTable arasındaki farklar nelerdir
    1) Hash-Map thread-safe ve synchronized değildir, Hastable thread-safe ve synchronized dir
    yani ayni anda birden fazla iş yapabilir, synchronized işler arasında mantıklı sıralama yapmak
    2) HashTable keylerde ve valuelerde null kullanılmasına müsade etmez
    hashmap bir tane null keye ve istediğimiz kadar null value ya müsade eder
    3) HashMap hızlıdır, Hashtable hashMaplere göre yavaştır

    Note: hashmap ve HashTable ikiside entryleri rastgele sıralar

     */
    public static void main(String[] args) {
        Hashtable<String,Integer> stdAges = new Hashtable<>();

        stdAges.put("Mustafa", 29);
        stdAges.put("ali", 24);
        stdAges.put("veli", 20);
        stdAges.put("deli", 35);
        stdAges.put("salim", 23);

        //stdAges.put("mehmet", null); null kullanılmıyor
        //stdAges.put(null, 23);


    }
}
