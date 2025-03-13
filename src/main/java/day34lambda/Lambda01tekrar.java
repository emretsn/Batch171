package day34lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01tekrar {
    public static void main(String[] args) {
        /*
        1)Lambda "Functional Programming" dir, digeri "Structured(yapısal) Programming"
        2) Functional Programming de "Ne yapilacak" (what to do) uzerine yogunlasilir
           "Structured Programming" "Nasil yapilacak" (how to do) uzerine yogunlasilir
        3) Functional Programming java 8 ile kullanilmaya  baslandi
        4)  Functional Programming Collectionlar, ve Arraylerde kullanilir
         */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printElement1(nums);
        System.out.println();
        printElement2(nums);

        System.out.println();

        printEvenElements01(nums);
        System.out.println();
        printEvenElements02(nums);

        System.out.println();

        teklerinkaresi(nums);

        System.out.println();

        teklerinKüpü(nums);

        çiftlerinKüpü(nums);

        getMaxValue(nums);

        getMinValue4(nums);

        getMinValue2(nums);

        getMinValue3(nums);

        getMinValue1(nums);

        getMinGreaterThanSevenEven(nums);
    }
    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured == Yapisal)

    public  static void printElement1(List<Integer> nums){
        for (Integer w : nums) {
            System.out.print(w+" ");
        }
    }
    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Functional)
    public  static void printElement2(List<Integer> nums){
        nums.stream().forEach(t-> System.out.print(t+" "));
    }

    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Structured)
    public  static void  printEvenElements01(List<Integer> nums){
        for (Integer w: nums) {
            if (w%2== 0){
                System.out.print(w+" ");
            }

        }

    }
    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)

    public  static void  printEvenElements02(List<Integer> nums) {
        nums.stream().
                filter(t-> t%2 ==0 ).
                forEach(t-> System.out.print(t + " ")); // her bir noktadan sonr boşluk koymak daha okunabilir bir kod için gereklidir


    }

    //5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public  static  void teklerinkaresi(List<Integer> nums){
        nums.
                stream().
                filter(t-> t%2 !=0).map(t-> t*t).
                forEach(t-> System.out.print(t+" "));
    }


    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static  void teklerinKüpü(List<Integer> nums){
        nums.stream().
                distinct().
                filter(t-> t%2 != 0).
                map(t-> t*t*t).
                forEach(t-> System.out.println(t+ " "));
    }


    //7)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını"
    // hesaplayan method oluşturun

    public static  void çiftlerinKüpü(List<Integer> nums){ // reduce toplam çarpım gibi tek değere indirgemme var ise kullanılır
       int sum =  nums.
               stream().
               distinct().
               filter(t-> t%2 == 0 ).
               map(t-> t*t).
               reduce(0,(t,u) -> t+u);
        System.out.println(sum);

    }


    //8) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void karelerinCarpımı(List<Integer> nums){
        int product = nums.stream().
                distinct().
                filter(t-> t%2 ==0 ).
                map(t-> t*t).
                reduce(1,(t,u)-> t*u);
        System.out.println(product);
    }

    //9)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun
    //1.yol

    public static void getMaxValue(List<Integer> nums){
     int   maxvalue =
             nums.stream().
                     distinct().
                     reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t:u );
        System.out.println(maxvalue);
    }
    //2.yol
    public static void getMaxValue2(List<Integer> nums){
        int   maxvalue2 =
        nums.stream().
                distinct().
                reduce(nums.get(0),(t,u)-> t>u ? t:u );
        System.out.println(maxvalue2);
    }

    //3.yol
    public static void getMaxValue3(List<Integer> nums){
        Integer max3 =
                nums.stream().
                        distinct().
                        sorted().
                        reduce((t,u)-> u ).get();
        System.out.println(max3);
    }


    //4.yol

    public static void getMaxValue4(List<Integer> nums){
        Integer max4 =
        nums.stream().
                distinct().
                reduce(Math::max).get();
        System.out.println(max4);
    }

    //10)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun
    //1.yol
    public static void getMinValue4(List<Integer> nums){
     int   min =
             nums.
                     stream().
                     distinct().
                     reduce(Math::min).get();
        System.out.println(min);

    }
    // 2. yol
    public static void getMinValue2(List<Integer> nums){
        int   min =
                nums.
                        stream().
                        distinct().
                        sorted(Comparator.reverseOrder()).
                        reduce((t,u)-> u ).get();
        System.out.println(min);}

//3. yol
public static void getMinValue3(List<Integer> nums){
    int   min =
            nums.
                    stream().
                    distinct().
                    sorted().
                    reduce((t,u)-> t ).get();
    System.out.println(min);}

    // 4. yol
    public static void getMinValue1(List<Integer> nums){
        int   min =
                nums.
                        stream().
                        distinct().
                        sorted().
                        reduce((t,u)-> Math.min(t, u) ).get();
        System.out.println(min);}
    //11)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
// 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGreaterThanSevenEven(List< Integer> nums){
      Integer min =   nums.stream().filter(t-> t>7 && t%2 == 0).sorted().reduce((t,u)->t).get();
        System.out.println(min);
    }



}
