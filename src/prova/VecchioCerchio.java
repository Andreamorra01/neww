package prova;

    public class VecchioCerchio {
        double perimetro ;
        double area;
        double pippo = 5;
        /*
        double raggio;

        public Cerchio raggiodaverificare(double rg) {
            raggio = rg;

        }


        public static void main(String[] args) {

        }
    }
*/
        private VecchioCerchio(double raggio){

            perimetro = perimetro(raggio);
            area = area(raggio);

        }

         private double perimetro(double raggio) {

            return 2 * Math.PI * raggio;
        }
         private double area(double raggio) {

            return Math.PI * raggio * raggio;
        }

        public static void main(String[] args) {

            VecchioCerchio nuovoCerchio = new VecchioCerchio(5);
            System.out.println(nuovoCerchio.perimetro);

        /*    Cerchio raggioDaVerificare = new Cerchio();
            System.out.println("il perimetro è " + raggioDaVerificare.perimetro(3));
            System.out.println("l'area è "+ raggioDaVerificare.area(3));

         */
        }
    }

