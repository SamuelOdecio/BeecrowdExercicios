/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beecrowdexercicios;

import java.io.IOException;
import java.util.Scanner;
public class Beecrowd1007 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner entrada = new Scanner(System.in);
    int a,b,c,d,diferenca;
    
    a = entrada.nextInt();
    b = entrada.nextInt();
    c = entrada.nextInt();
    d = entrada.nextInt();
    
    diferenca = (a*b)-(c*d);
    
    System.out.println("DIFERENCA = "+diferenca);
    
    }
 
}