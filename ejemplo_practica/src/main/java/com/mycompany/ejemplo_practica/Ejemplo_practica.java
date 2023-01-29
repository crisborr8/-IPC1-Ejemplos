/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo_practica;
import java.util.Scanner;
/**
 *
 * @author criss
 */
public class Ejemplo_practica {

    public static void main(String[] args) {
        
        Scanner entradas = new Scanner(System.in);
        String eleccion = "";
        while(!eleccion.equals("3")){
            System.out.println("Menu de seleccion de opciones");
            System.out.println("1. Mostrar palabra hola");
            System.out.println("2. Mostrar palabra adios");        
            System.out.println("3. Salir");
            eleccion = entradas.nextLine();
            
            if (eleccion.equals("1")){
                System.out.println("Holis ;3");
            } else if (eleccion.equals("2")){
                System.out.println("Adios :c");
            } else if (eleccion.equals("3")){
                System.out.println("Saliendo");
            } else {
                System.out.println("No ingresaste una opcion valida");
            }
        }

    }
}
