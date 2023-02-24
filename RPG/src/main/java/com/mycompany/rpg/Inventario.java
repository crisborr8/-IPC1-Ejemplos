/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpg;

/**
 *
 * @author criss
 */
public class Inventario {
    private String nombre;
    private String tipo;
    private int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //0 - 4
    String[] comida = {"Patatas", "Fruta", "Pan", "Fresco", "Agua"};
    String[] arma = {"Hacha", "Espada", "Escudo", "Arco", "Vara"};
    String[] pocion = {"Curacion", "Veneno", "Fuerza", "Velocidad", "Defenza"};
    
    public Inventario getItemAleatorio(){
        //Tres tipos
        int tipo = (int)(Math.random()*3 + 1);
        //ver el indice del array de comida, arma o pocion
        int i = (int)(Math.random()*5 + 1);
        Inventario inv = new Inventario();
        //Cantidad desde 1 hasta 10
        inv.setCantidad((int)(Math.random()*10 + 1));
        switch(tipo){
            case 1: //Comida 1 - 5
                inv.setTipo("Comida");
                inv.setNombre(comida[i - 1]);
                break;
            case 2: //Armas 1 - 5
                inv.setTipo("Arma");
                inv.setNombre(arma[i - 1]);
                break;
            case 3: //Pocion 1 - 5
                inv.setTipo("Pocion");
                inv.setNombre(pocion[i - 1]);
                break;
        }
        return inv;
    }
}
