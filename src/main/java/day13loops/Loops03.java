package day13loops;

public class Loops03 {
    public static void main(String[] args) {
        //Ornek 1 : Verilen bir string de kucuk harfleri console a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
String s = "Pwd12?Ab";
for (int i =0 ;i<s.length() ;i++){
    char ch = s.charAt(i);
    if (ch<'z'&& ch>'a'){
        continue;
    }else {
        System.out.print(ch);
    }

}
// break ile continue arasındaki fark nedir
        // break switchin dışına çıkmak için ve loopu kırmak için kullanılır
        //continue ise loop yaparken bazı elemanları işleme sokmamak için kullanılır
        // bir looptaki geçerli iterationu sonlandırıp sizi arttırma azaltma bölümüne getirir
    }
}