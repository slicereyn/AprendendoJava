/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação 
de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem 
correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de 
numero negativo.
Se não houver possibilidade de calcular as raízes, apresente a mensagem 
"Impossivel calcular". Caso contrário, imprima o resultado das raízes com 
5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo 
abaixo. Imprima sempre o final de linha após cada mensagem. 
 */
import java.util.Scanner;

public class Uri1036 {
    public static void main (String args []){
        Scanner teclado = new Scanner(System.in);

        double A, B, C, R1, R2, delta;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        delta = B * B - 4 * A * C;

        if (delta < 0 || A == 0){
            System.out.println("Impossivel calcular");
        } else {
            R1 = (-B + Math.sqrt(delta)) / (2 * A); //Math.sqrt() - retorna a raiz quadrada positiva arredondada de um valor double
            R2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }

        teclado.close();
    }
}
