package day35lambda;

import java.util.ArrayList;
import java.util.List;

public class Lamda04tekrar {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("elif");
        myList.add("yusuf");
        myList.add("elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        remove(myList);
        System.out.println(myList);


    }
    // karakter sayısı 5 ten fazla olan elemanları silen kodu yazınınız

    public static List<String> remove(List<String>names){
        names.removeIf(t-> t.length()>5 );
        return names;
    }
}
