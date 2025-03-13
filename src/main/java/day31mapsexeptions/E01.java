package day31mapsexeptions;

public class E01 {
    public static void main(String[] args) {
        /*
        Exeption beklenmedik problem demektir. Java çözemediği bir sorunla karşılaştığında ekeption classı devreye girer
        Exeption classı bize karşılaşılan sorunun cinsini, bu sorunun nereden kaynaklandığını ve sebebini verir

        java exeption fırlattığında kodun çalışmasını durdurur (Stop execution)
        Java exeption oluşturan kod için bizden karar vermemizi ister. hatanın gösteridiği bölüme log denir

        Eğer bir şey yapmazsak java kodun çalışmasını durdurur. eğer biz kodun çalışmaya devam etmesini istiyorsak
        try catch ile oluşturması muhtemel hataları bu bloğun içine yazarız

        Exeption ı halledebilmek için iki temel yol vardır
        1) exeptiona uygun çözümler üretebilirsiniz. buna exeption Handling denir
        2) exeption oluştuğunda bunu ilan eder vre geri çekilirsiniz. buna throw exeption denir

        Exeptiona uygun çözümler üretmede try-catch kullanılır
        try block da yapılması gereken işlem javadan istenir
        java işlemi problemsiz bir şekilde yaparsa catch block java tarafından okunmaz
        try blocta işlem yapılırken Exeption oluşursa catch block devreye girer
        ve catch block içindeki kodlar çalışır
        try blocta işlem yapılırken exeption oluşursa hatadan sonrasını çalıştırmaz

        catch parantez içine karşılaşılması muhtemel olan Exeption class ismini ve bir obje ismi (e) koyarız
        catch bloğuna ise yapılması istenen kodu yazarız

        if else kullanırsak spesifik olarak oluşabilecek tüm sorunları yazmamız gerekir
        ama try catch yapısı ile java exeption la alakalı tüm sorunları yakalar








         */
        int a = 12 ;
        int b = 0;
        divide2(a, b);




    }

    public static void divide(int a,int b){
        System.out.println("a/b = " + a / b);


    }
    // Aritmetik exeption yazdığınınz kodda matematiksel işlem kullanarak alacağınınz bir exeptiondır
    public static void divide2(int a,int b  ){
        try {
            System.out.println(a/b); // alınan hatanın adı girilerek önlem alındı
        }catch (ArithmeticException e){
            System.out.println("do not divide by zero");
        }

    }
}
