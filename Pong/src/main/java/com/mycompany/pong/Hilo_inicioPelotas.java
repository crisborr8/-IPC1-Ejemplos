/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pong;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class Hilo_inicioPelotas extends Thread{
    
    private List<Hilo_movimientoPelota> lista_pelotas;
    private Hilo_tiempo tiempo;

    public Hilo_inicioPelotas(List<Hilo_movimientoPelota> lista_pelotas, Hilo_tiempo tiempo) {
        this.lista_pelotas = lista_pelotas;
        this.tiempo = tiempo;
    }

    public void run(){
        for (Hilo_movimientoPelota pelota : lista_pelotas){
            pelota.start();
        }
        //Verificar que todas las pelotas hayan sido eliminadas
        int contador_de_ejecuiones_detenidas = 0;
        while(contador_de_ejecuiones_detenidas < lista_pelotas.size()){
            //Le agregamos un sleep para que le de tiempo al programa a pensar y procesar los datos
            try {
                sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo_inicioPelotas.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Verificamos que todas las ejecuciones de pelotas esten finalizadas
            contador_de_ejecuiones_detenidas = 0;
            for (Hilo_movimientoPelota pelota : lista_pelotas){
                if (!pelota.getEn_ejecucion()) contador_de_ejecuiones_detenidas++;
            }
        }
        tiempo.stop();
        JOptionPane.showMessageDialog(null, "Juego terminado :3");
    }
}
