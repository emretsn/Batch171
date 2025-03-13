package day32exeptions;

public class E03 {
    public static void main(String[] args) {

        /*
        throw keyword bir methodun bodysi içinde istediğimiz yerde istediğimiz koşullar içinde istediğimiz kadar
        exeption atmamızı sağlar.

        throw keyword yazıldıktan sonra bir exeption class objecti oluşturulur

        Exeption class constructer ının parantezinin içine istediğiniz mesajı yazabilirsiniz
         */

        try {
            prianAge(-63);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage()); ;
        }


    }
    public static  void prianAge(int age){
       if (age<0){
           throw new IllegalArgumentException("Age can not be negative");
           // javaya bir hata tanımladık koşul gerçekleşirse hatayı vericek

       }
       else { System.out.println(age);}

    }
    }
