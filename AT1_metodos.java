

package Atividades_Metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT1_metodos {

    
    public static int somar(int n1, int n2){
        
        return n1+n2;
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int n1 = tc.nextInt();
        
        
        System.out.println("Digite o segundo número: ");
        int n2 = tc.nextInt();
        
        int resultado = somar(n1,n2);
        
        System.out.println("A soma de "+n1+ " + "+n2+" é: "+resultado);
        
    }
    
    
    
    
}
