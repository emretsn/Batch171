package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch04 {/*
             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter country name");
        String country = input.next();
        switch (country.toLowerCase()){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "ındia":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BE");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("this name is not defined8");
        }
    }

        /*
        1) Github ta bulunan projeyi kendi lokalimize almak icin;
            a) Clone lanmak istenen projinin url i kopyalanir.
            b)Intellij den file + new + project+ project from version control
            bundan sonra codelari intellij üzerinden terminal acilarak git pull denilerek kendi lokalimize cekebiliriz

        2) Kendi lokalimize almis oldugumuz projeyi Git hub ta saklamak icin;
            a) Git hub ta yeni bir repo olusturulacak, bunun icin repositories e tiklayin, sag ust kosede yesil new'e tiklayin
            b) Acilan sayfada bir isimlendirme yapilarak repo public mi olsun private mi olsun karar verilecek ve create a tiklanacak
            c) Acilan yeni bos repo sayfasindan url kopyalanacak
            d) Intellij den gondermek istedigimiz proje acik iken terminal kismi acilacak
            e) git push (=>url<=) copy + paste yapilarak enter yapacaksiniz
         */
}
