package day05concatinationoperatorstypecasting;

public class TypeCasting {
    /*
    Numeric primitve data type larinin birbirine donusturulmesine "Type Casting " denir
    Numeric (sayisal) Data typelar  byte  -  short   -   int  -   long    -   float   -  double
     */
    //Note 1: Kucuk data typelarini buyuk data typelarina cevirmeyi java otomatik olarak yapar
    //bu isleme "AutoWidening" (otomatik genisletme) denir.

        //Note 2: Buyuk data typelarini kucuk data typelarina cevirmek riskli bir istir, java bu riskli isi otomatik olarak yapmaz
        // bu islemi kod yazanlardan bekler.
        //Bu isleme "ExplicitNarrowing" (Aciktan Daraltma) denir

    public static void main(String[] args) {
        //byte data type ini int data type ina cevirinz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //int data typeini short data type ina ceviriniz
   int weight=312;
        short weightShort = (short)weight;//Explicit Narrowing
        byte x = 2 ;
        int xİnt = x;
        int y =3 ;
        short yShort = (short) y;
    }

}