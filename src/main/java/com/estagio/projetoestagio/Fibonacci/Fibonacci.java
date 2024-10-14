/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estagio.projetoestagio.Fibonacci;

import java.util.Scanner;


public class Fibonacci {
    
    public static String Calcular(int range){
       
       int a = 0;
       int b = 1;
       int fib = b;
       
       if(range == 0 || range == 1){
           return "Valor pertence a fibonnaci";
       }
       
       while(fib < range){
           fib = b + a;
           a = b;
           b = fib;
       }
       if(fib == range){
           return "Valor pertence a fibonnaci";
       }
       return "Valor não pertence a fibonnaci";
   }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        
        System.out.println("selecione o valor a ser buscado");
        int range = scan.nextInt();
        
        String resultado = Calcular(range);
        System.out.println(resultado);
       
    }
    
}
