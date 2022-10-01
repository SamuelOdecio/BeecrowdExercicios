/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrowdexercicios;

import java.io.IOException;
import java.util.Scanner;
public class Beecrowd1008 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner entrada = new Scanner(System.in);
    int numeroF, horasT;
    double valorH, salario;
    
    numeroF = entrada.nextInt();
    horasT = entrada.nextInt();
    valorH = entrada.nextDouble();
    
    salario = horasT * valorH;
    
    System.out.println("NUMBER = "+numeroF);
    System.out.printf("SALARY = U$ %.2f%n",salario);
    }
 
}