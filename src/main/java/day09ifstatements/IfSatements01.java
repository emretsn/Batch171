package day09ifstatements;

public class IfSatements01 {
    public static void main(String[] args) {
        // sayının üç basamaklı olduğunu kontrol eden kod
        int num1 =-546;
        if (num1> 99 && num1<1000 || num1<-99 && num1> -1000);{
            System.out.println(num1 +"; Üç basamaklıdıır");}
        // 2. swçwnwk math klasıyla mutlak değer yapmak

        num1 = Math.abs(num1);
        System.out.println("bu sayı üç basamaklıdır " + num1);

        // bir Strindeki tekrarsız karakter ayısını ekrana yazdıran kod
        // abbbccdc==> ad

        String str = "aac";
        char ch1 = str.charAt(0);
       if (str.indexOf(ch1)==str.lastIndexOf(ch1)){
           System.out.println(ch1);;
       };
        char ch2 = str.charAt(1);
        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);;
        };
        char ch3 = str.charAt(2);
        if (str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);;
        };
    }
}
