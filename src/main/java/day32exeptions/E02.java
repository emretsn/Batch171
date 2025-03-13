package day32exeptions;

public class E02 {
    public static void main(String[] args) {
        // birbirine dönüştürülemeyecek data typlarını dönüştürmekte ısrar ederseniz java ClassCastException hatası verir

          Object obj = 70 ;


        try {
            String str = (String) obj;
            System.out.println(str);

        } catch (ClassCastException e) {
            System.err.println("her data typının her data typına çeviremezsiniz");
            //System.err kırmızı yazıyla eror çıktısı verir
        }
    }
}
