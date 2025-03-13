package day35lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {
        System.out.println(topla());

        System.out.println(carpa());
        System.out.println(getFaktoriyel(0));

        System.out.println(toplam2(2, 5));


    }

    // 9. 7 den 70 e kadar tüm tam sayıların toplamını bulan kodu yazınız

    public static int topla(){
       return IntStream.
               rangeClosed(7, 70).
               reduce((Math::addExact)).
               getAsInt();
    }

    // 3 ten 9 a kadar çarpım
    public static int carpa(){
        return IntStream.
                rangeClosed(3, 9).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //11 size verilen sayının faktoriyelini hesaplayan kod yazınız
    public static int getFaktoriyel( int num){
       
        if(num==0){return 1;}
        else if (num<0) {
            System.out.println("faktoriyel işlemi negatif sayılarla yapılamaz");
            return -1;
        }else {
            return IntStream.rangeClosed(1, num).reduce(Math::multiplyExact).getAsInt();
        }}

    // 12 size verilen iki tam sayı arasındaki tüm çift sayıların toplamını veren kodu yazınız
    public static int toplam2( int num1, int num2){
       if(num1>num2){
           int temp = num1;
           num1=num2;
           num2=temp;
       }

        return
                IntStream.
                        range(num1+1, num2).
                        filter(Utils::isNumberEven).
                        reduce(Math::addExact).getAsInt();
    }




}
