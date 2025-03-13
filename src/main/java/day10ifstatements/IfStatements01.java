package day10ifstatements;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("number is negative");
        } else if (num == 0) {
            System.out.println("number is nötr");
        } else {
            System.out.println("number is pozitive");
        }
    }

    }

