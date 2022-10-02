import java.util.Scanner;

public class Exercicio1020{
    public static void main(String[] args) {
        int anosEmDias;
        int qntAnos, qntMeses, qntDias;
        int resto;

        Scanner teclado = new Scanner(System.in);
        anosEmDias = teclado.nextInt();

        qntAnos = anosEmDias / 365;
        resto = anosEmDias % 365;
        qntMeses = resto / 30;
        qntDias = resto % 30;

        System.out.println(qntAnos + " anos(s)");
        System.out.println(qntMeses + " mês(es)");
        System.out.println(qntDias + " dia(s)");

        teclado.close();
    }
}
