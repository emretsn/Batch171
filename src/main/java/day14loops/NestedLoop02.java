package day14loops;

import java.util.Scanner;

public class NestedLoop02 {
    public static void main(String[] args) {
       /*              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */
        Scanner in = new Scanner(System.in);
        System.out.println("please enter row number");
        int row = in.nextInt();
        System.out.println("please enter column number");
        int column = in.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    // nested yapıların hepsi gibi nested looplarda javanın vaktini aldığı
    // için çok fazla kullanılması tavsiye edilmez
}
