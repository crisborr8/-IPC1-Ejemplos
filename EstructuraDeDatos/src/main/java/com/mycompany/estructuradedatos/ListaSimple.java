package com.mycompany.estructuradedatos;

public class ListaSimple {
    //Aqui es donde definimos el comportamiento de la lista
    //Definimos nuestra "cabeza" o "head" o "raiz"
    private NodoSimple raiz;
    //Definimos nuestra etiqueta de "cola" o "final" o "end"
    private NodoSimple cola;
    public ListaSimple(){
        raiz = null;
        cola = null;
    }
    
    
    //Definimos el metodo insertar al inicio
    public void insertarAlInicio(String dato){
        //Tengo que verificar que la lista no este vacia
        if(raiz == null){
            NodoSimple nuevoNodo = new NodoSimple();
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(null);
            raiz = nuevoNodo;
            //Dado que solo existe 1 dato, entonces raiz = cola
            cola = nuevoNodo;
        }else {
            NodoSimple nuevoNodo = new NodoSimple(); 
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(raiz);
            //Ahora la raiz esta apuntando al nuevo nodo que insertamos :D
            raiz = nuevoNodo;
        }
    }
    
    //Definir el metodo insertar al final
    public void insertarAlFinal(String dato){
        //Tengo que verificar que la lista no este vacia
        if(raiz == null){
            NodoSimple nuevoNodo = new NodoSimple();
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(null);
            raiz = nuevoNodo;
            //Dado que solo existe 1 dato, entonces raiz = cola
            cola = nuevoNodo;
        }else {
            NodoSimple nuevoNodo = new NodoSimple(); 
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(null);
            //Nos aseguramos que se inserte al final
            cola.setSiguiente(nuevoNodo);
            cola = nuevoNodo;
        }
    }
    
    //Definir el metodo insertar donde quieras
    public void insertarEnIndice(String dato, int indice){
        //Tengo que verificar que la lista no este vacia
        if(raiz == null){
            if(indice == 0){
                NodoSimple nuevoNodo = new NodoSimple();
                nuevoNodo.setDato(dato);
                nuevoNodo.setSiguiente(null);
                raiz = nuevoNodo;
                //Dado que solo existe 1 dato, entonces raiz = cola
                cola = nuevoNodo;
            }else{
                System.out.println("ERROR!!! El indice no es valido!!!!");
            }
        }else {
            NodoSimple nuevoNodo = new NodoSimple(); 
            nuevoNodo.setDato(dato);
            //Ahora insertamos en el indice
            NodoSimple temporal = raiz;
            
            //Caso 1 - Se quiere insertar al inicio
            if(indice == 0){
                nuevoNodo.setSiguiente(raiz);
                raiz = nuevoNodo;
            }
            else {
                int contador = 1;
                boolean bandera_de_insercion = false;
                while(temporal != null){
                    if(contador == indice){
                        //Case 2 - Se quiere insertar al final
                        if(temporal.getSiguiente() == null){
                            nuevoNodo.setSiguiente(null);
                            cola.setSiguiente(nuevoNodo);
                            cola = nuevoNodo;
                            bandera_de_insercion = true;
                            break;
                        }
                        //Caso 3 - Se quiere insertar en medio
                        else {
                            nuevoNodo.setSiguiente(temporal.getSiguiente());
                            temporal.setSiguiente(nuevoNodo);
                            bandera_de_insercion = true;
                            break;
                        }
                    }
                }
                if(!bandera_de_insercion){
                    System.out.println("ERROR!!! El indice no es valido!!!!");
                }
            }
        }
        
    }
    
    //Definir eliminar
    
    //Definir recorrer toda la lista
    public void recorrerLista(){
        //Crear una variable temporal para recorrer la lista
        NodoSimple temporal = raiz;
        int contador = 1;
        while(temporal != null){
            System.out.println("Imprimiendo el nodo " + contador);
            System.out.println("\tDato: " + temporal.getDato());
            contador++;
            temporal = temporal.getSiguiente();
        }
    }
}
