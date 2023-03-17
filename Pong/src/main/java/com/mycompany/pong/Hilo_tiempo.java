/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pong;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author criss
 */
public class Hilo_tiempo extends Thread{
    //Queremos modificar el tiempo
    //Por lo tanto obtenemos el lbl_tiempo
    private JLabel lbl_tiempo;
    private int min = 0, seg = 0;
    
    //Declaramos un constructor para obtener el valor original de lbl_tiempo
    public Hilo_tiempo(JLabel lbl_tiempo) {
        this.lbl_tiempo = lbl_tiempo;
    }
    
    //Declarar nuestra metodo run para poder ejecutar el hilo
    public void run(){
        while(true){
            try {
                sleep(1000); //1000 ms = 1s
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo_tiempo.class.getName()).log(Level.SEVERE, null, ex);
            }
            seg++;
            if(seg >= 60){
                min++;
                seg = 0;
            }
            lbl_tiempo.setText(min + ":" + seg);
        }
    }
}
