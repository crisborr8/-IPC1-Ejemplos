/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filtrodefoto;

import javax.swing.ImageIcon;

/**
 *
 * @author criss
 */
public class NodoImagen {
    
    private ImageIcon imagen;
    private ImageIcon imager_reset;
    private NodoImagen siguiente;
    private NodoImagen anterior;

    public NodoImagen getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoImagen siguiente) {
        this.siguiente = siguiente;
    }
    
    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public ImageIcon getImager_reset() {
        return imager_reset;
    }

    public void setImager_reset(ImageIcon imager_reset) {
        this.imager_reset = imager_reset;
    }

    public NodoImagen getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoImagen anterior) {
        this.anterior = anterior;
    }
    
    
}
