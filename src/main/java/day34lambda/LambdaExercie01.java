package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercie01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        teklerinKaresi(nums);
        System.out.println();
        printSquareOfdistintEvenElement(nums);
        getMax(nums);
        getLittleİntbiggerThanSeven(nums);



    }

    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void teklerinKaresi(List<Integer> nums){
        nums.stream().
                filter(t-> t%2 != 0 ).
                map(t-> t*t).
                forEach(t-> System.out.print(t+" "));

    }

    //7)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını"
    // hesaplayan method oluşturun

    public static void printSquareOfdistintEvenElement(List<Integer> nums){
     int  total = nums.stream().distinct().filter(t-> t%2 == 0).map(t-> t*t).reduce((t,u)-> u+t).get();
        System.out.println(total);

    }

    //8) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void printSquareOfdistintEvenElement2(List<Integer> nums){
        int  total = nums.stream().distinct().filter(t-> t%2 == 0).map(t-> t*t).reduce((t,u)-> u*t).get();
        System.out.println(total);}

    //9)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun
    //1.yol
    public static void getMax(List<Integer> nums){
        int max = nums.stream().distinct().reduce((t,u)->Math.max(t, u)).get();
        System.out.println(max);
    }

    //11)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
// 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getLittleİntbiggerThanSeven(List<Integer> nums){
       int min =  nums.stream().distinct().filter(t-> t>7 && t%2 == 0 ).reduce((t,u)-> Math.min(t, u)).get();
        System.out.println(min);

    }
}
