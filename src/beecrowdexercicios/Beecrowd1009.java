/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrowdexercicios;

import java.io.IOException;
import java.util.Scanner;
public class Beecrowd1009 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner entrada = new Scanner(System.in);
    String nomeVendedor;
    double salarioFixo,salarioFinal,valorVendas;
  
    
    nomeVendedor = entrada.next();
    salarioFixo = entrada.nextDouble();
    valorVendas = entrada.nextDouble();
    
    salarioFinal = salarioFixo + (valorVendas*0.15);
    
    System.out.printf("TOTAL = R$ %.2f%n",salarioFinal);
    }
 
}