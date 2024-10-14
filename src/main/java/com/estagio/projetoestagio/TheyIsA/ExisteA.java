/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estagio.projetoestagio.TheyIsA;

import java.util.Scanner;

public class ExisteA {
    
    public static String verificarA(String text){
        
         if (text == null) {
        return "String é nula";
    }
        String text2 = text.trim();
         if(text2.toLowerCase().contains("a")){
        return "Existe letra a";
    }else
         return "Não existe letra a";
    }
    
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
    System.out.println("Introduza a String");
    String text = scan.nextLine();
  
    
   String resultado = verificarA(text);
    
      System.out.println(resultado); 
    }
    
   
    
}
