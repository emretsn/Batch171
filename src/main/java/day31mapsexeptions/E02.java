package day31mapsexeptions;

public class E02 {
    public static void main(String[] args) {
        String s = "1234";
        convert(s);

        String t = "123a";
        convert(t);


    }
    // içinde sayılar dışında bir karakter olan Stringi ınt e çevirmek isterseniz NumberFormatException hatası alırsınız
    public static void convert(String s){
        try {
            Integer intS = Integer.valueOf(s);
            System.out.println(intS+1);
        }
        catch (NumberFormatException e){
            System.out.println("enter only numbers");
            System.out.println("e.getMessage() = " + e.getMessage()); // logda verilen hata mesajını konsola yazdırır
        }

    }
}
