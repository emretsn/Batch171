package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        // kulanıcıdan alacağınınz 5 basamaklı bir sayının
        //ilk iki ve son iki basamağindaki rakamların toplamınını yazdıran kod
        Scanner input = new Scanner(System.in);
        System.out.println("plese enter five digit number");
        int number = input.nextInt();
        int firsttwo= number/10000 + number/1000-number/10000*10;
        int lasttwo= number%10+ (number%100-number%10)/10;
        int total= firsttwo+lasttwo;
        System.out.println("total = " + total);
    }
}
