package day33ExeptionsEnumIterator;

public class InvalidStudentGradeExeption extends Exception{

    public InvalidStudentGradeExeption(String message){

        super(message); // bunu ypamak zorundayız parent özelleşmiş
    }
    /*
    1) Custom Exeption class oluşturmak için exeption classa extend etmeliyiz
    Exeption classa extend ederek oluşturduğumuz class Custom Exeption compile time Exeption olur
    Eğer Runtime exeption üretmek istersek RuntimeExeption Classa extend etmeliyiz
    2) Custom Exeption class oluşturuken contructer oluşturmalıyız ve bu constructer parenttaki constructer ı çağırmalıdır
    bu constructer mesaj verecek veya vermeyecek şekilde oluşturulabilir.
    3) custom Exeption class oluşturduğunuzda ismin sonunda Exeption yazmalısınız



     */
}
