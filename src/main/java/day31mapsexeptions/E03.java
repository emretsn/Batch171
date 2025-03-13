package day31mapsexeptions;

public class E03 {

    public static void main(String[] args) {
        String s = "java" ;

        getCharFromString(s, 2);

        // Stringlerde var olmayan indexler kullanıldığında java StringIndexOutOfBoundsException hatası verir

        String t = "java" ;
        getCharFromString(t, 4);



    }

    public static void getCharFromString(String s , int index){
        char ch = 0;


        try {ch = s.charAt(index);
            System.out.println("ch = " + ch);

        } catch (Exception e) {
            System.out.println("olmayan index girişi yaptınız");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace(); // hata mesajını yazdırdı kod çalışmaya devam etti

            System.out.println("kod çalışmaya devam etti");

        }


    }
}
