/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplopacman;

import javax.swing.JFrame;

//Heredamos de JFrame para hacer el marco del juego y que incluya todo lo dibujado :3
public class EjemploPacman extends JFrame{
    
    public void IniciarJuego(){
        //Definir el comportamiento del marco (JFrame)
        this.setTitle("Pacman XD");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminar el programa cuando cierre la pestaña
        
        //Llamar a pantalla de juego
        PantallaDeJuego pantalla = new PantallaDeJuego();
        this.getContentPane().add(pantalla); //Añadimos la pantalla de juego a este marco (JFrame)
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploPacman().IniciarJuego();
    }
}
