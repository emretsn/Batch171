package day15loops;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
   /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */
        Scanner input = new Scanner(System.in);
        int counter = 0;
        do {
            if (counter == 4){
                System.out.println("hesabiniz bloke olmustur!");
                break;

            }
            System.out.println("lutfen username girin");
            String useName = input.next();
            System.out.println("password girin");
            String password = input.next();

            if (useName.equals("admin") && password.equals("pwd123")){
                System.out.println("hesabiniza hosgeldiniz");
                break;
            } else {
                System.out.println("kullanici adi veya sifre yanlis tekrar deneyin");
            }
            counter++;

        }while (true);


    }
}