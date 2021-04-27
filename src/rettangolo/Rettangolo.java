package rettangolo;

public class Rettangolo {
    private double b;
    private double h;


    /**
     *
     * costruttore Rettangolo,imposta i valori iniziali per gli attributi degli oggetti
     * @param base rettangolo
     * @param altezza rettangolo
     */

    public Rettangolo (int base, int altezza){ //costruttore
        this.b = base;
        this.h = altezza;
//imposta il valore iniziale per gli attributi di classe
    }

    /**
     * metodo che ritorna l'area del rettangolo
     * @return
     */
    public double getAreaRettangolo(){

        return h * b;
        }

    /**
     * metodo che ritorna il perimetro del rettangolo
     * @return
     */
    public double getPerimetroRettangolo(){
        return 2*(h+ b);
  }


    public static void main(String[] args) {
        Rettangolo firstRettangolo = new Rettangolo(4,3);

        System.out.println("l'area del rettangolo è " + firstRettangolo.getAreaRettangolo());
        System.out.println("il perimetro del rettangolo è " + firstRettangolo.getPerimetroRettangolo());

    }
    }