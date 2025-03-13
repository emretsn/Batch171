package day19passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {
        String name = " Abuzer Kömürcü";
// java pass by value olduğu için heap memorideki değerin kopyasını oluşturur
        // pass bu referance olan diller referansının kopyasını oluşturur bu
        // yüzden kullanılan  ifadenin kendisi değişir
        // pass by referance ta methoda referans yollanır bu yüzden methodlar orijinal varaiblları değiştirir
        // c sharp java script gibi

     String  newname=  addtitle(name,"Dr");
        System.out.println(name);
        System.out.println(newname);

    }
public  static String addtitle(String name , String title){
        name = title+ " "+ name;
        return name;
}
}
