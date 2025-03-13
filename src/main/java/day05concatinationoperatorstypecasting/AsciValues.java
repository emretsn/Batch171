package day05concatinationoperatorstypecasting;

public class AsciValues {
    public static void main(String[] args) {
        /*
        java da her karakterin sayisal bir degeri vardir
        Bu degerler ASCII degerler olarak adlandirilir
        Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir
         */
        char a = 'a';
        System.out.println(a);//a

        //Herhangi bir character'in ASCII degerini bulmak icin o karakteri "int" data type inda bir variable icine koyunuz
        int intA = 'a';
        System.out.println(intA);//97

        byte unlem = '!';
        System.out.println(unlem);//33

        char c1 = 'K';
        char c2 =  '?';
        System.out.println(c1+c2);//138
        //java da char lari matematiksel islemlerde kullanirsaniz, java char larin ASCII degerlerini kullanir
        char A  = 'a' ;
        char b ='b';
        System.out.println( A + b);
        int x = '%';
        System.out.println("x = " + x);

    }
}