package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        // Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile tam bolunebilen tamsayilari ekrana yazdiran kodu yaziniz
for (int i=21;i<181;i++){
    if (i %3==0 && i%2==0) {
        System.out.print(i+" ");
    }
    System.out.println("\n");
}

// 2 size verilen küçük harfle yazılmış Stringin indexi çift sayı olan karakterleri büyük harfe dönüştür
     String str = "ankara";
int y = str.length();
str = str.toUpperCase();
        for (int i= 0; i < y; i++) {
            if (i%2==0){
                System.out.print( str.charAt( i));
            }

        }
        System.out.println("\n");
        // ornek 3: vrilemn bir stringte ilk a harfinden önceki tüm karakterleri konsola yazdırınız
        String s = "I love java";
        for (int i = 0; i < s.indexOf('a'); i++) {
            System.out.print(s.charAt(i));
        }
        //2. yol
        System.out.println("\n");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));
        }
        System.out.println("\n");
        // ornek 4 Stringde son a dan sonraki tüm karakterleri ter sırada yazdırın
        String x = "germany";
        for (int i = x.length()-1; i > x.indexOf('a') ; i--) {
            System.out.print(x.charAt(i)+" ");}

    }
}