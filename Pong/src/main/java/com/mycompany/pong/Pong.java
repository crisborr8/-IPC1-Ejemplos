/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pong;

import javax.swing.JFrame;


public class Pong extends JFrame{
    
    public Pong(){
        setTitle("Pong");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Me permita cerrar el programa cuando cierre la ventana
        
        //Instanciar la clase ventana
        Ventana ventana = new Ventana();
        //Añadimos la ventana que se ha instanciado
        this.getContentPane().add(ventana);
        pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Pong();
    }
}
