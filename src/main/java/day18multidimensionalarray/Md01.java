package day18MultiDimensionalArrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        // bir arrayın elamanları da arrayse bu multidimensional Arraydir
        // Multidimensional array nasıl oluşturulur
        // dışardaki outer array
        // birinci kutu dişardaki kumenin içerdiği inner array sayısı
        // 2. kutu inner Arraylerin eleman sayısı

        int a [][]= new int[3][4];

        a[2][2] = 5;
        System.out.println("Arrays.toString() = " + Arrays.toString(a));
        System.out.println(a[1].length);

    }
}
