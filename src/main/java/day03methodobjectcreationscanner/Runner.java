package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {
//Object nasil olusturulur
//new keywordu sifirdan yeni bir object olusturmak icin kullanilir
//Constructor java da objeleri olusturmak icin kullanilan ozel bir methodtur
//Class ismi  +  Object ismi  +  Assignment Operator +  "new" keywordu  +  Constructor
        Car             myCar               =               new            Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        // Student new obje
Student emre = new Student();
        System.out.println("emre.name = " + emre.name);
        System.out.println("emre.adress = " + emre.adress);
        System.out.println("emre.grade = " + emre.grade);
        emre.study();
        emre.ozellik();
        //homework Teacher
        TeacherHomework teacher = new TeacherHomework();
        System.out.println("teacher.name = " + teacher.name);
        System.out.println("teacher.branch = " + teacher.branch);
        System.out.println("teacher.school = " + teacher.school);
        teacher.feature();
        teacher.age();
        teacher.teachMethod();
        teacher.feature2();
        Student Emre = new Student();

    }
// homework
    // içinde isim ve yaş variablları ile teach methodu bulunan öğretmen objesi
    //oluşturun obje üzerinde bvu özellikleri kullanın


}