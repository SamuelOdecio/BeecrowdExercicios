package beecrowdexercicios;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Beecrowd1040 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();
        double n4 = entrada.nextDouble();
        double notaExame;
        
        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1))/10 ;
        
        System.out.println("Media: " + df.format(media));

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }
        if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            notaExame = entrada.nextDouble();
            System.out.println("Nota do exame: " + notaExame);
            media = (notaExame + media) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: "+media);
            } else if (media < 5.0) {
                System.out.println("Aluno reprovado.");
            }
        }
    }
}