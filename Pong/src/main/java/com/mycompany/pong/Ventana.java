/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pong;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author criss
 */
public class Ventana extends JPanel{
    //Declaramos un label para el manejo del tiempo
    private JLabel lbl_tiempo;
    //Declaramos un label para la pelota
    private JLabel lbl_pelota;
    //Declaramos un label para la raqueta
    private JLabel lbl_raqueta;
    
    
    //Declara constructor para poder inicializar todos los componentes
    public Ventana(){
        //Todo lo necesario para mostrar el JPanel
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(500, 500));
        this.setFocusable(true);
        
        //Configurar el lbl_tiempo
        //Declaramos el lbl_tiempo
        lbl_tiempo = new JLabel("0:0");
        //Definimos la posicion en el JPanel que queremos que tenga el lbl_tiempo
        lbl_tiempo.setLocation(0, 0);
        lbl_tiempo.setSize(50, 50);
        //lbl_tiempo.setBounds(0, 0, 50, 50);
        //Cambiar el color de letra
        lbl_tiempo.setForeground(Color.red);
        //Añadir lbl_tiempo a JPanel
        this.add(lbl_tiempo);
        //Pasamos el lbl_tiempo a la clase Hilo_tiempo
        Hilo_tiempo hilo_tiempo = new Hilo_tiempo(lbl_tiempo);
        
        //Corremos el hilo del tiempo
        hilo_tiempo.start();
        
        //Configurar la raqueta
        lbl_raqueta = new JLabel();
        lbl_raqueta.setBounds(200, 470, 150, 10);
        //Definimos el color de fondo del lbl_raqueta
        lbl_raqueta.setBackground(Color.red);
        //Definimos que el lbl_raqueta se muestre sin necesidad de tener texto
        lbl_raqueta.setOpaque(true);
        this.add(lbl_raqueta);
        
        //Declarar el comportamiento de la raqueta
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) {
                    lbl_raqueta.setLocation(lbl_raqueta.getX() - 10, lbl_raqueta.getY());
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    lbl_raqueta.setLocation(lbl_raqueta.getX() + 10, lbl_raqueta.getY());
                }            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        /*
        //Configuramos el lbl_pelota
        //Declaramos el lbl_pelota
        lbl_pelota = new JLabel();
        lbl_pelota.setBounds(250, 200, 20, 20);
        //Definimos el color de fondo del lbl_pelota
        lbl_pelota.setBackground(Color.lightGray);
        lbl_pelota.setForeground(Color.red);
        //Definimos que el lbl_pelota se muestre sin necesidad de tener texto
        lbl_pelota.setOpaque(true);
        this.add(lbl_pelota);
        
        //Pasamos el lbl_pelota a la clase Hilo_movimientoPelota
        Hilo_movimientoPelota hilo_pelota = new Hilo_movimientoPelota(lbl_pelota, lbl_raqueta);
        //Corremos el hilo del movimiento de la pelota
        hilo_pelota.start();
        */
        
        
        //Ahora si por ejemplo yo quisiera mas pelotas como le haría? :c
        //1 Declaramos un array dinamico
        List<Hilo_movimientoPelota> lista_pelotas = new ArrayList<Hilo_movimientoPelota>();
        //Vamos a declarar unas 5 nuevas pelotas :3
        for (int i = 0; i < 5; i++){
            lista_pelotas.add(new Hilo_movimientoPelota(declararPelotas(), lbl_raqueta));
        }
        //Enviar toda la lista al hilo_pelotas
        Hilo_inicioPelotas hilo_inicioPelotas = new Hilo_inicioPelotas(lista_pelotas, hilo_tiempo);
        hilo_inicioPelotas.start();
        
        
        
        
    }
    
    //Declarar un metodo que me permita crear lbl de pelotas
    private JLabel declararPelotas(){
        JLabel lbl_pelota_new = new JLabel();
        lbl_pelota_new.setBounds(250, 200, 20, 20);
        //Definimos el color de fondo del lbl_pelota
        lbl_pelota_new.setBackground(Color.lightGray);
        lbl_pelota_new.setForeground(Color.red);
        //Definimos que el lbl_pelota se muestre sin necesidad de tener texto
        lbl_pelota_new.setOpaque(true);
        this.add(lbl_pelota_new);
        return lbl_pelota_new;
    }
    
}
