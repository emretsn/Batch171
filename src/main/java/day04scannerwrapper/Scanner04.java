package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        // kullanıcıdan dikdörtgenin iki kenar uzunluğu
        // alan ve çevre hesapla
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the short and long side of the rectangle");
        double shortSide = input.nextDouble();
        double longSide = input.nextDouble();
        double area = (shortSide*longSide);
        double perimeter = (2*shortSide+2*longSide);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}
