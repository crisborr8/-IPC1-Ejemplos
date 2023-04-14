
package com.mycompany.estructuradedatos;

public class NodoSimple {
    //Necesitamos 2 cosas
    //1 - El dato
    //2 - El puntero
    private String dato;
    private NodoSimple siguiente;
    
    
    //Con esto ya estoy :D

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}
