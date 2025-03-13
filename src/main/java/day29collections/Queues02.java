package day29collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {

    public static void main(String[] args) {

        Queue<String> q1 = new PriorityQueue<>();

        q1.add("milk");
        q1.add("water");
        q1.add("cafee");
        q1.add("meat");
        System.out.println("q1 = " + q1);

        /*
        queue bir interface dir bu yüzden constructerı yoktur, dolayısıyla object oluştururken new keywordunden sonra
        queue yazamayız. data type ı queue olan bir object oluşturmak için
        1) LinkedList veya 2) priorityqueue classları kullanılabilir

        Queue oluşturuken constructer olarak prioritiyQueue kullanırsanız elemanları kendi belirleyeceğiniz
        kurala göre sıralama hakkınız olur.

         */

        // Deque ==> double ended queue (iki uçlu queue)
        Deque<String> d1 = new LinkedList<>();


        d1.add("milk");
        d1.add("water");
        d1.add("cafee");
        d1.add("meat");
        System.out.println("d1 = " + d1);
        // hem ilk elemanlar hem de son elemanlar arasında manipülasyon yapma şansı sundu




    }
}
