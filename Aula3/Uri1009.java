import java.util.Scanner;

/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o 
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total 
a receber no final do mês, com duas casas decimais.
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores 
de dupla precisão (double) com duas casas decimais, representando o salário 
fixo do vendedor e montante total das vendas efetuadas por este vendedor, 
respectivamente.
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores 
de dupla precisão (double) com duas casas decimais, representando o salário 
fixo do vendedor e montante total das vendas efetuadas por este vendedor, 
respectivamente.
*/

public class Uri1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        double salario, vendas;
        double comissao, salarioTotal;

        //System.out.println("Digite o nome");
        nome = teclado.nextLine();
        //System.out.println("Digite o salario");
        salario = teclado.nextDouble();
        //System.out.println("Digite o valor das vendas");
        vendas = teclado.nextDouble();

        comissao = vendas * 15 / 100;
        salarioTotal = salario + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        teclado.close();
    }
}
