package exercicio011024;

import java.util.Scanner;

public class Exercicio011024 {

   
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite Uma frase para ver se ela é palindroma ou nao");
       String frase = valor.nextLine();
   
    frase = frase.toUpperCase().replaceAll(" ", "");
    
        System.out.println(frase);
    
 
        
        
        String nomenovo ="";
        for (int i = frase.length()-1; i > -1; i--) {
            
            nomenovo += frase.charAt(i);
            
            
            
            
        }
        if (frase.equals(nomenovo)) {
            
            System.out.println("frase Palindroma");

        }else
        System.out.println("frase nao palindroma");
    
    
    
    }
    
    
}