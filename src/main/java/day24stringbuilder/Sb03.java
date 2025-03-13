package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {

        /*
        1) StringBuffer java'da String ureten bir diger classtir
        StringBuffer java nin string uretmek icin olusturdugu ilk classtir.

        2)StringBuffer, StringBuilder'a cok benzer, yani ikiside "mutable" string uretir
        3)StringBuffer "multi-thread" dir, ama String Builder "multi-thread" degildir
        4)String Builder "multi-thread" olmadigi icin StringBuffer dan daha hizli calisir
        5)"multi-thread" yapilirken yapilan islerin siralamasi onem arz eder,
         yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir
         StringBuffer "multi-thread" oldugundan ayni zamanda "synchronized"dir

        3 tane String olusturuna class ogrendik;
                1) Immutable string lazimsa; String Class
                2) Mutable string lazimsa StringBuffer veya String Builder
                        a)StringBufferi multi thread gerekirse kullaniriz
                        b)StringBuilderi multi thread gerekmez ise kullaniriz
         */

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java


    }
}