package day10ifstatements;

import java.util.Scanner;

public class IfStatermenets02 {
    // girilen sayının haftanın kaçıncı günü olduğunu gösteren kodu yazınınz
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number of day");
        int dayNum = input.nextInt();
        if(dayNum ==1){
            System.out.println("day is sunday");
        }
        else if(dayNum ==2){
            System.out.println("day is monday");
        }
        else if(dayNum ==3){
            System.out.println("day is tuesday");
        }else if(dayNum ==4){
            System.out.println("day is wednesday");
        }else if(dayNum ==5){
            System.out.println("day is thursday");
        }else if(dayNum ==6){
            System.out.println("day is friday");
        }else if(dayNum ==7){
            System.out.println("day is saturday");
        }else {
            System.out.println("please enter a number from 1 to 7 ");
        }

        }

    }
