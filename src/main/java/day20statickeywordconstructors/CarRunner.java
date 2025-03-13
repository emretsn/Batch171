package day20statickeywordconstructors;

import java.sql.SQLOutput;

public class CarRunner {
    public static void main(String[] args) {
//Siz kendi constructor'inizi olusturdugunuzda java default constructor i siler.
        Car c1 = new Car("BMW","M4",2023,false);
        Car c2 = new Car("Audi","R8",2022,true);
        Car c3 = new Car("Honda","Civic",1999,false);
        Car c4 = new Car("BMW","M5",2022,false);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("c4 = " + c4);


    }
}