

package Atividades_Metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT2_Metodos {
    
    
    public static boolean parImpar(int numero){
        
       return numero % 2 ==0;
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
       
        
        System.out.println("Digite um número para verificar se é par ou ímpar:");
        int numero = tc.nextInt();
        
        
        
        boolean resultado = parImpar(numero);
        
        if(resultado){
            
            System.out.println("O número é par!");
        }else{
            System.out.println("O número é Ímpar!");
            
        }
        
        
    }
    

}
