package homeworks;

import java.util.Scanner;

public class İfStatement { /*Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
            //ve kullaniciya uygun mesaj veren kodu yaziniz
            2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
    //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....
    3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
    //  1==> January, 2 ==> February .....
*/
    public static void main(String[] args) {


        //1. example
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your password");

        String pwd = input.next();

        if (pwd.equals("pwd123!")){
            System.out.println("passoword is true");

        }else {System.out.println("passoword is false try again");}
    }


}
