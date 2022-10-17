import java.util.Scanner;

public class TesteDoWhile {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        int contador;

        System.out.println("Digite um valor:");
        valor = teclado.nextInt();
        System.out.println("Contando de 1 até o valor ---");
        contador = 1;
        do{ //nessa estrutura o contador é mostrado pelo menos uma vez, mesmo se valor = 0
            System.out.println("Valor do contador = " + contador);
            contador++;
        } while (contador <= valor);

        teclado.close();
    }
}
