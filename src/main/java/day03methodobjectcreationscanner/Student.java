package day03methodobjectcreationscanner;

public class Student {
    public String name = "Emre Tosun";
    public byte grade = 7;
    public String adress ="ANKARA";

   public void study(){
       System.out.println("günlük tekrarlarının ihmal etmez");

    }public void ozellik(){
        System.out.println("Karı kızla işi olmaz");
    }

    public static void cvs(int a, int b){
       int x = a*b+ a/b;
        System.out.println(x);
    }
}
