

package Atividades_Metodos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT4_Metodos {

    
    public static double paraFarenheit(double celsius){
        
        return (celsius*9/5) + 32;
        
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = tc.nextDouble();
        
        
        double farenheit = paraFarenheit(celsius);
        
        System.out.println("A temp de "+celsius+" Celsius para Farenheit é "+paraFarenheit(celsius));
        
        
        
        
    }
    
    
    
}
