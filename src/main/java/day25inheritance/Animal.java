package day25inheritance;

public class Animal  {
    //Inheritance ==> Miras alma
    /*
    Ozellikleri bir classtan diger classlara alan bir kavramdir, Bunun javadaki karsiligi sudur:
    Siz bir class olusturacaksiniz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin
     bir cogunu kapsiyor, o zaman direkt yeni olusturdugunuz classi ozelliklerini kullanmak istediginiz
     classa  child yapariz

     Inhertiance in faydalari
     1) Code tekrarlarindan kurtuluruz
     2) Code tamiri (maintenance) kolay olur
     3) Child classlari daha atomic yapmis oluruz

     =>Bir class i baska bir classin child classi yapmak icin "extends" keyword kullanilir.
     Ilk yazilan class child, ikinci yazilan class parent (veya super) olur,

     =>Child class objectleri Parent Class dan method ve variablellari kullanabilirler
     =>Parent class objectleri child classtan method ve variablellari kullanamazlar

     =>Javada bir classin sadece 1 tane parenti i olabilir Coklu parent a "Multiple Inheritance" derler
     tekli parent a "Single Inheritance" derler, java Multiple Inheritance i desteklemez
     java "Single Inheritance " kullanir

     =>Apartman seklindeki inheritance yapisina "Multilevel inheritance " denir
     Java "Multilevel inheritance " i destekler

     => Object Class her classin parentidir. Java da Object Class haric her classin parenti vardir
        Javada parent i olmayan tek class Object classtir

     => Javada parenttan childa olan iliskilere "HAS-A Relationship " denir
        child dan parent a olan iliskilere "IS-A Relationship " denir

    => Javada her classin bir tane default constructor i vardir. Bu default constructor classin icinde gorunmez cunku
        constructor "Object Class" icindedir.

     */


    public void eat(){
        System.out.println("Animals eat... ");
    }

    public void drink(){
        System.out.println("Animals drink... ");
    }

}