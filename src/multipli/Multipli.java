package multipli;

public class Multipli {
    public static void main(String[] args) {
        int[] divisori = {2,3,5,7};
        for (int j=0; j<divisori.length; j++){
            int[] multi = {1,2,3,4,5,6,7,8,9,10};
            for (int i=0; i<multi.length; i++){
                if ((multi[i] % divisori[j])==0){
                    System.out.println(multi[i] + " "+ "è multiplo di " + divisori[j]);
                }

              else if ((multi[i] % divisori[0]!=0 && multi[i] % divisori[1] !=0 && multi[i] % divisori[2] !=0 && multi[i] % divisori[3]!=0)){

                    System.out.println(multi[i] + " " + "non è multiplo di nessuno");

                }
            }
        }



    }
}
