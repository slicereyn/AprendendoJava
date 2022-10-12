import java.util.Scanner;

public class TesteSwitch {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor = teclado.nextInt();

        switch (valor){
            case 1:
                System.out.println("Digitou o valor 1");
                break; //sem break o output seria todos os cases, pois o programa vai ler todas as instruções após o case do input
            case 2:
                System.out.println("Digitou o valor 2");
                break;
            case 3:
                System.out.println("Digitou o valor 3");
                break;
            default:
                System.out.println("Nao digitou nem 1, nem 2, nem 3");
                break;
        }

        teclado.close();
    }
}
