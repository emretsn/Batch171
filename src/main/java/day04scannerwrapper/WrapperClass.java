package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive     : char      - boolean - byte - short - int   - long - float -double
        //Wrapper Class : Character - Boolean - Byte - Short -Integer- Long - Float -Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //dolayisiyla sart degilse Wrapper Class kullanmayi tercih etmeyiz
        //n yazip nokta koyarsaniz hic method goremezsiniz cunku primitive ler method icermez
        int n = 12;

        // m yazip nokta koyarsaniz bir cok method gorebilirsiniz cunku wrapper classlar method icerir
        Integer m = 12;

        byte p = 33;
        Byte r = 44;

        //Ornek 1: short data type inin minimum ve maximum degerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768

        //Ornek 2: int data type inin minumum degeri ile byte data typeinin maximum degerinin toplamini bulunuz.
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);//-2147483521

        //Ornek 3: Primitive int i wrapper Integer a ceviriniz.(Autoboxing)
        int num = 12;
        Integer wrapperNum =num;

        //Ornek 4 :Wrapper Byte i primitive byte a ceviriniz.(Unboxing)
        Byte k =12;
        System.out.println(k);
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Ornek 5: Primitive char i Wrapper Character e ceviriniz(Autoboxing)
        char inital = 'm';
        Character initialWrapper = inital;

        //Ornek 6) Wrapper Booleani primitive boolean a ceviriniz(Unboxing)
        Boolean isOldWrapper = true;
        boolean isOldprimitive = isOldWrapper;

int c = 374;
Integer c2 = c;

    }
}