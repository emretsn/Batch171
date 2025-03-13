package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        //Bir Array in elemanlari Array ise bU Array ler Multidimensional Array dir

        //Multidimensional Array nasil olusturulur?

        int a[][] = new int[3][2];
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]

        //MultiDimensional Array lere eleman nasil eklenir?
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;

        System.out.println(Arrays.toString(a));//[[I@511baa65, [I@340f438e, [I@30c7da1e]
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Multidimensional arrayleri console a yazdirmak icin "toString()" methodu degil
        //"deepToString()" methodunu kullanmaliyiz

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir.
        System.out.println(a[1][1]);//45
        System.out.println(a[2][0]);//123

        //Multidimensional Array icindeki array nasil yazdirilir?
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(Arrays.toString(a[2]));//[123, 0]

        //Kisa yoldan Multidimensional array nasil olusturulur?
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        //Ornek 1: Yukaridaki students arrayinde toplam kac tane isim oldugunu bulunuz

        int sum = 0;
        for (String[] w : students) {
            sum = sum + w.length;
        }
        System.out.println(sum);
    }
}
