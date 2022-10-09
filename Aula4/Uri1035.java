/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se 
D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C 
e D, ambos, forem positivos e se a variável A for par escrever a mensagem 
"Valores aceitos", senão escrever "Valores nao aceitos".
 */

import java.util.Scanner;

public class Uri1035 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A, B, C, D;

        //System.out.println("Digite 4 números inteiros (A, B, C, D)");
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        if ( (B > C) && (D > A) && (C + D > A + B) && (C > 0) && (D > 0) && (A % 2 == 0)){ //== compara se a igualdade é válida, = atribuição
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

        teclado.close();
    }
}

/*Operadores lógicos:
a && b - AND
a || b - OR
    !a - NOT
*/

/*Prioridade dos sinais:
* / %
+ -
> >= < <= == !=
&& || !
 */
