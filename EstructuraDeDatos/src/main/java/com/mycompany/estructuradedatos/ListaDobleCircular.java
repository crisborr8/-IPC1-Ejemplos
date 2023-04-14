
package com.mycompany.estructuradedatos;

public class ListaDobleCircular {
    //Necesitamos etiquetas de raiz
    private NodoDoble raiz;
    public ListaDobleCircular(){
        raiz = null;
    }
    
    //Insertar al inicio
    public void insertarAlInicio(String dato){
        //Verificamos que la raiz no este vacia
        if(raiz == null){
            NodoDoble nuevoNodo = new NodoDoble();
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(nuevoNodo);
            raiz = nuevoNodo;
        }else{
            NodoDoble nuevoNodo = new NodoDoble();
            nuevoNodo.setDato(dato);
            nuevoNodo.setSiguiente(raiz);
            nuevoNodo.setAnterior(raiz.getAnterior());
            
            raiz.getAnterior().setSiguiente(nuevoNodo);
            raiz.setAnterior(nuevoNodo);
            raiz = nuevoNodo;
        }
    }
    
    //Recorrer
    public void recorrerLista(){
        //Verificamos que la raiz no este vacia
        if(raiz == null){
            System.out.println("ERROR!!!! La lista esta vacia");
        }else{
            NodoDoble temporal = raiz;
            int contador = 1;
            do{
                System.out.println("Imprimiendo nodo " + contador);
                System.out.println("\tDato: " + temporal.getDato());
                temporal = temporal.getSiguiente();
                contador++;
            }while(temporal != raiz);
        }
    }
}
