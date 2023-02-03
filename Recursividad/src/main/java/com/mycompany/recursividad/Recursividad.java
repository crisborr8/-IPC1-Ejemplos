/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividad;

/**
 *
 * @author criss
 */
public class Recursividad {
    
    
    public int Factorial(int numero){   //5  / 4    / 3   /2    /1    /0
        if(numero == 0){  // :D
            return 1; 
        }
        return numero * Factorial(numero - 1);   //5 * 24 = 120  / 4 * 6 = 24  / 3 * 2 = 6  /2 * 1 = 2   /1 * 1 = 1
    } 
    
    
    // 1  1  2  3  5  8  13  21 ... 
    public int Fibonacci(int posicion){   // 6  / 5 / 4 / 3 / 1
        if(posicion <= 1){
            return posicion;
        }
        return Fibonacci(posicion - 1) + Fibonacci(posicion - 2);
    }
    
    //F(0) = 0   F(1) = 1  F(2)= 1   F(3) = 2    F(4) = 3   F(5)=5  F(6)=8
    
    public static void main(String[] args) {
        System.out.println(new Recursividad().Factorial(8));
        System.out.println(new Recursividad().Fibonacci(6));
    }
}
