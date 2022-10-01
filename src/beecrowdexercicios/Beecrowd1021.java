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

public class Beecrowd1021 {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double valorSaque = entrada.nextDouble();
        int valor =  0;
        System.out.println("NOTAS:");
        valor = (int) valorSaque/100;
        System.out.printf("%d nota(s) de R$ 100.00%n",valor);
        valorSaque = valorSaque % 100;
      
        valor =(int)  valorSaque/50;
        System.out.printf("%d nota(s) de R$ 50.00%n",valor);
        valorSaque = valorSaque % 50;
      
        valor = (int) valorSaque/20;
        System.out.printf("%d nota(s) de R$ 20.00%n",valor);
        valorSaque = valorSaque % 20;
      
        valor = (int) valorSaque/10;
         System.out.printf("%d nota(s) de R$ 10.00%n",valor);
        valorSaque = valorSaque % 10;
      
        valor = (int) valorSaque/5;
        System.out.printf("%d nota(s) de R$ 5.00%n",valor);
        valorSaque = valorSaque % 5;
      
        valor = (int) valorSaque/2;
        System.out.printf("%d nota(s) de R$ 2.00%n",valor);
        valorSaque = valorSaque %2;

        valorSaque = valorSaque * 100;

        System.out.println("MOEDAS:");
        valor = (int) valorSaque / 100;
        System.out.printf("%d moeda(s) de R$ 1.00%n",valor);
        valorSaque = valorSaque%100;
        
        valor = (int) valorSaque / 50;
        System.out.printf("%d moeda(s) de R$ 0.50%n",valor);
        valorSaque = valorSaque%50;

        valor = (int) valorSaque / 25;
        System.out.printf("%d moeda(s) de R$ 0.25%n",valor);
        valorSaque = valorSaque%25;

        valor = (int) valorSaque / 10;
        System.out.printf("%d moeda(s) de R$ 0.10%n",valor);
        valorSaque = valorSaque%10;

        valor = (int) valorSaque / 5;
        System.out.printf("%d moeda(s) de R$ 0.05%n",valor);
        valorSaque = valorSaque%5;
  
        valor = (int) valorSaque / 1;
        System.out.printf("%d moeda(s) de R$ 0.01%n",valor);
        valorSaque = valorSaque%1;
    }
 
}