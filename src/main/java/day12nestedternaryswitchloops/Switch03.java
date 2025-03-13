package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz


        Scanner input = new Scanner(System.in);
        System.out.println("please enter two number");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("+, -, *, /, % işlelerinden birini seçininz");
        char opr = input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-' :
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println("num1/num2 = " + num1 / num2);
                break;
            case '%':
                System.out.println("num1/num2*100 = " + num1*num2/100);
                break;
            default:
                System.out.println("please enter valid operatör");


        }

    }
}