/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodos;

/**
 *
 * @author criss
 */
public class Metodos {
    
    String nombre;
    
    public Metodos(){
        System.out.println("Soy un constructor sin parámetros");
        nombre ="nombre por defecto";
    }
    public Metodos(String nombre){
        this.nombre = nombre;
    }
    public Metodos(int numero){
        System.out.println("Soy un constructor con parámetros enteros: " + numero);
    }
    public Metodos(int numero1, int numero2){
        System.out.println("Soy un constructor con 2 parámetros enteros: " + numero1 + ", " + numero2);
    }
    public Metodos(double numero){
        System.out.println("Soy un constructor con parámetros decimales: " + numero);
    }

    public void Llamame(){
        System.out.println("Soy un metodo de llamada :D");
        System.out.println("Nombre: " + this.nombre);
    }

    public static void main(String[] args) {
        Metodos instancia = new Metodos();
        instancia.Llamame();
    }
}
