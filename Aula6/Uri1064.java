/*Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram 
positivos. Na próxima linha, deve-se mostrar a média de todos os valores 
positivos digitados, com um dígito após o ponto decimal.
A entrada contém 6 números que podem ser valores inteiros ou de ponto 
flutuante. Pelo menos um destes números será positivo.
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha 
deve mostrar a média dos valores positivos digitados.
 */

import java.util.Scanner;

public class Uri1064 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor;
        float media;
        int cont;

        media = 0f;
        cont = 0;

        for (int i = 1; i <= 6; i++){
            valor = teclado.nextFloat();
            if (valor > 0){
                media += valor;
                cont++;
            }
        }
        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n", media);

        teclado.close();
    }
}
