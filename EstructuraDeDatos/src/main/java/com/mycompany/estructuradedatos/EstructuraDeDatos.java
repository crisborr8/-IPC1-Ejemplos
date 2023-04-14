package com.mycompany.estructuradedatos;

public class EstructuraDeDatos {

    public void EjemploListaSimple(){
        ListaSimple lista = new ListaSimple();
        lista.recorrerLista();
        lista.insertarAlInicio("numero 8");
        lista.insertarAlInicio("digito 7");
        lista.recorrerLista();
        System.out.println("-----------------Insertando al final-------------------");
        lista.insertarAlFinal("15");
        lista.recorrerLista();
        System.out.println("-----------------Insertando al inicio-------------------");
        lista.insertarAlInicio("3");
        lista.recorrerLista();
        
        System.out.println("-----------------Insertando en medio-------------------");
        lista.insertarEnIndice("5", 1);
        lista.recorrerLista();
    }
    
    
    public static void main(String[] args) {
        ListaDobleCircular lista = new ListaDobleCircular();
        lista.recorrerLista();
        System.out.println("-----------------------------------");
        lista.insertarAlInicio("5");
        lista.recorrerLista();
        System.out.println("-----------------------------------");
        lista.insertarAlInicio("3");
        lista.insertarAlInicio("1");
        lista.recorrerLista();
        System.out.println("-----------------------------------");
    }
}
