package day29collections;

import java.util.HashSet;
import java.util.Timer;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        // ornek öğrenci email adreslerini natural orderda sıralanmıs şekilde depolayın

        long t1 = System.nanoTime();

        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("a@gmail.com");
        ts1.add("d@gmail.com");
        ts1.add("c@gmail.com");
        ts1.add("z@gmail.com");
        ts1.add("f@gmail.com");
        System.out.println("ts1 = " + ts1);

        long t2 = System.nanoTime();

        // 2. yol
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("d@gmail.com");
        hs1.add("c@gmail.com");
        hs1.add("z@gmail.com");
        hs1.add("f@gmail.com");
        System.out.println("hs1 = " + hs1);

        TreeSet<String> ts2 = new TreeSet<>(hs1);
        System.out.println("ts2 = " + ts2);
        // önce hashset oluşturup treesete ekledik daha hızli çalışması için
        // tree seti sıralamak için kullnadık



        long t3 = System.nanoTime();
        // hız farkını görmek için böyle bir method kullandık
        System.out.println("hashsetmethod = "+ (t3-t2));
        System.out.println("treeset method = "+ (t2-t1));


    }
}
