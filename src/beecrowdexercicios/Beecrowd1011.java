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

public class Beecrowd1011 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner entrada = new Scanner(System.in);
    double volume, raio, pi = 3.14159;
    
    raio = entrada.nextDouble();
    volume = (4/3.0) * (pi * (raio*raio*raio));
    
    System.out.printf("VOLUME = %.3f%n", volume);
    }
 
}