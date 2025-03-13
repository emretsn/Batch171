package FreeExercise;

public class for01 {
    public static void main(String[] args) {
        for (int i = 1; i <1001 ; i++) {
            int num2 = 0;
            int num2yibölenler =0 ;
            for (int j = 1; j < i; j++) {


                if (i%j ==0){
                    num2+=j;

                }

                }for (int k = 1; k < num2; k++) {

                    if (num2%k==0){

                        num2yibölenler +=k;
                    }

                }
            if (i== num2yibölenler  && i!= num2){
                System.out.println(i+", ve "+ num2+", Arkadaş sayılardır");
            }


        }
    }
}
