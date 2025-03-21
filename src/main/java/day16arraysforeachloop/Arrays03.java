package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Ornek 1: Integer bir array olusturunuz, icine 6 tane eleman yerlestiriniz.
        // Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int ages [] = new  int[6];
        ages[0]=20;
        ages[1]=23;
        ages[2]=19;
        ages[3]=44;
        ages[4]=15;
        ages[5]=32;

        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        //1. yol
        //sort() methodu array deki elemanlari kucukten buyuge dizer
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]
        System.out.println(ages[0] + ages[ages.length-1]);//59

        // 2. yol
        int min = ages[0];
        int max = ages[4];
        for (int w: ages) {
         min =   Math.min(min,w);
         max =   Math.max(max,w);

        }
        System.out.println("min + max = " + (min+max));

//Ornek 2: String bir array olusturunuz 6 eleman ekleyiniz, yellow dan onceki elemanlari yaziriniz
        String colors [] = new String [6];
        colors[0]="Red";
        colors[1]="Orange";
        colors[2]="Blue";
        colors[3]="Yellow";
        colors[4]="Green";
        colors[5]="Brown";
        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]

        for (String  w:   colors  ) {
            if(w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }






    }
}