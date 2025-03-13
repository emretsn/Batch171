package day17arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int arr[] = {23,354,54,5,6,3};

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        // verilin arrayde kaç tane çift sayı kaç tane tek ası olduğunu bulan kodu yazınınz



        int sumcift = 0;

        for (int w :  arr) {
            if (w%2==0){
                sumcift++;
            }
        }
        System.out.println("çift sayıların sayısı: " + sumcift);
        System.out.println("tek sayıların adedi: "+ (arr.length-sumcift));

        //ornek2 : verilen bir Strin arrayden karakter sayısı 5 ten az olanları yazdırın
        String arr2 [] = new String[6];
        arr2 [0]=  "emre";
        arr2 [1]=  "ahmet";
        arr2 [2]=  "ibrahim";
        arr2 [3]=  "abuzettin" ;
        arr2 [4]=  "çavuş";
        arr2 [5]=  "filiz";

        for (String w: arr2) {
            if (w.length()<=5){
                System.out.println(w);
            }
        }

        //ornek3: size veerilen bir Stiring arraydeki isimleri alfabatik sıraya
        // koyduktan sonra  f ile başlayan ismler hariç konsola yazdırın
// sort() methodu sayısal ifadeleri küçükten büyüğe sıralar  (ascending order)
       // sort methodu String ifadeleri alfabetik olarak sıralar (alphabetical order)
        //ascendin order + alphabetical order ==> NAtural order

        Arrays.sort(arr2);
        for (String w: arr2) {
            if (w.toLowerCase().startsWith("f") ) {
                continue;
            }
            System.out.println(w+"       ornek3");
        }
    }

}
