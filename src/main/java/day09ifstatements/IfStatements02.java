package day09ifstatements;

import java.util.Scanner;

public class IfStatement02
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = input.nextInt();
        if (num%2==0 ){
            System.out.println("the Number is dual");
        }
        else System.out.println("the number is singel");
    }
}
