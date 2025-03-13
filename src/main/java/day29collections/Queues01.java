package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {


        Queue<String> depo = new LinkedList<>();
        depo.add("milk");
        depo.add("water");
        depo.add("cafee");
        depo.add("meat");
        System.out.println("depo = " + depo);
        // sadece ilk karkater ile ilgili değişiklik yapılabilir çünkü bu yapının amacı ilk giren ilk çıkar banka sırası gibi

        System.out.println("depo.poll() = " + depo.poll());
        System.out.println("depo.peek() = " + depo.peek());
        depo.clear(); // depoyu boşalttı






    }

}
