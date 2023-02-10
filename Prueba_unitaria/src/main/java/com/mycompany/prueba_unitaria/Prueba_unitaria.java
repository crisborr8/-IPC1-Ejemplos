/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba_unitaria;

import java.util.Scanner;

/**
 *
 * @author criss
 */
public class Prueba_unitaria {
    
    public double division(int a, int b){
        if(b == 0) return 0;
        return a/b;
    }
    
    public void MetodoDeIngresoDeNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        String edad = sc.nextLine();
        System.out.println("Su nombre es: " + nombre + ", su edad es: " + edad);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
