package day25inheritance;

public class VehicleRunner {
    public static void main(String[] args) {
        Honda civic = new Honda();
        System.out.println("******************");

        Honda accord = new Honda("wersd",123);

        System.out.println(civic.model);
        System.out.println(civic.km);


    }
}

