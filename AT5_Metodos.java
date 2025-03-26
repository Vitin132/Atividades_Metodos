package Atividades_Metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT5_Metodos {

    public static int vogais(String palavra) {
        
        int contador = 0;
        
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                contador++;

            }

        }
        return contador;

    }

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = tc.nextLine();
        
        
        int resultado = vogais(palavra);
        
        System.out.println("A quantidade de vogais na palavra é: "+resultado);

    }

}
