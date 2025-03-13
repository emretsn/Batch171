package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        /*
        1)Lambda "Functional Programming" dir, digeri "Structured Programming"
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

        printElements1(nums);
        System.out.println();
        printElements2(nums);
    }

    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured == Yapisal)
    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }

    //2) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums) {
        nums.stream().forEach(t -> System.out.print(t + " "));
    }


    //3) Bir list'teki cift elemanlari ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1(List<Integer> nums){
        for ( Integer w:nums   ) {
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printEvenElements2(List<Integer> nums){

    }







}