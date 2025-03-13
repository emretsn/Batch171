package day23datetimevarargs;

public class VArags02 {
    public static void main(String[] args) {

        //Example2 verilen isimlerin ilk harflerini konsola yazdıran methodu oluşturunuz
        // Ali Cemal >> AK Emre Tosun >>ET

        String a = "Emre Tosun ";
        String b = "İbrahim Kartakaya ";

        firstLatters(a,b);
        firstLatter(a,b,"Mehmet Emre Tosun");
    }

    private static void firstLatters(String ... n) {
        String initials = "";
        for (String w: n) {
          initials= initials+  w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";
        }


    }
    public static void firstLatter(String... name){
       try {
           for (String w:name) {
               String firstLAtter = w.split(" ")[0].substring(0, 1) + w.split(" ")[1].substring(0, 1) + w.split(" ")[2];
               System.out.println(firstLAtter);
           }
       }catch (IndexOutOfBoundsException e){
           for (String w:name) {
               String firstLAtter = w.split(" ")[0].substring(0, 1) + w.split(" ")[1].substring(0, 1);
               System.out.println(firstLAtter);
           }
    }
}}