import java.util.Scanner;

/* Leia um valor de ponto flutuante com duas casas decimais. Este valor 
representa um valor monetário. A seguir, calcule o menor número de notas e 
moedas possíveis no qual o valor pode ser decomposto. As notas consideradas 
são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 
0.05 e 0.01. A seguir mostre a relação de notas necessárias.
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor 
inicial, conforme exemplo fornecido.
Obs: Utilize ponto (.) para separar a parte decimal. 
 */

public class Uri1021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int saqueInt, saqueDec;
        int qtd100, qtd50, qtd20, qtd10, qtd5, qtd2, 
            qtd1, qtd050, qtd025, qtd010, qtd005, qtd001;
        int resto;

        double valorSaque;
        valorSaque = teclado.nextDouble();

        saqueInt = (int)valorSaque;
        valorSaque = valorSaque - saqueInt;
        saqueDec = (int)(valorSaque * 100);

        qtd100 = saqueInt / 100;
        resto = saqueInt % 100;

        qtd50 = resto / 50;
        resto = resto % 50;

        qtd20 = resto / 20;
        resto = resto % 20;

        qtd10 = resto / 10;
        resto = resto % 10;

        qtd5 = resto / 5;
        resto = resto % 5;

        qtd2 = resto / 2;

        qtd1 = resto % 2;

        qtd050 = saqueDec / 50;
        resto = saqueDec % 50;

        qtd025 = resto / 25;
        resto = resto % 25;

        qtd010 = resto / 10;
        resto = resto % 10;

        qtd005 = resto / 5;

        qtd001 = resto % 5;

        System.out.println("NOTAS:");
        System.out.println(qtd100 + " nota(s) de R$ 100.00");
        System.out.println(qtd50 + " nota(s) de R$ 50.00");
        System.out.println(qtd20 + " nota(s) de R$ 20.00");
        System.out.println(qtd10 + " nota(s) de R$ 10.00");
        System.out.println(qtd5 + " nota(s) de R$ 5.00");
        System.out.println(qtd2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(qtd1 + " moeda(s) de R$ 1.00");
        System.out.println(qtd050 + " moeda(s) de R$ 0.50");
        System.out.println(qtd025 + " moeda(s) de R$ 0.25");
        System.out.println(qtd010 + " moeda(s) de R$ 0.10");
        System.out.println(qtd005 + " moeda(s) de R$ 0.05");
        System.out.println(qtd001 + " moeda (s) de R$ 0.01");

        teclado.close();
    }
}
