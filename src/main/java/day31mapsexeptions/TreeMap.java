package day31mapsexeptions;

import java.util.HashMap;

public class TreeMap {
    /*
    1) TreeMap "thread safe" ve synchronized değildir
    note; Maplerde multithread kullanmamız gerektiğinde sadece HashTable kullanabilirsiniz
    2) treeMap entryleri keylerine göre natural ordera göre sıralar, bu yüzden çok yavaştır
    3) treeMaplerin keylerinde null kullanılamaz, ancak valuelarında istediğiniz kadar kullanabilirsiniz

     */
    public static void main(String[] args) {

        java.util.TreeMap<String, Integer > countryPopulation = new java.util.TreeMap<>();
        countryPopulation.put("usa", 4000);
        countryPopulation.put("TR", 5000);
        countryPopulation.put("fk", 30000);
        countryPopulation.put("br", 2000);
        countryPopulation.put("hl", 1000);
        // bu yöntem yavaş olduğu için tavsiye edilmez tavsiye edilen yöntem Aşşağıda
        System.out.println("countryPopulation = " + countryPopulation);


        HashMap<String,Integer> countryPop =new HashMap<>();
        countryPop.put("usa", 4000);
        countryPop.put("TR", 5000);
        countryPop.put("fk", 30000);
        countryPop.put("br", 2000);
        countryPop.put("hl", 1000);

        java.util.TreeMap<String ,Integer> cntpoptree = new java.util.TreeMap<>(countryPop);
        //tavsiye edilen yöntem HashMap kullanıp sonra TreeMap ile sıraya dizmektir



    }



}

