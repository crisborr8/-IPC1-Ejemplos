/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificaion_de_datos;

import java.util.Scanner;

/**
 *
 * @author criss
 */
public class Verificaion_de_datos {
    
    /*
        Se desea crear un programa que inicie siempre y cuando
        el usuario ingrese la palabra "ingresar"
    
        Existe un juego en el cual tengo la capacidad de meter objetos en un
        cofre y estos se pueden stakear (juntar) de forma infinita, es decir, hay
        infinitas flechas, infinitas bombas, etc.
        
        Yo quiero como jugador obtener cuantas flechas, bombas, ropa, etc quiera de ese
        cofre y puedo obtenerlas ya sea solicitado primero 1 flecha, luego 1 bomba
        luego otra flecha, luego otra flecha y luego una bomba, esto me deberia de dar
        en total en mi invetario como jugador (suponiendo que mi inventario esta vacio al inicio)
        3 flechas y 2 bombas.
    */
    
    Scanner entrada = new Scanner(System.in);
    String[] cofre = new String[10];
    String[][] inventario = new String[10][2];
    int contador_inventario = 0;
    /*
    Matriz
                1           2   
        1   Arcos          5
        2   Bombas         8
        3   Flechas        500
        4
        5
        6
        7
        8
        9
        10
    */
    
    public void Sacar_inventario_de_cofre(){
        Llenar_cofre();
        
        while(true){
            System.out.println("A continuacion se le presentara los items dentro del cofre");
            System.out.println("Seleccione el número de item que quiera y luego se le indicara la cantidad de ese item a sacar");
            System.out.println("0. Salir");
            for(int contador = 0; contador  < cofre.length; contador++){
                System.out.println((contador + 1) + ". " + cofre[contador]);
            }
            int id_cofre = entrada.nextInt();
            
            //este codigo saca del bucle si el id_cofre es igual a 0
            if(id_cofre == 0){
                break;
            }
            
            //Este codigo solicita la cantidad de items
            System.out.println("Ingrese la cantidad de items a sacar");
            int cantidad = entrada.nextInt();
            
            
            boolean ya_se_ha_escrito = false;
            for(int contador = 0; contador < inventario.length; contador++){
                if(inventario[contador][0] != null){
                    if(inventario[contador][0].equals(cofre[id_cofre - 1])){
                        inventario[contador][1] = Integer.parseInt(inventario[contador][1]) + cantidad + "";                        
                        ya_se_ha_escrito = true;
                        break;
                    }
                }
            }
            if (!ya_se_ha_escrito){  //solo se ejecuta si el valor puesto es verdadero      false ?? ! -> false -> verdadero   verdadero ->false
                //Este codigo mete los datos al inventario
                inventario[contador_inventario][0] = cofre[id_cofre - 1];
                inventario[contador_inventario][1] = cantidad + ""; // Integer.toString(cantidad);
                contador_inventario++;
            }
        }
        
        
        
        System.out.println("Ahora se mostrará su inventario");
        for(int contador = 0; contador < inventario.length; contador++){
            System.out.println("------------------");
            System.out.println("Nombre: " + inventario[contador][0]);
            System.out.println("Cantidad: " + inventario[contador][1]);
        }
    }
    
    public void Llenar_cofre(){
        cofre[0] = "Flechas";
        cofre[1] = "Bombas";
        cofre[2] = "Escudos";
        cofre[3] = "Cascos";
        cofre[4] = "Pechera";
        cofre[5] = "Botas";
        cofre[6] = "Arcos";
        cofre[7] = "Espadas";
        cofre[8] = "Martillos";
        cofre[9] = "Pociones";
    }
    
    // 1. sdfsdfs
    //2. sdfsefsfsf
    
    public void Inicio(){
        while(true){
            System.out.println("Ingrese la palabara secreta para iniciar el programa");
            String texto_ingresado = entrada.nextLine();
            if (texto_ingresado.equals("ingresar")){
                System.out.println("Ha ingresado la palabra secreta con exito, iniciando el programa");
                Sacar_inventario_de_cofre();
                break;
            }else{
                System.out.println("Palabra incorrecta");
            }
        }
    }
    
    

    public static void main(String[] args) {
        new Verificaion_de_datos().Inicio();

        //Verificaion_de_datos llamada_de_codigo = new Verificaion_de_datos();
        //llamada_de_codigo.Inicio();
    }
}
