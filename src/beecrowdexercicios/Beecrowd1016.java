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
public class Beecrowd1016 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        int carroX, tempo,hora = 60;
        
        carroX = entrada.nextInt();
        
        
        tempo = (hora * carroX) / 30;
        
        System.out.printf("%d minutos%n",tempo);
    }
 
}