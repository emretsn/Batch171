package day21arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        /*
        1)Ayni data type indaki coklu data lari depolamak icin Array kullaniriz
        2)Arraylerin bir negatif yonu var; icine koyacagıniz eleman sayisini en basta belirlemek zorundasiniz
        3)Arrayler eleman sayisinda esnek degildirler. Bu yuzden Java "Arraylist" adli yeni bir yapi olusturdu
        Bu yapi eleman sayisinda esnekdir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar.
         1000 tane eleman koyarsaniz eleman sayisini 1000 olarak ayarlar
        4)Arraylist yerine sadece List de diyebiliriz
        5) Java Arraylistleri olusturduktan sonra Arrayleri iptal etmedi cunku;
            a)Array ler super hizlidir
            b)Array ler memory de cok az yer kaplarlar
            c)Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir
        6) Arrayler pirimitive data type lari ve non-pirimitive lerin reference larini depolayabilir.
        ama Arraylistler "non-primitive" data type larini depolar. bu yuzden Arraylistler Arraylerden daha cok yer kaplar
         */

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        //ArrayList console a nasil yazdirilir?
        System.out.println(ages);

        //Arraylistlere eleman nasil eklenir?
        //Arraylistlere eleman eklemek icin add() methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada list e ekler.(Insertion Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 777);
        ages.add(888);
        System.out.println(ages);

        //List e coklu eleman nasil eklenir? veya List e baska bir list nasil eklenir?
        //Bir list' e coklu eleman eklemek icin o elemanlari once bir list'in icine koymalisiniz.

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges);//[8, 9, 10]

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2, newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //ArrayList'te eleman sayisi nasil bulunur?
        //size() method u bir listteki eleman sayisini verir
        int numOfElement = ages.size();
        System.out.println(numOfElement);//12

        //ArrayListte specific bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        //ArrayList te specific bir eleman nasil degisitirilir?
        ages.set(6, 111);
        ages.set(4, 313);
        System.out.println(ages);

        //Bir List teki tum elemanlari nasil silebilirim?
//        ages.clear();
//        System.out.println(ages);//[]

        //ArrayListte specific bir elemanin var olup olmadigini nasil anlariz?
        boolean r = ages.contains(656);
        System.out.println(r);//true

        //Bir ArrayList'in bos olup olmadigini nasil kontrol edebiliriz.
        //isEmpty() methodu Arraylist bos ise true bos degilse false return eder.
        boolean r2 = ages.isEmpty();
        System.out.println(r2);

        //Ornek: Size verilen bir list in bos olup olmadigini kontrol eden kodu yaziniz
        ArrayList<String> names = new ArrayList<>();
        names.add("Saadet");
        names.add("Kasim");
        names.add("Ekim");
        names.add("Ali");

        //1. way
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        names.clear();

        //2. Way Recommended
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        /*
            Bir method ogrenirken 3 seyi ogrenin;
            1) O method ne is yapar?
            2) O method nasil kullanilir?
            3) O method size neyi verir?
         */

    }
}