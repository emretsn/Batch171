package day18multidimensionalarray;

public class Md04 {
    public static void main(String[] args) {

        //Ornek : Bir integer multidimensional arraydeki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}};//==> 4 + 43 = 47

        int small = ages[0][0];
        int big = ages[0][0];

        for (int[] w : ages) {
            for (int k : w) {
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small + big);

    }
}
