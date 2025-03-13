package day32exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    /*
    filenotfoundExeption Io exeption Compile time Exeptionlardır, yani kod yazarken haat alırız
    2) filenotfoundExeption pathin doğruluğu ve dosyanın varlığı ile ilgilidir
    3) IO Exeption class FileNotFoundExeption classın parentidir
    istenirse FileNotFoundExeption yerine IOExeption da kullanılabilir
    4) IOExeption class ve FileNotFoundExeption beraber kullanılacaksa FileNotFoundExeption üstte olmalıdır

     */

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/day32exeptions/file.txt");

            int k = 0;

            while ((k = fis.read()) != -1) {
                System.out.print((char) k);

            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());;
        } catch (IOException e) {
            System.err.println(e.getMessage());;
        }
    }
}
