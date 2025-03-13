package day31mapsexeptions;

public class E04 {
    public static void main(String[] args) {
        String arr[] = {"j", "A", "V","A"};
        getEleman(arr, 6); //ArrayIndexOutOfBoundsException


    }
    public static void getEleman(String[] arr, int idx){
        String eleman = null;
        try {
            eleman = arr[idx];
            System.out.println(eleman);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("girilen index arrayde yok");;
        }

    }
}
