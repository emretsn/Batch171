package day28interfacecollections;

public class Civic implements Ac,Engine,Security {
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {

        System.out.println("engine run super");
    }
    //Interface

}