package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        Course courseTurkıshDay = new Course("summer","Turkish Day", 97,128);
        Course courseTurkıshNight = new Course("Winter","Turkish Night", 98,128);
        Course courseenglishDay = new Course("spring","English Day", 95,128);
        Course courseEnglishNight = new Course("Winter","English Night", 93,128);

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkıshDay);
        courseList.add(courseenglishDay);
        courseList.add(courseEnglishNight);
        courseList.add(courseTurkıshNight);

        // tüm avaragescore ların  91 den büyük olduğunu kontrol eden kodu yazınız
       boolean result1= courseList.stream().allMatch(t-> t.getAvarageScore()<91);
        System.out.println(result1);

        // AllMatch() methodu stream içeerisindeki tüm elemanların şarta uyması halinde true verecektir

        //2. kurs isismlerinin en az birinin turkish kelimesinin içerip içermediğini kontrol eden kodu yazınız

       boolean result2 =  courseList.stream().anyMatch(t-> t.getCourseName().contains("Turkish"));
        System.out.println(result2);
       // anyMatch methodu stream içerisinde herhangi biri true ise true verir

        //3) kurs dönemleri içinde fall döneminin hiç bulunmadığını kontrol edeen kodu ayzın

        boolean result3 = courseList.stream().noneMatch(course -> course.getSeason().contains("fall"));
        System.out.println(result3);;

        //noneMatch şarta göre hiçbir elemanın şartı sağlamaması durumunda true verir

        //4. Avarage score u en yüksek olan kursun ismini konsola yazdırınız
        String name = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(name);

        //5) course objelerini ilk ikisi hariç küçükten büyüğe diziniz.Liste halinde yazdırınız
        List<Course> course = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).skip(2).collect(Collectors.toList());
        System.out.println(course);

        //6) tüm course objelerinin avarage scorlarına göre küçükten büyüğe diziniz ilk üçünü yazdırın


        List<Course> course2 = courseList.stream().sorted(Comparator.comparing(Course::getAvarageScore)).limit(3).collect(Collectors.toList());
        System.out.println(course2);

        //7) course da bulunan öğrenci sayılarına göre büyükten küçüğe sıralı
        List<Course> course3 = courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudent)).collect(Collectors.toList());
        System.out.println(course3);
       // 8) kursta bulunan ingilizce bölümlerin sayısını bulan kodu yazın

       long engsayısı =  courseList.stream().filter(t-> t.getCourseName().contains("English")).count();
        System.out.println(engsayısı);

        // Ogrenci sayısı  140 tan az olan kursları liste halinde veren kodu yazınız

        List<Course> couurses9 = courseList.stream().filter(t-> t.getNumberOfStudent()<140).collect(Collectors.toList());
        System.out.println(couurses9);

    }
}
