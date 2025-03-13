package day24stringbuilder;

public class sb04tekrar {
    public static void main(String[] args) {
        // oluşturma
        StringBuilder sb1 = new StringBuilder("Çavuş");
        System.out.println("sb1 = " + sb1);

        sb1.append("!!!");
        System.out.println("sb1 = " + sb1);
    }
}
