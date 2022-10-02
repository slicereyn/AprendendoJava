import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int a;
        float b;
        double c;
        String d;
        char e;

        Scanner teclado;
        teclado = new Scanner(System.in);

        //System.out.println("Digite um valor inteiro");
        //a = teclado.nextInt();
        //System.out.println("Digite um numero real"); //o scanner trabalha com o idioma da máquina, o input deve ser com , em vez de . se o idioma for português
        //b = teclado.nextFloat();
        //c = teclado.nextDouble();
        //System.err.println("Digite um texto");
        //d = teclado.nextLine();
        System.out.println("Digite uma letra");
        e = teclado.nextLine().charAt(0); //pegar apenas a 1ª posição por conta do char

        System.out.println("Valor digitado = " + e);

        teclado.close(); //sempre fechar o scanner ao final do código
    }
}