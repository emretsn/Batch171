package day15loops;

public class LoopExerise01 {
    public static void main(String[] args) {
        //1. Bir String’de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //2.Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //3.Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A
        //A A A A A
        //A A A A A
        //4.Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A
        //A A
        //A A A
        //A A A A
        //5.Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
        //kod yazınız.

        String str = "java bitiyor ";
        String tekrarlı = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.substring(i, i + 1)) != str.lastIndexOf(str.substring(i, i + 1))) {

                if (!tekrarlı.contains(str.substring(i, i + 1))) {
                    tekrarlı += str.substring(i, i + 1) + ", ";
                }

            } else continue;

        }
        System.out.println(tekrarlı);

        int num = 1234555566;
        String s = String.valueOf(num);
        int slength = s.length();
        String str2 = "";


        for (int i = 0; i <slength ; i++) {

          if (s.indexOf(s.substring(i, i+1))==s.lastIndexOf(s.substring(i,i+1))) {
              if (!str2.contains(s.substring(i, i+1))){
                  str2+=s.substring(i, i+1);
              }
          }

        }
        System.out.println(Integer.valueOf(str2));

        for (int i = 0; i <3 ; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }

        for (int i = 1; i <5 ; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("A ");

            }
            System.out.println();
        }

        int a = 'A';
        int b ='B';



    }

}
