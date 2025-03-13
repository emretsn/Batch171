package day23datetimevarargs;

import static javax.management.Query.plus;

public class Varargs01 {
    // her ihtimail için method oveerload etmek mümkün değildir
    // java da farklı sayıdsaki parametrelerde kullanılmak için oluşturulmuş yapılara Varags denir
    //Varags Array yapısını kullanır
    // note 1 bir method parantezinde birden fazla varags kullanılamaz sebebi zaten bir varags teoride sonsuz eleman alabilir
    // eğer bir method parantezinde birden fazla parametre kullanılacaksa varags en sona konur
    public static void main(String[] args) {
        System.out.println("topla(6,9.10,11,45) = " + topla(6,9,10,11,45));

    }

  /*
    private static int topla(int a. int b) {
        return a+b;}
    private static int topla(int a. int b, int c) {
        return a+b+ c;}
    private static int topla(int a. int b, int c, int d) {
        return a+b+ + d+ c;}
*/
    public static int topla(int c , int d, int b,int... a){
        int sum = 0;
        for (int w :
                a) {
            sum+= w;
        }
        return sum ;
    }
}
