/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrowdexercicios;
import java.io.IOException;
import java.util.Scanner;
public class Beecrowd1006 {
 
    public static void main(String[] args) throws IOException {
 
       Scanner entrada = new Scanner(System.in);
    double A, B, C, media;
    A = entrada.nextDouble();
    B = entrada.nextDouble();
    C = entrada.nextDouble();
    
    media = ((A*2)+(B*3)+(C*5))/10;
    
    System.out.printf("MEDIA = %.1f%n",media);
    }
 
}