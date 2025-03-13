package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        /*
        1) Setler tekrarsız eleman(unique) depolamak için kullanılır, mesela tc yada öğrenci numarası
        2) 3 tane set class vardır
        a) hashSet Class;
        "Hash" benzersiz bir Id oluşturma tekniğidir, bu tekniğe hashing teknique denir mesela uni id oluşturuken rakamlar sırayla bir anlam ifade eder
        "HashSet" elemanları sıralamadığından çok hızlı çalışır
        nullı eleman olarak kabul eder. bir tane kabul eder
        b) LinkHashSet class;
        LinkHashSet elemanları sizin verdiğiniz sıraya göre(İnsertiom order) dizdiklerinden diğrine göre yavaştır
        tekrarsız eleman depolamak içindir
        c) "TreeSet" class;
        "TreeSet" ler elemanları natural order küçükten büyüğe doğru dizerler
        en yavaş set treeSet dir
        3) TreeSet çok yavaş olduğundan mümkün olduğu kadar treeSet kullanmamaya çalışırız


         */
        //ÖZET
        // setlerin içerisindeki bir eleman tekrar etmeyecek, tekrar ederse de hata vermez bir kez yazar,
        // hashset kafasına göre sıralar en hızılıdır, linkedhashset kullanıcının verdiği sıraya göre, Treeset ler
        // natural order küçükten büyüğe sıralar yavaş olduğundan çok tavsiye edilmez
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("çavuş");
        hs1.add("savcı");
        hs1.add("mıdik");
        System.out.println("hs1 = " + hs1);

        hs1.add("çavuş"); // tekrarlı eleman eklediğimizde hata vermedi ancak sadece bir kere ekledi
        System.out.println("hs1 = " + hs1);

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(12);
        ls.add(13);
        ls.add(14);
        ls.add(15);
        ls.add(16);

        LinkedHashSet<Integer> lsh = new LinkedHashSet<>();
        lsh.add(12);
        lsh.add(17);
        lsh.add(21);
        lsh.add(45);
        lsh.add(14);

        // kullanıcının verdiği sıraya göre dizdi
        System.out.println("ls = " + ls);

        ls.retainAll(lsh); // ortak olan elemanları retainall kullanılan sete yazar

        System.out.println("ls = " + ls);
        System.out.println("lsh = " + lsh);

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('c');
        ts.add('x');
        ts.add('f');
        ts.add('a');
        ts.add('b');
        System.out.println("ts = " + ts); // TreeSetlere null eklenemez
        System.out.println("ts.first() = " + ts.first());
        System.out.println("ts.lower('b') = " + ts.lower('a'));
        // bir önceki elemanı verir

        System.out.println("ts.higher('a') = " + ts.higher('a'));
        // bir sonrakini verdi
        System.out.println("ts.clone() = " + ts.clone());

        System.out.println("ts.headSet('b') = " + ts.headSet('b',true));
        // verilen elemandan önceki elemanları verir. o elemanı dahi etmez, virgülle true diyince o elemanı da dahil eder

        System.out.println("ts.tailSet('L') = " + ts.tailSet('L'));
        System.out.println("ts.tailSet('c') = " + ts.tailSet('c',false));
        // false yazınca c yi dahil etmedik

        System.out.println("ts.ceiling('c') = " + ts.ceiling('c'));
        System.out.println("ts.ceiling('d') = " + ts.ceiling('d'));
        // karakter var ise elemanın kendisini verir, yoksa olsaydı hngi karakterden önce olurdu onu verir

        System.out.println("ts.floor('d') = " + ts.floor('d'));
        // olsaydı hangi karakterden sonra olurdu verir

        System.out.println("ts.subSet('a', 'f') = " + ts.subSet('a', 'f'));
        // ilk elementi aldı sın elementi almadı
        System.out.println("ts.subSet('a', false, 'x', true) = " + ts.subSet('a', false, 'x', true));
        // true yazdığımız element dahil oldu, false yazdığımız dahil olmadı




    }

}
