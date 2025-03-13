package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //ornek1: kullanıcının çoklu datayı bir arraya yerleştirebilmesi
        // ve durdurabilmesi için gereken kodu yazınız


        Scanner in = new Scanner(System.in);
        System.out.println("arrayde kaç data olacak");
        int arrNum = in.nextInt();
String stdNames [] = new String[arrNum] ;
        System.out.println("islemi durdurak için 'q' ye  basınınz");

        for (int i = 0 ;i< stdNames.length;i++) {
            System.out.println(i+1 +". ögrenci ismini giriniz");
            String name = in.next();

            if (name.equalsIgnoreCase("q")){
                break;
            }else {
                stdNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(stdNames));

    }
}
