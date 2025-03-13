package day10ifstatements;

import java.util.Scanner;

public class IfStatermenets03 { // girilen ay ismimnin kaçıncı ay olduğunu yazan kod
    //January, February, March, April, May, June, July,
    // August, September, October, November, December,
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter month name");
       String month = input.next();
       if (month.equals("january")){
           System.out.println("1. month");
       } else if (month.equalsIgnoreCase("february")){
            System.out.println("1. month");
        }else if (month.equalsIgnoreCase("march")){
           System.out.println("1. month");
       }else if (month.equalsIgnoreCase("april")){
           System.out.println("1. month");
       }else if (month.equalsIgnoreCase("may")){
           System.out.println("1. month");
       }else if (month.equalsIgnoreCase("june")){
           System.out.println("1. month");
       }else if (month.equalsIgnoreCase("july")){
           System.out.println("1. month");
       }else if (month.equals("august")){
           System.out.println("1. month");
       }else if (month.equals("september")){
           System.out.println("1. month");
       }else if (month.equals("october")){
           System.out.println("1. month");
       }else if (month.equals("november")){
           System.out.println("1. month");
       }else if (month.equals("desember")){
           System.out.println("1. month");
       }else  {
           System.out.println("invalid name");
       }

    }
}
