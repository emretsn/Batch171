package day31mapsexeptions;

public class E05 {
    public static void main(String[] args) {

        int a = 12 ;
        int b = 4 ;
        String s = "Java" ;
        getidx(a, b , s);



    }
    public static void getidx(int a , int b , String s){
        int idx = 0;
        try {
            idx = a/b;
            System.out.println(s.charAt(idx));
        } catch (ArithmeticException e) {
            System.out.println("math eror");
        }catch (StringIndexOutOfBoundsException e){

            System.out.println(" index bulunmuyor hatası");
        }

        /*
        try kısmında birden fazla exeption oluşturma ihtimali olan kod varsa çoklu catch kullanabiliriz
        çoklu catch kullandığınızda exeption classlar arasında parent child ilişkisi yoksa catchler rastgele yazılab
        ilir ama kod sırası dikkate alınmalıdır ama parent child ilişkisi varsa önce child class yazılmalıdır

         */

    }
}
