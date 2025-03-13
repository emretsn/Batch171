package day20statickeywordconstructors;




public class StudentRunner {
    public static void main(String[] args) {
        //stdName static oldugundan ona ulasmak icin object olusturmadan sadece
        //class ismini kullanmak yeterlidir
        System.out.println(Student.stdName);//Tom Hanks

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz.
        Student std1=new Student();
        System.out.println(std1.age);//13

        Student.staticMethod();//Ben static methodum
        std1.nonStaticMethod();//Ben static olmayan methodum


    }
}