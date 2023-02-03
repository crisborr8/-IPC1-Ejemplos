package com.mycompany.proyecto_simple;

//la importacion de librerias se pone debajo de package
import java.util.Scanner;

// Comentario de una linea

/*
Comentario
De
multilinea
*/

public class Proyecto_simple {
    
    //void, int, String, boolean, 
    public void MetodoParaIngresarNombre(){
        System.out.println("Ingrese el nombre de una persona");
        //Para solicitar los nombres, o para leer lo que ingreso
        //en el teclado
        //Esto solo me permite tener el espacio de memoria a utilizar
        //para guardar los datos de entrada
        Scanner entrada_de_datos = new Scanner(System.in);
        //Para almacenar lo que quiero ingresar, declaro una variable
        String nombre_de_persona = entrada_de_datos.nextLine();
        
        System.out.println("El nombre de la persona es: " + nombre_de_persona);
    
        OtroMetodo();
    }
    
    public void OtroMetodo(){
        System.out.println("********OTRO METODO*******");
    }

    public static void main(String[] args) {
        System.out.println("Este codigo se ejecutara si escribes la palabra secreta");
        Scanner entrada = new Scanner(System.in);
        String palabra = entrada.nextLine();
        if(palabra.equals("hola1234")){ // "hola" == "hola"
            System.out.print("Hola soy una linea :D sin salto");
            System.out.println("Hola soy una linea :D con salto");

            Proyecto_simple llamadas = new Proyecto_simple();
            llamadas.MetodoParaIngresarNombre();
        } else {
            System.out.println("Error, esa no es la palabra >:c");
        }
        
        
        
        //new Proyecto_simple().MetodoParaIngresarNombre();
        //new Proyecto_simple().OtroMetodo();
    }
}
