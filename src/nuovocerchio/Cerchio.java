package nuovocerchio;

public class Cerchio {

    private double raggio; // attributo di tipo privato
    private static int n;//


    private Cerchio(){ //costruttore vuoto
    }
    public Cerchio(double raggio){ //costruttore con parametro
        n++;
        this.raggio = raggio;
    }
    public double perimetro(){
        double perimetro = 2 * Math.PI * this.raggio;
        return perimetro;
        //metodo che calcola il perimetro
    }
    public double area() {
        double area = Math.PI * this.raggio * this.raggio;
        return area;
        //metodo che calcola l'area
    }


    public double diametro() {
        double diametro = this.raggio * 2;
        return diametro;
        //metodo che calcola l'area
    }


    public void setRaggio(double raggio){

        this.raggio = raggio;
        //metodo che setta il raggio del costruttore(senza parametro)
    }

    public double getRaggio(){

        return this.raggio;
        //metodo che fa il get del RAGGIO
    }

    public static int getNumeroCerchi() {
        return n;
    }

    public static void main(String[] args) {
        Cerchio cerchio = new Cerchio(5);

        //cerchio.setRaggio(5.0);
        System.out.println("raggio = "+cerchio.getRaggio());
        System.out.println("perimetro = "+cerchio.perimetro());
        System.out.println("area = "+cerchio.area());
        System.out.println("diametro = "+cerchio.diametro());
        System.out.println(Cerchio.getNumeroCerchi());

        Cerchio c = new Cerchio(12);
        System.out.println(c.area());
        //NuovoCerchio cerchio2 = new NuovoCerchio(6.0);
        System.out.println(Cerchio.getNumeroCerchi());
    }

}
