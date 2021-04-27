package numeri;

public class Numeri {

    //attributi privati
    private int N;
    private int M;



    public Numeri (int N, int M){ //costruttore
         this.N = N;
         this.M = M;
//imposta il valore iniziale per gli attributi di classe
    }

    public int fibonacci(){
        int a= 0, b= 1, c= 0;
            for (int i = 1; i < N; i++) {
                c=a+b;
                a=b;
                b=c;
        }
        return c;
        //metodo per calcolare la successione di fibonacci
    }
    public int fattoriale(){

            int i;
            int f=1;

                for(i=1; i<=N; i=i+1) {
                    f=f*i;
            }

            return f;
            //metodo che ritorna il fattoriale di un numero
        }

   boolean Pari(){
        return (N%2 == 0);
        //metodo che ritorna true se il numero è pari e false se il numero è dispari
}
    boolean multiplo(){
        return (N%M ==0);
        //metodo che ritorna true se N è multiplo di M e false se non lo è
}


    public static void main(String[] args) {
        Numeri verifica = new Numeri(8,2);


         System.out.println("fibonacci = " + verifica.fibonacci());
         System.out.println("fattoriale "+verifica.fattoriale());
         System.out.println("pari "+ verifica.Pari());
         System.out.println("multiplo "+ verifica.multiplo());
        }
        }
