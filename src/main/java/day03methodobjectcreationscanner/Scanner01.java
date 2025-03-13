package day03methodobjectcreationscanner;
// java nın util kutuphanesinden scanner import edildi.
import java.util.Scanner;
public class Scanner01 {
    public static void main(String[] args) {
        // 1. Adım : Scanner Class tan object olustur
        Scanner input = new Scanner(System.in);
        //2. Adım kullanıcıya ne istediğimize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz");
        //3. Adım: uygun methodu kullanarak kullanıcının verdiği datayı memory e yerleştiriniz
        byte age = input.nextByte();
        System.out.println("age = " + age);
    }
}