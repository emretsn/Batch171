package day28interfacecollections;

public class HondaRunner {
    public static void main(String[] args) {

        Civic myCivic = new Civic();

        myCivic.cool();

        Accord myAccord = new Accord();
        myAccord.cool();//Accord cool super

        myCivic.run();

        myAccord.run();

        myCivic.eco();// default ile oluşturulanı obje oluşturarak
        Engine.stop();// staticle oluşturulanı interface ismi ile

        System.out.println("Engine.price = " + Engine.price);
        System.out.println("Security.price = " + Security.price);
        System.out.println("Ac.price = " + Ac.price);



    }

    }

