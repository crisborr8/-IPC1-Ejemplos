/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pong;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author criss
 */
public class Hilo_movimientoPelota extends Thread{
    private JLabel lbl_pelota;
    private JLabel lbl_raqueta;
    private int angulo;
    private int choques;
    private boolean en_ejecucion;

    public Hilo_movimientoPelota(JLabel lbl_pelota, JLabel lbl_raqueta) {
        this.lbl_pelota = lbl_pelota;
        this.lbl_raqueta = lbl_raqueta;
    }
    
    private void coliciones(){
        //Obtener donde esta la pelota en X y Y
        int pos_x = lbl_pelota.getX();
        int pos_y = lbl_pelota.getY();
        //Definimos el comportamiento de la pelota cuando toque la raqueta
        //Verificamos que la posicion de la pelota y Y sea igual a la posicion de la raqueta en Y
        if(pos_y >= lbl_raqueta.getY() - 20){
            //Verificar que la pelota este cerca del eje X
            if(pos_x >= lbl_raqueta.getX() && pos_x <= lbl_raqueta.getX() + lbl_raqueta.getWidth()){
                //Codigo para el calculo de rebote 
                int distancia_desde_centro = pos_x - lbl_raqueta.getX() - (lbl_raqueta.getWidth()/2);
                angulo = 180 - (int)Math.toDegrees(Math.atan((lbl_raqueta.getWidth()/2)/distancia_desde_centro));
                choques++;
                lbl_pelota.setText(choques + "");
            }
        }
        //Definimos el comportamiento de  la pelota cuando choque
        if(pos_y <= 0){
            int complemento = 90 - angulo;
            angulo = 90 + complemento;
            choques++;
            lbl_pelota.setText(choques + "");
        } else if(pos_y >= 500 - 20){
            //lbl_pelota.setVisible(false);
            //this.stop();
            en_ejecucion = false;
        } else if (pos_x <= 0){
            int complemento = 180 - angulo;
            angulo = 180 + complemento;
            choques++;
            lbl_pelota.setText(choques + "");
        } else if (pos_x >= 500 - 20){
            int complemento = 180 - angulo;
            angulo = 180 + complemento;
            choques++;
            lbl_pelota.setText(choques + "");
        }
    }
    
    private void movimiento(){
        //Pasamos los angulos de grados a radianes
        double angulo_en_radianes = Math.toRadians(angulo);
        //Ahora calculamos cuanto se mueve en el eje X
        int pos_x = (int) (Math.sin(angulo_en_radianes) * 10);
        //Hacemos lo mismo con el eje Y
        int pos_y = (int) (Math.cos(angulo_en_radianes) * 10);
        //Modificar la posicion de la pelota
        lbl_pelota.setLocation(lbl_pelota.getX() + pos_x, lbl_pelota.getY() + pos_y);
    }
    
    private void iniciarDatos(){
        angulo = new Random().nextInt(30 + 1) + 30; //Definir un angulo aleatoreo entre 30 - 60
        choques = 0;
        en_ejecucion = true;
    }
    
    public boolean getEn_ejecucion(){
        return en_ejecucion;
    }
     
    public void run(){
        iniciarDatos();
        //this.stop();
        while(en_ejecucion){
            //Vamos a hacer que se mueva cada 100 milisegundos para generar
            //la sensacion de movimiento
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo_movimientoPelota.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            coliciones();
            movimiento();
            //Todo lo que va hacia la derecha (eje X) es positivo
            //Todo lo que va hacia la izquierda (eje X) es negativo
            //Todo lo que va hacia abajo (eje Y) es positivo
            //Todo lo que va hacia arriba (eje Y) es negativo
            //Esto solo en JAVA, no se van a confundir con mate, en mate haganlo como debe de ser >:c
        }
    }
}
