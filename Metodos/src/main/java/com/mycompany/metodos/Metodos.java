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
    
    //Este constructor se activa cuando se instancia la clase "Metodos" y no se envia ningun parámetro
    public Metodos(){
        System.out.println("Soy un constructor sin parámetros");
        nombre ="nombre por defecto";
    }
    //Este constructor se activa cuando se instancia la clase "Metodos" y se envia un parametro tipo String
    public Metodos(String nombre){
        //El this hace referencia a que se usara la variable global y no la variable 
        //del parametro. El nombre de la variable del parametro y el nombre de la variable global
        //pueden tener el mismo nombre, por eso se debe de hacer distincion a cual de esos dos se utilizará
        //porque por defecto, java tomará la variable del parámetro antes que la global.
        //asi que si se quiere usar la variable global y no la del parametro cuando se tienen el mismo nombre
        //se debe de usar la palabra reservada this
        this.nombre = nombre;
    }
    //Este constructor se activa cuando se instancia la clase "Metodos" y se envia un parametro tipo int
    public Metodos(int numero){
        System.out.println("Soy un constructor con parámetros enteros: " + numero);
    }
    //Este constructor se activa cuando se instancia la clase "Metodos" y se envian dos parametros tipo int y int
    public Metodos(int numero1, int numero2){
        System.out.println("Soy un constructor con 2 parámetros enteros: " + numero1 + ", " + numero2);
    }
    //Este constructor se activa cuando se instancia la clase "Metodos" y se envia un parametro tipo double
    public Metodos(double numero){
        System.out.println("Soy un constructor con parámetros decimales: " + numero);
    }

    //Este es un método simple :)
    public void Llamame(){
        System.out.println("Soy un metodo de llamada :D");
        System.out.println("Nombre: " + this.nombre);
    }

    public static void main(String[] args) {
        //En esta instancia se corre el constructor de forma automática
        //La forma en la que se decide el constructor a correr es 
        //Por medio del parametro que se envia, Java automaticamente
        //Verifica si hay un constructor con ese tipo de dato como parametro
        //y lo ejecuta
        Metodos instancia = new Metodos();
        //Se llama al metodo Llamame
        instancia.Llamame();
    }
}
