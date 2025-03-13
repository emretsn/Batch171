package day28interfacecollections;

public class Accord implements Ac,Engine,Security {


    @Override
    public void cool() {
        System.out.println("Accord cools super");
    }




    @Override // body olmadığı için interfacelerde override yerien implements denebilir
    public void run() {
        System.out.println("Ac run super ");



    }
}