package day26polymorphism;

public  class Animal {
    /*
    1) Parent Classdaki methodu child class icinde ozellestirerek kullanmaya overriding yapmak denir
    2) Overridingde method signature a dokunulmaz ( method signature = method ismi + parantez)
    3) private methodlar override edilemezler
    4) Child classdaki methodun access modifieri parent classdaki override edilmis(Overriden Method)un access modifierindan
    dar olamaz. Aynisi olabilr yada daha genis olabilir
    5)Child classda override edilen methodun return typei ile parent taki methodun return type i arasinda "IS A Relation ship"
    varsa return type degistirelebilir
    6) Methodun return typei primitive ise Overriding yaparken return type degistirilemez. Cunku return type ya ayni olur vyea
    parent tan secilir ama primitiveler arasinda Parent child iliskisi olmadiginidan aynisi olmak zorundadir
    7)Childda override edilen methodun return typei ile parent taki methodun return typei arasinda IS A Relation ship" yoksa return type
    DEGISTIRILEMEZ. Mesela;
    Integer wrapper classi ile Long wrapper classi arasinda IS A Relation ship" yoktur oyuzden degistirilemez
    8) Methodun return type i void ise Overriding yapaken return type degisitirilemez
    9) static methodlar override edilemezler. Cunku static methodlar tum childlar icin ortak methodlardir. Bir chlid bir ortak methodu
    degistirdiginde diger childlar bundan olumsuz etkilenebilir. Bu yuzden java static methodlarin override edilmesine mussaade etmez
    10) final methodlar override edilemezler. final methodlarin bodysi degistirilemez ama override ederken
    method body degistiririz bu yuzden java final methodlarin override edilmesine izin vermez
        a) Final keywordunu variable lar ile kullanabilirz
            i)eger variable final ise mutlaka deger atanmalidir
            ii) ilk atanan deger degistirelemez
        b) Final keywordunu method lar ile kullanabilirz
            i)method final ise bodysi degistirilemez
            ii)degistirilemeyince override yapmak mumkun olmaz
        c)  Final keywordunu class lar ile kullanabilirz
            i) class final ise child i olamaz

    Polymorphism = Method overloading + Method overriding
  oop inheritans polimoephism
     */

    public void eat(){
        //Parenttaki override edilmis eat() methoduna Overriden Method denir
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink");
    }

    public Animal create(){
        return new Animal();
    }

    public int add(int a,int b){
        return a+b;
    }
    public Integer multiply(Integer a, Integer b){
        return a*b;
    }
    public final double circleArea(double r){
        return 3.14*r*r;
    }








}