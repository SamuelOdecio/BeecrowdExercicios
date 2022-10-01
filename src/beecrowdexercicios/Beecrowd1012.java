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

public class Beecrowd1012{
 
    public static void main(String[] args) throws IOException {
    Scanner entrada = new Scanner(System.in);
    
    double a,b,c, pi = 3.14159;
    double triangulo, circulo, trapezio, quadrado,retangulo;
    
    a = entrada.nextDouble();
    b = entrada.nextDouble();
    c = entrada.nextDouble();
    
    triangulo = (a*c)/2;
    circulo = pi * (c*c);
    trapezio = ((a+b)*c)/2;
    quadrado = b*b;
    retangulo = a*b;
    
    System.out.printf("TRIANGULO: %.3f%n",triangulo);
    System.out.printf("CIRCULO: %.3f%n",circulo);
    System.out.printf("TRAPEZIO: %.3f%n",trapezio);
    System.out.printf("QUADRADO: %.3f%n",quadrado);
    System.out.printf("RETANGULO: %.3f%n",retangulo);
    
    }
 
}