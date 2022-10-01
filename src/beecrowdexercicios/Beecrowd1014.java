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
public class Beecrowd1014 {
 
    public static void main(String[] args) throws IOException {
 
         Scanner entrada = new Scanner(System.in);
        
        int km;
        double litros, total;
        
        km = entrada.nextInt();
        litros = entrada.nextDouble();
        
        total = km/litros;
        System.out.printf("%.3f km/l\n",total);
    }
 
}
