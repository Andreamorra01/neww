package ricorsione;
/*
calcolo fattoriale senza iterazione,con ricorsione
 */
public class Ricorsione {
    static int ricors(int x){
        if (x<=1){
            return 1;
        }
        else return x * ricors(x-1);

    }

    public static void main(String[] args) {
        System.out.println(ricors(3));
    }
}
