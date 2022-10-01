/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrowdexercicios;

/**
 *
 * @author Samuel
 */
import java.io.IOException;
import java.util.Scanner;

public class Beecrowd1018 {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int valorSaque = entrada.nextInt();
        int printValor = valorSaque;
        int n100 = valorSaque/100;
        valorSaque = valorSaque % 100;
        int n50 = valorSaque/50;
        valorSaque = valorSaque % 50;
        int n20 = valorSaque/20;
        valorSaque = valorSaque % 20;
        int n10 = valorSaque/10;
        valorSaque = valorSaque % 10;
        int n5 = valorSaque/5;
        valorSaque = valorSaque % 5;
        int n2 = valorSaque/2;
        int n1 = valorSaque % 2;
        System.out.println(printValor);
        System.out.printf("%d nota(s) de R$ 100,00%n",n100);
        System.out.printf("%d nota(s) de R$ 50,00%n",n50);
        System.out.printf("%d nota(s) de R$ 20,00%n",n20);
        System.out.printf("%d nota(s) de R$ 10,00%n",n10);
        System.out.printf("%d nota(s) de R$ 5,00%n",n5);
        System.out.printf("%d nota(s) de R$ 2,00%n",n2);
        System.out.printf("%d nota(s) de R$ 1,00%n",n1);
    }
 
}