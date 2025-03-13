package day33ExeptionsEnumIterator;

public class ExeptionRunner {

    /*
    Garbage collector memoryyi temiz tutmak için sürekli memoryi tarar ve silinmesi gerekenleri siler
    Garbage Colletor silmeden önce dataları finalize eder sonra siler.

     */
    public static void main(String[] args) throws InvalidStudentGradeExeption {
        GetStudentGrade(50);
       // GetStudentGrade(-50); InvalidStudentGradeExeption

        getTheNumberOfStudent(-50);

    }
    public static void getTheNumberOfStudent(int numOfStudents){
        if(numOfStudents<0){
            throw new InvalidNumberExeption("Student number can not be negative");
        } else {
            System.out.println(numOfStudents);
        }
    }


public static  void GetStudentGrade(int grade) throws InvalidStudentGradeExeption {
        if (grade<0 || grade>100){
            throw new InvalidStudentGradeExeption("Student's Grades can not be less than zero or grater than 100");

        }else {
            System.out.println(grade);
        }
}
}
