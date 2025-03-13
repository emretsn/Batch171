package day32exeptions;

public class E06 {
    public static void main(String[] args) {
        /*
        1)Exeption olsada olmasada çalıştırmamız gereken kodları finally block içinde yazarız
        2) Database ile bağlantıyı kesme işini yapan kodlar gibi kodlar her halükarda çalıştırılmalıdır,
        bu tarz kodları finaly block içine koyarız
        3) try tek başına kullanılamaz ; try + çoklu catch olabilir
        try ile finally vey try çoklu catch ve finally kullanılabilir
        

         */

        int a = 12;
        int b = 0;
        int c[] = {3, 6, 9, 12};

        getElement(c, a, b);


    }
    public static void getElement(int[] c, int a, int b ){

        int idx = 0;
        try {
            idx = a/b;
            int element = c[idx];
            System.out.println(element);

        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());;
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("cut the connection with database");
        }

    }
}
