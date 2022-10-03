package beecrowdexercicios;

import java.util.Scanner;

public class Beecrowd1038 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigo = entrada.nextInt();
        int quantidade = entrada.nextInt();
        double valorTotal = 0.00;

        if (codigo == 1) {
            valorTotal = quantidade * 4.00;
            System.out.printf("Total: R$ %.2f\n",valorTotal);
        } else if (codigo == 2) {
            valorTotal = quantidade * 4.50;
            System.out.printf("Total: R$ %.2f\n",valorTotal);
        }else if (codigo == 3) {
            valorTotal = quantidade * 5.00;
            System.out.printf("Total: R$ %.2f\n",valorTotal);
        }else if (codigo == 4) {
            valorTotal = quantidade * 2.00;
            System.out.printf("Total: R$ %.2f\n",valorTotal);
        }else if (codigo == 5) {
            valorTotal = quantidade * 1.50;
            System.out.printf("Total: R$ %.2f\n",valorTotal);
        }
    }
}
