package day32exeptions;

public class E01 {
    public static void main(String[] args) {

        String str = null;
        String s = "java";
        getNumberofChars(s);
        getNumberofChars(str);

    }

    //cStringin değeri null olduğunda String classdaki bazı methodlarları kullanmaya çalışırsanız NullPointerException atar
    public static  void getNumberofChars( String s){

        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("null değeri için bazı methodlar kullanılamaz");
        }
    }
}
