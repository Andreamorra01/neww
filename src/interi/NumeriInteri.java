package interi;

public class NumeriInteri {

    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            int f1 = fibonacci(n-1);
            int f2 = fibonacci(n-2);
            int ris = f1 + f2;
            return ris;
        }
    }

        static int ricors(int x){
            if (x<=1){
                return 1;
            }
            else return x * ricors(x-1);

        }


    static int fatt(int x) {
        int i;
        int f=1;

        for(i=1; i<=x; i=i+1) {
            f=f*i;
        }

        return f;
    }

    public static void main(String[] args) {
        System.out.println("il fattoriale di 4 è " + fatt(4));
        System.out.println("il fattoriale ricorsivo di 5 è "+ ricors(5));
        System.out.println("la quarta posizione della successione di Fibonacci è "+fibonacci(4));
    }

}



