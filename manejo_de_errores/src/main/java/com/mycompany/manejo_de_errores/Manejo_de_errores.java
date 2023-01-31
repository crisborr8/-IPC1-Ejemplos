/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manejo_de_errores;
import java.util.Scanner;

/**
 *
 * @author criss
 */
public class Manejo_de_errores {
    
    Scanner entrada = new Scanner(System.in);
    /*
        Una veterinaria que ingresa las mascotas
        y puedo ver que mascotas estan dentro de la veterinaria.
    El nombre de las mascotas no puede repetirse D:
    */
    
    
    public void Menu(){
        String eleccion = "";
        while(!eleccion.equals("3")){ //-5  ! falso -> verdadero    verdadero -> falso
            System.out.println("************************");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Ingresar nombre de mascota");
            System.out.println("2. Ver mascotas ingresadas");
            System.out.println("3. Salir");
            eleccion = entrada.nextLine();
            switch(eleccion){
                case "1":
                    Ingresar_nombre_de_mascota();
                    break;
                case "2":
                    Ver_mascotas();
                    break;
                case "3":
                    System.out.println("Gracias por usar el sistema, adios! :D");
                    break;
                default:
                    System.out.println("************************");
                    System.out.println("Error, la opcion ingresada no existe");
            }
            
            
            
                /*
            if(eleccion.equals("1")){ // ==
                Ingresar_nombre_de_mascota();
            } else if (eleccion.equals("2")){
                Ver_mascotas();
            } else {
                if(!eleccion.equals("3")){
                    System.out.println("************************");
                    System.out.println("Error, la opcion ingresada no existe");
                }
            
            
                //esto es otra forma del if para el "3"
                if(eleccion.equals("3")){
                    
                } else {
                    System.out.println("Error, la opcion ingresada no existe");
                }
            }
            */
        }
        //*****
    }
    
    
    String[] nombre_mascotas = new String[10];
    int contador_de_escritura = 0;
    /*
    1. null
    2. null
    3. 
    4. 
    5. 
    */
    
    public void Ingresar_nombre_de_mascota(){
        System.out.println("************************");
        System.out.println("Comienza el codigo para ingresar mascota");
        System.out.println("Ingrese el nombre de la mascota");
        String nombre_de_mascota = entrada.nextLine(); //solo almacenamiento del nombre temporal
        //guardar el nombre en la variable nombre_mascotas
        if (contador_de_escritura >= nombre_mascotas.length){
            System.out.println("Error, ya se ha alcanzado el maximo de mascotas que se pueden ingresar");
        } else {
            boolean nombre_repetido = false;
            for(int contador = 0; contador < nombre_mascotas.length; contador++){
                if (nombre_mascotas[contador] != null){
                    if (nombre_mascotas[contador].equals(nombre_de_mascota)){ //String == String
                        System.out.println("Error, ya se ha ingresado ese nombre :c");
                        nombre_repetido = true;
                        //return; 
                    }
                    if(nombre_repetido == true){
                        break;
                    }
                }
            }
            if (nombre_repetido == false){
                nombre_mascotas[contador_de_escritura] = nombre_de_mascota;
                contador_de_escritura++;
                System.out.println("El nombre ha sido ingresado con exito");
            }
        }
    }
    
    public void Ver_mascotas(){
        System.out.println("************************");
        System.out.println("Comienza el codigo para ver mascota");
        for(int contador = 0; contador < nombre_mascotas.length; contador++){
            if (nombre_mascotas[contador] != null){
                System.out.println("Nombre de la mascota: " + nombre_mascotas[contador]);
            }
        }
    }

    public static void main(String[] args) {
        Manejo_de_errores mde = new Manejo_de_errores();
        mde.Menu();
        
        
        //new Manejo_de_errores().Menu();
    }
}
