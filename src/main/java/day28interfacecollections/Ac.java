package day27abstraction;

public interface Ac {

    public abstract void cool();

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
     */
}
