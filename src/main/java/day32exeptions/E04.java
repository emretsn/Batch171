package day32exeptions;
import java.io.File;
import java.io.FileInputStream; // io input output
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class E04 {

    /*
       konsolda alınan exeptionlara Runtime Exeption denir
       AritmeticExeption, NullpointerExeption numberformatExeption, bunlara örnek olabilir
       Runtime exeptionlara Unchecked Exeption da denir

       2) Code yazarken kırmızı alt çizgi şeklinde alınan Exeptionlara "Compile Time Exeption" denir
       Compile time Exeptionlara Checked Exeption da denir

       throw ile throws keywordleri arasındaki fark nedir?
       1) throw method bodysi içinde throws method parantezinden hemen sonra kullanılır
       2)  throw method bodysi içinde istenilen yerde istenilen kadar kullanılır
       throws ise Method parantezinden hemen sonra sadece bir kere kullanılır
       3) throwdan sonra new keyword ve constructer kullanılarak obje oluşturulur
       4) throw belli şartlarda exeption fırlatmada kullanılır
       throw ise bir methodun belli bir Exeptionı fırlatabileceğini belirtmek için kullanılır




        */
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        FileInputStream fis = new  FileInputStream("src/main/java/day32exeptions/file.txt");

        int k =0;

        while ((k= fis.read())!=-1){
            System.out.print((char) k); // asci değeri chara çevirip ekrana yazdırdık


        }
    }

}
