/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrowdexercicios;

import java.io.IOException;
import java.util.Scanner;
public class Beecrowd1010 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner entrada = new Scanner(System.in);
    int codigo1, numero1, codigo2, numero2;
    double valor1, valor2, total;
    
    codigo1 = entrada.nextInt();
    numero1 = entrada.nextInt();
    valor1 = entrada.nextDouble();
    codigo2 = entrada.nextInt();
    numero2 = entrada.nextInt();
    valor2 = entrada.nextDouble();
    
    total = (numero1*valor1) + (numero2*valor2);
    
    System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
    }
 
}