package day28interfacecollections;

public interface Engine {

    void run();

    int price = 300 ;
    default void eco(){
        System.out.println("uses gas less");
    }

    static void stop(){
        System.out.println("Stop security");
    }


}