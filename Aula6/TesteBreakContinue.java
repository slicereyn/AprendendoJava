import java.util.Scanner;

public class TesteBreakContinue {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        int contador;
        
        System.out.println("Digite um valor:");
        valor = teclado.nextInt();

        contador = 1;
        while (contador <= valor){
            if (contador == 5){
                continue;
            }
            System.out.println("Contador = "+ contador);
            contador ++;
        }

        /*for (contador = 1; contador <= valor; contador++){
            if (contador == 5){
                continue; //ignorar instruções abaixo quando contador == 5
            }
            System.out.println("Contador = " + contador);
        }
        */

        teclado.close();
    }
}