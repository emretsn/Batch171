package day02datatypesmethodscreation;

import day04scannerwrapper.Scanner01;

import java.util.Scanner;

public class MethodHomework {// dikdörtgenin alanınını hesaplayan methodu oluştururp kullnın
// dikdörtgenin çevresini hesaplayan methodu oluşturunuz
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter side lenghts of rectangle");
        int x = scan.nextInt();
        int y = scan.nextInt();

        int area = areaCalculatin(x,y);
        System.out.println("area = " + area);
        environment(x,y);
    }

    private static int areaCalculatin(int x,int y) {
        return x*y;
    }
    public static  void environment(int z,int t){
        System.out.println("Enviroment: "+ (2*z+2*t)); }



}
