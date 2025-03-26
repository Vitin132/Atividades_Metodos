

package Atividades_Metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT3_metodos {

    
    public static int fatorial(int numero){
        
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = tc.nextInt();
        
        
        System.out.println("O fatorial de "+numero+" é: "+fatorial(numero));
        
        
    }
    
    
}
