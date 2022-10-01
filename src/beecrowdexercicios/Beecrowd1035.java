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

public class Beecrowd1035 {

    public static void main(String[] args) throws IOException {

      Scanner teclado = new Scanner(System.in);
      int A,B,C,D;

      A = teclado.nextInt();
      B = teclado.nextInt();
      C = teclado.nextInt();
      D = teclado.nextInt();

      if ((B > C) && (D > A) && (C+D > A+B) && (C > 0) && (D > 0) && (A%2==0)) {
        System.out.println("Valores aceitos");
      }
      else {
        System.out.println("Valores nao aceitos");
      }
    }

}