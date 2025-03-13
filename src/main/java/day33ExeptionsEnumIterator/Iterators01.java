package day33ExeptionsEnumIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    /*
    1) Iteratörler loopların yaptığı aynı işi yapapr
    2) iteratorler sonsuz loop oluşma ihtimali yoktur
    3) Iteratorler ile looplar arasında performans farkı yoktur
    4) Irterator lar bir collectiondan eleman silme ve bir collectiondaki elemanı değiştirme konusunda daha basarılıdırlar
    5) iki tip Iterator vardır
    a) Iterator : Bu sadece Eleman silmede kullanılır.
    Eleman eklemek veya elemanı değiştirmek mümkün değildir.

    b) ListIterator: bu eleman silebilir, ekleyebilir ve değiştirebilir.
    Note : Iterator sadece soldan sağa ilk elemandan son elemana çalışır.
    ListIterator ise iki yönlü çalışabilir.
     */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("Emirsk");
        myList.add("Affetmez27");
        myList.add("Afyok03");
        myList.add("gaddar");

        System.out.println(myList);

        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()){// hasnext pointera senden sonra eleman varmı diye sorar
            // eleman varsa true yoksa flase return eder
            // next methodu poiterı bir sonraki elemanın önüne taşır ve üstünden atladığı elemanı return eder
            // remove methodu next methodunun üzerinden atladığı elemanı siler
            // for each looptan avantajı sonsuz döngüye girmemesi ve eleman silebilme
           if (myItr.next().equals("Emirsk") ){
               myItr.remove();}
        }
        System.out.println(myList);// list bu ssyede temizlendi

        // ListIterator kullanımı

        List<String> yourList  = new ArrayList<>();

        yourList.add("Emirsk");
        yourList.add("Affetmez27");
        yourList.add("Afyok03");
        yourList.add("gaddar");

        System.out.println(yourList);
        ListIterator<String> listIterator = yourList.listIterator();

        while (listIterator.hasNext()){

            String el = listIterator.next();

            listIterator.set(el+"*"); // Set methodu listi update işlemi için kullanılır
        }

        System.out.println(yourList);//[Emirsk*, Affetmez27*, Afyok03*, gaddar*]
   // ListIterator previos methodu kullanma

       //Loop kullanarak pointerı en sona almalıyız
        while (listIterator.hasNext()){
            listIterator.next();
        }
        while(listIterator.hasPrevious()){
            String el = listIterator.previous();
            System.out.print(el+"<==");

        }
        System.out.println(yourList);

    }

}
