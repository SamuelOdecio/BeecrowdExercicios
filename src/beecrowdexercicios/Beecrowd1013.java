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
public class Beecrowd1013 {
 
    public static void main(String[] args) throws IOException {
    Scanner entrada = new Scanner(System.in);
    
    int a, b, c, maiorAB, maiorAC;
    a = entrada.nextInt();
    b = entrada.nextInt();
    c = entrada.nextInt();
      
    maiorAB = (a + b + Math.abs (a- b))/2;
    maiorAC = (maiorAB + c + Math.abs (maiorAB - c))/2;
    
    System.out.println(maiorAC + " eh o maior");
    
    }
 
}