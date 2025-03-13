package day30maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

        // Hash benzersiz ID oluşturma tekniğiydi

        /*
        1) Maplerde sözlüklerdeki gibi kelime ve manası şeklinde bir kullanım vardır.
        2) key kısmı tekrarsızdır , value kısmı tekrarlı olabilir.
        3) Maplerdeki her bir elemana Entry denilir, tamamına ise etryset denir.
        4) Entryler tekrarsız olduğundan EntrySet denir.
        5) Key ve valuelar ayrı ayrı data typelarında olabilirler.
        6)Mapler collection değildir farklı bir yapıdır
        7)HashMapler entryleri rastgele sırlar bu yüzden en hızlı mapdir


         */

        // Map nasıl oluşturulur?
        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 830000);
        countryPopulation.put("turkiye", 860000);
        countryPopulation.put("Netherland", 830000);
        System.out.println("countryPopulation = " + countryPopulation);


        // Get methodu key ile çalışır value kısmını verir
        int tr = countryPopulation.get("turkiye");
        System.out.println("tr = " + tr);

        // bütün keyleri nasıl alırız
        System.out.println("countryPopulation.keySet() = " + countryPopulation.keySet());

        // Value ları nasıl alırız
        System.out.println("countryPopulation.values() = " + countryPopulation.values());

        // ornek country population mapindeki ülkelerin nüfüslarının ortalaması nedir

        int sum = 0 ;
        for (int w: countryPopulation.values()) {

            sum += w;

        }

        double ortalama = sum / countryPopulation.values().size();
        System.out.println("ortalama = " + ortalama);

        //LOoplar mapler ile kullanılamaz bunun için entrySet methodu kullanırız
        // Entryset methodu mapdeki entryleri alıp kalıp halinde setin içine koyup verir
        Set<Map.Entry<String, Integer>> entries =   countryPopulation.entrySet();

        // ornek2 countryPopulation daki ülkelerin isimlerinin karakter sayısı ile nüfusların
        // toplamını bulunuz

        int lenngt = 0 ;
        for (String w: countryPopulation.keySet()) {

            lenngt +=w.length();
        }

        int sum2 = 0;
        System.out.println("(lenngt+ sum) = " + (lenngt + sum));

         // 2. yol keySet methodu kullanılarak
        for (Map.Entry<String, Integer> w: entries) {

            sum2 += w.getKey().length() + w.getValue();

        }
        System.out.println("sum2 = " + sum2);

    }
}
