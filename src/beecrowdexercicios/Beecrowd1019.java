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
public class Beecrowd1019 {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        int segundos, horas = 0, minutos = 0;
        
        segundos = entrada.nextInt();
        
        horas = segundos/3600;
        segundos = segundos % 3600;
        
        minutos = segundos/60;
        segundos = segundos % 60;
        
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
    }
 
}