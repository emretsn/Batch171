package day02datatypesmethodscreation;

public class Day2tekrar {
    public static void main(String[] args) {

        //ex1 anakra veizmir değerlerini variable oluşturup yazdırın

        String city1 = "Ankara";
        System.out.println(city1);
        city1 = "izmir";
        System.out.println(city1);
        // ex2 plaka varaible na 34 ve 35 değerleri atayıp konsola yazdırın
        byte plaka =34;
        System.out.println(plaka);
        plaka = 35;
        System.out.println(plaka);

        // ex 3 basarılımı sorusu için variabla true ve false değerlerini atayınız

        boolean isSuccesfully = true;
        System.out.println(isSuccesfully);

        isSuccesfully = false;
        System.out.println(isSuccesfully);
        /*
        Javada temelde 2 tip data vardr primitive ve non-primitive
       * primitive ; char boolean, byte, short, int, long, float, double
        *primite data typları nı java oluşturmuştur yenisi oluşturulamaz
        *primitive datalar data typlaırna göre farklı yer kaplarlar
        *primitive datalar içlerinde sadece sizin atadığınız değeri barınıdırırlar

        non-primitive data type;
        *orneğin string non primitive bir data typdır
        *üretilen her bir class non primitive data typdır bu yüzden sayısı sınırsızdır
        *non primitive data typler büyük harfle başlar
        non-primitivlerde datanın büyüklüğüne göre yer ayrılır sabit bir büyüklüğü yoktur
         */

        // ornwk ülke ismi
        String countryName = "turkiye";
        System.out.println(countryName);
        /*
        primitive ve nin primitive data typlar arasındaki farklar nelerdir

        primitiveler sadece bizim atadığımız değeri non primitiveler methodlarıda içerir
        primitiveler 8 tanedir diğeri sınırsız sayıda üretilebilir
        sabit obyut ve içeriğe göre değişen boyutlarda bellek
         */
        //METHOD CREATİON

       int sonuç =  toplamaYap(3,6);
        System.out.println(sonuç);

        System.out.println(carpmaYap(9,45));

    }

    public static int toplamaYap(int a,int b){
        return a+b;
        // main method static olduğu için main method içinde kullanacağımız methodlar statti olmalıdır

    }
    public static int carpmaYap(int a, int b){
        return a*b;
    }
}
