package com.mycompany.calculadora;

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        
        Scanner calculadora = new Scanner(System.in);
        
        System.out.println("Digite:");
        
        //int a, b, resultado;
       double a, b, resultado;
        
        //a = calculadora.nextInt();
        //b = calculadora.nextInt();
       a = calculadora.nextDouble();
       b = calculadora.nextDouble();
        
        
        //resultado = (int) a + b;     /* '()' é usado para converter os números*/
        resultado = (double) a * b;
      
        System.out.println(resultado);
        
        
          
        
        
        
        
        
        
        
        
        
        
        
    }
}
