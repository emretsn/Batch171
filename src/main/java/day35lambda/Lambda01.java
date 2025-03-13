package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("elif");
        myList.add("yusuf");
        myList.add("elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementExeptStartWithE(myList);

        printDistinctElmentsLengthLessThanFive(myList);
        System.out.println();

        printDistinctElmentsLengthmoreThanFive(myList);

        printDistinctElmentsTolowerCaseLengthlessThanFive(myList);

        printDistinctelementsWithALphabeticOrder(myList);

        sırala(myList);

        System.out.println();

        //removeIfLengthGreaterThanFive(myList);

        removeIfElementstarthWithzorAndWithF(myList);



    }

    // Example 1: E ile başlayanlar hariç ekrana yazdır

    public static void printElementExeptStartWithE(List<String> names){
        names.stream().
                filter(t-> !t.startsWith("e")).
                forEach(t-> System.out.println(t));
    }

    // karakter sayısı 5 ten az olanlar
    public static void printDistinctElmentsLengthLessThanFive(List<String> names){
        names.stream().distinct().filter(t-> t.length()<5).forEach(t-> System.out.print(t+" "));
    }

    //  5 ten çok kartakterli olanları büyük harfle yazdırın
    public static void printDistinctElmentsLengthmoreThanFive(List<String> names){

        System.out.println(names.stream().
                filter(t -> t.length() > 5).
                map(t -> t.toUpperCase()).
                collect(Collectors.toList()));

    }
    // bu şekilde kullanmak tavsiye edilir
    public static void printDistinctElmentsLengthmoreThanFive2(List<String> names){

        System.out.println(names.stream().
                filter(t -> t.length() > 5).
                map(String::toUpperCase).
                collect(Collectors.toList()));}

    //5 ten az elemanlıları küçük harflerle ekrana yazdır( NAtural ordera göre)
    public static void printDistinctElmentsTolowerCaseLengthlessThanFive(List<String> names) {
        names.stream().
                distinct().
                filter(t-> t.length()<5).
                sorted().map(String::toLowerCase).// ClassName :: methodName == Method referance Tavsiye edilen yol budur
                forEach(System.out::println);

    }
    //elemanlıları büyük harflerle alfabetik sırada ekrana yazdır
    public static void printDistinctelementsWithALphabeticOrder(List<String> names) {
        names.stream().
                distinct().
                sorted().map(String::toUpperCase).
                forEach(Utils::printİnTheSameLineWithSpace); // best practist budur tavsiye edilen de budur.
    }

    // tekrarsız olrak küçük harflerle uzunluklarına göre küçükten büyüğe sırlayarak yazdıran kodu yazınız
    // String classına git bu methodu kullan utist classı oluşturuduk ve ve ordaki methodu kullandık

    public static void sırala( List<String>names){
        names.stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::printİnTheSameLineWithSpace);
    }
// karakter dayısı 5 ten fazla olan elemanları silen kodu yazınınız

    public static void removeIfLengthGreaterThanFive(List<String> names){
        names.removeIf(t-> t.length()>5);
        System.out.println(names);
    }
    // Z ile başlayan yada F ile biten elemanları siliniz

    public static void removeIfElementstarthWithzorAndWithF(List<String> names){
       names.removeIf(t-> t.startsWith("Z") || t.charAt(t.length()-1)=='f');
        System.out.println(names);
    }


    }
