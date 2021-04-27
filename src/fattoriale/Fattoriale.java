package fattoriale;

public class Fattoriale {
    /*
    calcolo fattoriale con iterazione
     */

    static int fatt(int x) {
        int i;
        int f=1;

        for(i=1; i<=x; i=i+1) {
            f=f*i;
        }

        return f;
    }

    public static void main(String[] args) {
        System.out.println(fatt(4));
    }
}
