import java.util.Scanner;

public class Uri1038 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in); //Também pode ser escrito como java.util.Scanner teclado = new java.util.Scanner(System.in); para evitar o import

        int qtd, cod;
        float total = 0.0f;

        cod = teclado.nextInt();
        qtd = teclado.nextInt();

        /*if (cod == 1){
            total = qtd * 4.0f;
        } else {
            if (cod == 2){
                total = qtd * 4.50f;
            } else {
                if (cod == 3){
                    total = qtd * 5.0f;
                } else {
                    if (cod == 4){
                        total = qtd * 2.0f;
                    } else {
                        total = qtd * 1.5f;
                    }
                }
            }
        }
        */

        switch (cod){
            case 1:
                total = qtd * 4.0f;
                break;
            case 2:
                total = qtd * 4.50f;
                break;
            case 3:
                total = qtd * 5.0f;
                break;
            case 4:
                total = qtd * 2.0f;
                break;
            case 5:
                total = qtd * 1.5f;
                break;
        }

        System.out.printf("Total: R$ %.2f\n", total);

        teclado.close();
    }
}