package day28interfacecollections;

public interface Ac {

    public abstract void cool();

    void run();

    // interface te method ve variablelar public stativc ve final dır yazmaya gerek yoktur
    // interfacelerden obje oluşturulamaz çünkü constructerları yoktur

    public static final int price = 2000;


    /*
    1) Bir interface'i bir classin parenti yapmak icin "implements" keywordunu kullaniriz
    2) java parentlar class oldugunda multiple parent a musaade etmez ama biz bazen
    multiple parent a ihtiyac duyariz
    Bu ihtiyaci gidermek icin java interface adinda yeni bir yapi olusturdu
    Bu yapi sayesinde bir class icin coklu interface parent olusturulabilir
    3) interfacelerin icine conceret method konulamaz, cunku concrete methodlarda body vardir ve
    body o methodun isi nasil yapacagini belirtir. isin nasil yapilacagi bir cok detay icerir ve bu chlid
    classlarda kafa karisikligina sebep olur. Halbuki sadece yapilmasi gereken isi soyleyip
     nasil yapilaacgini childa birakirsaniz chil classin kafa karisikligini engellemis olursunuz
    4) interfacelerdeki tum methodlar otomatik olara public dir, abstracttir, static degildir
    5)interfaceler concrete method iceremezler dolayisyal interface icindeki hicbirsey istege bagli degildir
    hersey child classlar icin mecburidir. Bu yuzden interfacelere" to-do list " de denir
    6) çoklu interface parentların her birinin içine aynı isimli methodlar koyabiliriz
    Child class herhangi birini override ettiğinde hepsini override etmiş gibi olur
    sonra body i child classta yazarak uygulamasının yapmış olur
    7. Interfscelerdeki tüm variablelar otomatik olarak (default) finaldır değer atamak zorundayız
    bilindiği gibi final variableların değerleri değiştirilemez
    b)Interfscelerdeki tüm variablelar otomatik olarak (default) publictir.
    c)Interfscelerdeki tüm variablelar otomatik olarak (default) statictir
    >> dolayısıyla ınterfacelrde variablaları çağırırken interface in adı ile çağırılır
    8) Normalde "Interface" içine concrete method konulamaz ama özel durumlarda concrite method koymamız gerekirse default keyword kullanarak bunu yapabiliriz
    static keyvordünü kullanarakta interface içine concrete method koyabiliriz
    9) "Default" keywordunu kullanarak oluşturuduğunuz concrete methodlara child clasından obje oluşturarak kullanabilirsiniz
    "Static" keywordunu kullanarak oluşturuduğumuz concrete methodlasra ulaşmal-k için obje oluşturmaya gerek yoktur interface ismi yeterlidir
    10) İnterfacelerden obje oluşturulamaz constructerı yoktur
    11) child   Parent   keyword
        class class  extends
     interface ınterface extend
     class interface implements
     interface class == olamaz // interfaceler concrete classların childı olamaz

     aynı ise extends farklı ise implements kullan

     Abstract class ile interface arasındaki farklar nelerdir
     1) Abstract classlar hem abstarct hem de concrete methodlar içerebilir fakat interfaceler sadece abstract method içerir
     istersek default ve static keywordlerini kullanarak concrete method üretebiliriz
     2) Abstruct classlar multiple inheritence ı desteklemez ınterfaceler destekler
     3) Abstruct classlar içinde her türlü variable oluşturulabilir, interfaceler içinde public statitic final olmalıdır
     4) interface classın childı olamaz abstruct class classın childı olabilir
     5) Abstruct classlarda cocstructer vardır ama obje üretemez , interfacelerde constructer yoktur object üretilemez
     interfacelere class denmez interface ayrı bir yapıdır
     







     */
}
