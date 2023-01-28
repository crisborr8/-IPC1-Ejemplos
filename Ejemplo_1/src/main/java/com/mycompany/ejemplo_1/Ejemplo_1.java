/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo_1;

/**
 *
 * @author criss
 */
public class Ejemplo_1 {
    
    public void Prueba_de_if(){
        System.out.println("Evaluacion de if");
        int var1 = 50;
        int var2 = 50;
        
        if (var1 == var2){
            System.out.println("La variable 1 y 2 son iguales");
        }
        System.out.println("Continua el codigo....");
    }
    
    public void Prueba_de_if_else(){
        System.out.println("Evaluacion de if else");
        int var1 = 50;
        int var2 = 50;
        
        if (var1 != var2){
            System.out.println("La variable 1 no es igual a la variable 2");
        } else {
            System.out.println("La variable 1 es igual a la variable 2");
        }
        System.out.println("Continua el código.....");
    }
    
    public void Prueba_de_if_else_if_else(){
        System.out.println("Evaluacion de if else if else");
        int var1 = 3;
        
        if(var1 == 1){
            System.out.println("El numero es 1");
        } else if (var1 == 2){
            System.out.println("El numero es 2");
        } else if (var1 == 3){
            System.out.println("El numero es 3");
        } else {
            System.out.println("No se que numero es :c ");
        }
        System.out.println("Continua el código.....");
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
      //if
        Ejemplo_1 clase_instanciada = new Ejemplo_1();
        clase_instanciada.Prueba_de_if();

        //if else
        clase_instanciada.Prueba_de_if_else();

        //if else if else
        clase_instanciada.Prueba_de_if_else_if_else();

        //for

        //while


        //do while
    }
}
