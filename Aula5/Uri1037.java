import java.util.Scanner;

public class Uri1037 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float numero = teclado.nextFloat();

        if (numero >= 0 && numero <= 25.0f){
            System.out.println("Intervalo [0,25]");
        } else {
            if (numero > 25.0f && numero <= 50.0f){
                System.out.println("Intervalo (25,50]");
            } else {
                if (numero >= 50.0f && numero <= 75.0f){
                    System.out.println("Intervalo (50,75]");
                } else {
                    if (numero >= 75.0f && numero <= 100.0f){
                        System.out.println("Intervalo (75,100]");
                    } else {
                        System.out.println("Fora de intervalo");
                    }
                }
            }
        }

        teclado.close();
    }
}
