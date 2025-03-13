package day21arraylists;

import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {


        //Kisa yoldan bir list nasil olusturulur?
        //List.of() methodu  degistirilemez bir list olusturmak icin kullanilir,
        // Degisiklik yapmaya yonelik methodlari desteklemez
        List<Character> initials = List.of('a', 'k', 'c', 'd', 'k');
        System.out.println(initials);//[a, k, c, d, k]
        //initials.add('b');
        // initials.remove(initials.indexOf('k'));
        //initials.set(0,'u');
        System.out.println(initials);//[a, k, c, d, k]


        //indexOf(aranan karakter) methodu aranan karakterin ilk gorunumunun index ini verir.
        int r1 = initials.indexOf('k');
        System.out.println(r1);

        //lastIndexOf(aranan karakter) methodu aranan karakterin son gorunumun index ini verir.
        int r2 = initials.lastIndexOf('k');
        System.out.println(r2);


    }

}