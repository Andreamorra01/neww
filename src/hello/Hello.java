package hello;

public class Hello {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        //int[] number = {1,2,3,4,5,6,7,8,9,10};
        int N = 10;
        for (int i = 0; i <= N; i++) {
            if ((i % 2)==0){
                System.out.println(i + " " + "è pari");
            }
            else{
                System.out.println(i + " " + "è dispari");
            }
            //System.out.println(Number[i]);
        }
    }

}



