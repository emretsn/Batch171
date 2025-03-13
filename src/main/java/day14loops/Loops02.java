package day14loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("please enter first and last number");
        int numf = in.nextInt();
        int numl = in.nextInt();

        int sum =0;
        int multply=1;
        for (int i = numf;i<=numl;i++){
            sum +=i ;
            multply *= i;
        }
        System.out.println("Total = " + sum);
        System.out.println("multply = " + multply);
// girilen değere kadar verilen sayıların toplamını ve çarpımını  veren kodu yazınız
// verilen bir tam sayının rakamalrının toplamını veren kodu yazınınz
        // 578 ==> 20
        System.out.println("please enter a number");
        int num = in.nextInt();
        Integer num1 =num;
        int basamakS = num1.toString().length();
        int sum2= 0;
        for(int i= 0;i<basamakS;i++){
            sum2= sum2+num%10;
            num=num/10;
        }
        System.out.println("sum of digits " + sum2);

    }
}
