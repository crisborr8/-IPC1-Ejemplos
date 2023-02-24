/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author criss
 */
public class usuario {
    private String nombre_usuario;
    private String contraseña;
    private String clase;
    
    private int nivel;
    private int exp_actual;
    private int exp_necesaria;
    
    //Inventario
    //Cantidad de equipo (int)
    //Nombre equipo (string)
    //Tipo equipo (string)
    private List<Inventario> lista_inventario = new ArrayList<Inventario>();

    public usuario() {
        nivel = 1;
        exp_actual = 0;
        exp_necesaria = 100*2^1;
    }
    

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExp_actual() {
        return exp_actual;
    }

    public void setExp_actual(int exp_actual) {
        this.exp_actual = exp_actual;
    }

    public int getExp_necesaria() {
        return exp_necesaria;
    }

    public void setExp_necesaria(int exp_necesaria) {
        this.exp_necesaria = exp_necesaria;
    }

    public List<Inventario> getLista_inventario() {
        return lista_inventario;
    }

    public void setLista_inventario(List<Inventario> lista_inventario) {
        this.lista_inventario = lista_inventario;
    }
    
    
}
