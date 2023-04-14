
package com.mycompany.estructuradedatos;

public class NodoDoble {
    //Necesitamos 3 cosas
    //1 - El dato
    //2 - El puntero siguiente
    //3 - El puntero de anterior
    private String dato;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
    
    
}
