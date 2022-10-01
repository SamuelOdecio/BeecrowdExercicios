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
public class Beecrowd1015 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        
        x1 = entrada.nextDouble();
        y1 = entrada.nextDouble();
        x2 = entrada.nextDouble();
        y2 = entrada.nextDouble();
        
        distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        
        
        System.out.printf("%.4f%n",distancia);
    }
 
}