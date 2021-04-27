package fibonacci;
/*
successione di Fibonacci
 */
public class Fibonacci {


            static int fibo(int n) {
            if (n == 0)
                return 0;
            else if (n == 1)
                return 1;
            else {
                int f1 = fibo(n-1);
                int f2 = fibo(n-2);
                int ris = f1 + f2;
                return ris;
            }
        }


/*
ritorna il numero della posizione
 */
    static int fibb(int n){
        /**
         * int n: posizione del numero da ricercare
         */
       int a= 0, b= 1, c= 0;
        for (int i = 2; i < n; i++) {
            c=a+b;
            a=b;
            b=c;
       }
       return c;
   }



       public int newfibo(int x)
    {
        /**
         * int x: posizione del numero da ricercare
         */
        if (x < 2) return x;

        int fiboFinal = 1;
        int firstN = 1;

        for (int i = 2; i < x; i++)
        {
            int secondN = fiboFinal;
            fiboFinal = fiboFinal + firstN;
            firstN = secondN;

        }

        return fiboFinal;
    }


    public static void main(String[] args) {
        Fibonacci numerodacontrollare = new Fibonacci();
        System.out.println((numerodacontrollare.newfibo(10)));
    }
    }
