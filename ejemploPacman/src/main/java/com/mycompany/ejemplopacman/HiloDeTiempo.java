/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplopacman;

import javax.swing.JLabel;

/**
 *
 * @author criss
 */
public class HiloDeTiempo extends Thread{
    //Declarar el JLabel del tiempo
    private JLabel tiempo;
    //Contadores para segundos y minutos
    private int min = 0, seg = 0;
    //Declarar un constructor que obtenga el JLabel del JPanel del juego y lo asigne a este para
    //llevar el original
    public HiloDeTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }
    
    //Esta palabra reservada run() para ejecutar el hilo
    public void run(){
        //un bucle infinito para llevar el conteo del tiempo
        while(true){
            //Nos sirve para llevar un sleep o un aplazamiento del tiempo
            try{
                Thread.sleep(1000); //Adentro va el tiempo en milisegudos -> 1000ms = 1s
            } catch(InterruptedException e){
                e.printStackTrace(); // Imprime la secuencia de error actual.
            }
            
            seg++;
            if(seg > 59){
                min ++;
                seg = 0;
            }
            //Imprimir en pantalla
            tiempo.setText(min + ":" + seg);
        }
    }
}
