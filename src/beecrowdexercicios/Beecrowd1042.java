package beecrowdexercicios;

import java.util.Scanner;

public class Beecrowd1042 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor[] = new int[3];
        int valorCrescente[] = new int[3];
        
        for(int i = 0; i<3;i++){
            valor[i] = entrada.nextInt();
        }
        
        if(valor[0] > valor[1] && valor[0] > valor[2] && valor[1] > valor[2]){
            valorCrescente[0] = valor[0];
            valorCrescente[1] = valor[1];
            valorCrescente[2] = valor[2];
        }
        if(valor[0] > valor[1] && valor[0] > valor[2] && valor[2] > valor[1]){
            valorCrescente[0] = valor[0];
            valorCrescente[1] = valor[2];
            valorCrescente[2] = valor[1];
        }
        
        if(valor[1] > valor[0] && valor[1] > valor[2] && valor[0] > valor[2]){
            valorCrescente[0] = valor[1];
            valorCrescente[1] = valor[0];
            valorCrescente[2] = valor[2];
        }
        if(valor[1] > valor[0] && valor[1] > valor[2] && valor[2] > valor[0]){
            valorCrescente[0] = valor[1];
            valorCrescente[1] = valor[2];
            valorCrescente[2] = valor[0];
        }
        
        if(valor[2] > valor[0] && valor[2] > valor[1] && valor[1] > valor[0]){
            valorCrescente[0] = valor[2];
            valorCrescente[1] = valor[1];
            valorCrescente[2] = valor[0];
        }
        
        if(valor[2] > valor[0] && valor[2] > valor[1] && valor[0] > valor[1]){
            valorCrescente[0] = valor[2];
            valorCrescente[1] = valor[0];
            valorCrescente[2] = valor[1];
        }
        
        for(int i = 0; i<3;i++){
            System.out.println(valor[i]);
        }
        System.out.println(" ");
        for(int i = 0; i<3;i++){
            System.out.println(valorCrescente[i]);
        }
    }
}
