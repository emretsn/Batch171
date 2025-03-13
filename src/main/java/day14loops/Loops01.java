package day14loops;

public class Loops01 {
    // örnek1 verilen stringi ters çevirip yazan kod yazınınz interviev sorusu
    public static void main(String[] args) {
        String str = "ne bakıyon gevşek ";

        String ters2 ="";
        for (int i =str.length()-1;i>=0;i--){
            ters2 = ters2+str.charAt(i);
            System.out.print(ters2);
// substring kullanımı
            //ters = ters + str.subsitring(i,i+1);
            //sout(ters) ifade süslü parantezin dışına
        }
        //Ornek 2 Size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz
        //         ey edip adanada pide ye , nalan, kucuk, ada
        //Logic : String i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise Palindrome dur.
        String duz = "Ey edip adanada pide ye";
        String ters3 = "";

        for (int i=duz.length()-1 ; i>=0; i--  ){
            ters3=ters3+duz.charAt(i);
        }
        System.out.println(ters3);

        if(duz.equalsIgnoreCase(ters3)){
            System.out.println("Palindrome dur");
        }else{
            System.out.println("Palindrome degildir");
        }


    }
}
