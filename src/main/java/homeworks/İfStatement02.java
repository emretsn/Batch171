package homeworks;

import java.util.Scanner;

public class İfStatement02 { //2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
    //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter day name");
        String dayName = input.next();

        if( dayName.equalsIgnoreCase("sunday")){
            System.out.println("1. day of the week");
        }else if( dayName.equalsIgnoreCase("monday")) {
            System.out.println("2. day of the week");
        }else if( dayName.equalsIgnoreCase("tuesday")) {
            System.out.println("3. day of the week");
        }else if( dayName.equalsIgnoreCase("wednesday")) {
            System.out.println("4. day of the week");
        }else if( dayName.equalsIgnoreCase("thursday")) {
            System.out.println("5. day of the week");
        }else if( dayName.equalsIgnoreCase("friday")) {
            System.out.println("6. day of the week");
        }else if( dayName.equalsIgnoreCase("saturday")) {
            System.out.println("7. day of the week");
        }else {
            System.out.println("this is not a day. please enter day name");
        }
    }
}
