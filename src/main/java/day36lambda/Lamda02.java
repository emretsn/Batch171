package day36lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda02 {
    public static void main(String[] args) throws IOException {
       // ex1 verilen textfile içindeki text i konsola yazdırın

        Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).forEach(System.out::println);

        // ex2 büyük harflerle yazdırın
        Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        // textin içinde get kelimesinin olup olmadığını kontrol eden kodu yazınız
        boolean result1 = Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).anyMatch(t-> t.contains("get"));
        System.out.println(result1);

        List<String> words = Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).map(t-> t.replaceAll("\\p{Punct}", "").split(" ")).
                flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        System.out.println(words);

        // textfile da kaç harf olduğunu bulan kodu yazın
       int numOfLetters = Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).map(t-> t.replaceAll("\\p{Punct}", "").split("")).
                flatMap(Arrays::stream).collect(Collectors.toList()).size();
        System.out.println(numOfLetters);

        // ex6 textte kullanılan tüm harfleri alfabetik olarak ters şekikde listin içinde return eden kodu yazınız

       List<String> Letters = Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).map(t-> t.
                       replaceAll("[^a-zA-Z]", "").split("")).
               flatMap(Arrays::stream).
               sorted(Comparator.
                       reverseOrder()).
               collect(Collectors.toList());

        System.out.println(Letters);





    }
}
