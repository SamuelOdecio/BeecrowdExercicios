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
public class Beecrowd1020 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        int idadeDias, mes, anos;

        idadeDias = entrada.nextInt();
      
        anos = idadeDias/365;
        idadeDias = idadeDias % 365;
        
        mes = idadeDias/30;
        idadeDias = idadeDias % 30;
      
        System.out.printf("%d ano(s)%n", anos);
        System.out.printf("%d mes(es)%n", mes);
        System.out.printf("%d dia(s)%n", idadeDias);

    }
 
}