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
public class Beecrowd1017 {
 
    public static void main(String[] args) throws IOException {
    Scanner entrada = new Scanner(System.in);
    
    int horas, velocidadeM;
    double distancia;
    
    horas = entrada.nextInt();
    velocidadeM = entrada.nextInt();
    
    distancia = (horas * velocidadeM );
    distancia = (distancia/12);
    
    System.out.printf("%.3f%n", distancia);
 
    }
 
}