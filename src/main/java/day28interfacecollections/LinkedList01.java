package day28interfacecollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    // Collections

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        // bu ilk oluşturma şeklimiz
        List<String> list2 = new ArrayList<>();
        // Array list is a interable , Array list is a collection
        // Array list is an Interable, Array list is an object diye tanımlanabilir
        // Array listler index silme ve eklemede tekrar index ataması yaptıklarından bu konuda başarısızdırlar
        // LinkedList yapısı silmne ekleme işini  daha sorunsuz yapar


        /*
        1) Arraylistler eleman ekleme ve silme işlemlerinde başarısızdırlar o yüzden elemsan silme ve ekleme işlemleri çoklukla yapılacak ise Arraylist kullanmak tavsiye edilmez
        2) Linked listler index kullanmadıkalrınmdan node silme ve eklemede reindex yapılmasına gerek yoktur bu da linkedlistleri eleman ekleme ve silmede başarılı hale
        getirir bu işlemlerin çok yapılacağı yerlerde linkedlist kullanılır
        3) Arraylistlerde search işlemi kolay yapılır çünkü indexler adresler gibidir.
        4) linkedlistlerde search işlemi zor yapılır index kullanmaz baştan sona tarar.
        bu da çok fazla iş demektir

         */
        LinkedList<String> s = new LinkedList<>(); // primitive kullanılmaz

        s.add("emre");
        s.add("cavus");
        s.add("savcı");
        s.add("bilal");
        s.add(2, "ömer"); // index kullanarak eklenebilir

        s.addFirst("mıdik"); // en başa ekleme

        s.addLast("çavuş2");// sona ekle

        System.out.println("s = " + s);
        s.remove(3);// eleman silme
        System.out.println("s = " + s);

        s.removeFirstOccurrence("bilal");// ilk görünümünü silme

        String r1 = s.peek();// ilk node u verir liste dokunmaz
        System.out.println("r1 = " + r1);
        System.out.println("s = " + s);

        String r2 = s.poll(); // ilk node u size verir ve listten siler
        System.out.println("r2 = " + r2);
        System.out.println("s = " + s);

        String r3 = s.element();
        System.out.println("r3 = " + r3);// listin başını verdi boş olduğunda hata verir
        System.out.println("s = " + s);

        String r4 = s.pop();
        System.out.println("r4 = " + r4); // ilk elemanı siler boşsa hata verir methodun üzerine gelindiğinde ne işe yaradığı anlaşılabilir
        System.out.println("s = " + s);








    }
}
