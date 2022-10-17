/*Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, 
de 1 até N, inclusive N, se for o caso.
A entrada contém um valor inteiro N (5 < N < 2000).
Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o 
exemplo abaixo.
Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 
1e+006 ao invés de 1000000 o que ocasionará resposta errada. Neste caso, 
configure a precisão adequadamente para que isso não ocorra.
 */
import java.util.Scanner;

public class Uri1073 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int N;
        int numero;

        N = teclado.nextInt();
        for (numero = 2; numero <= N; numero += 2){
            System.out.println(numero + "^2 = " + numero * numero);
        }

        teclado.close();
    }
}
